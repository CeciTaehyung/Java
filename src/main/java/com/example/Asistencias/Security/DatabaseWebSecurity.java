package com.example.Asistencias.Security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
public class DatabaseWebSecurity {
    @Bean
    public UserDetailsManager customUser(DataSource dataSource) {
        JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);

        // Query to fetch user details (username, password, and account status)
        users.setUsersByUsernameQuery(
                "select login as username, clave as password, status as enabled from usuarios where login = ?"
        );

        // Query to fetch authorities/roles for the user
        users.setAuthoritiesByUsernameQuery(
                "select u.login as username, r.nombre as authority from usuario_rol ur " +
                        "inner join usuarios u on u.id = ur.usuario_id " +
                        "inner join roles r on r.id = ur.rol_id " +
                        "where u.login = ?"
        );

        return users;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        http.authorizeHttpRequests(authorize -> authorize
        //aperturar el acceso a los recursos estaticos
                        .requestMatchers("/dist/**", "/plubigins/**").permitAll()
                //las vistas publicas no requieren autenticacion
                        .requestMatchers("/", "/privacy", "/terms").permitAll()
                //todas las demas vistas requieren autenticacion
                        .anyRequest().authenticated());
        http.formLogin(form->form.permitAll());

        return http.build();
    }
}
