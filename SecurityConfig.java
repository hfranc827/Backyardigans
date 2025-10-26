package com.backyardigans.main2.config;

import java.io.IOException;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.core.Authentication;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/css/**", "/image/**", "/js/**").permitAll()
                .requestMatchers("/", "/public/**", 
                                    "/pagina-espacio",
                                    "/banner-administrador",
                                    "/gestion-reserva",
                                    "/nosotros",
                                    "/buscar-lista",
                                    "/buscar-mapa", 
                                    "/pagina-registro", 
                                    "/datos-administrador",
                                    "/api/distritos", 
                                    "/registro", 
                                    "/pagina-login").permitAll()
                                    
                .requestMatchers("/control-admin/**").hasRole("ADMIN")
                .requestMatchers("/control-afiliados/").hasAnyRole("ADMIN", "AFILIADO")
                .requestMatchers("/control-usuario/**").hasAnyRole("ADMIN", "USER")
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/pagina-login")
                .loginProcessingUrl("/pagina-login") // 🔹 Importante: Spring Security procesará este POST
                .successHandler(customSuccessHandler())
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/inicio")
                .permitAll()
            );

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationSuccessHandler customSuccessHandler() {
        return (request, response, authentication) -> {
            String redirectUrl = "/inicio";
            var authorities = authentication.getAuthorities();
            for (var auth : authorities) {
                switch (auth.getAuthority()) {
                    case "ADMIN" -> redirectUrl = "/control-administrador";
                    case "AFILIADO" -> redirectUrl = "/control-afiliados";
                    case "USER" -> redirectUrl = "/control-usuarios";
                }
            }
            response.sendRedirect(redirectUrl);
        };
    }
}
