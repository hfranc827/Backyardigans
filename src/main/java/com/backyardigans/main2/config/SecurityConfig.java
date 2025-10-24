package com.backyardigans.main2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                // ✅ Recursos estáticos públicos
                .requestMatchers(
                    "/css/**",
                    "/image/**",
                    "/js/**"
                ).permitAll()

                // ✅ Rutas públicas de navegación
                .requestMatchers("/", "/inicio", "/nosotros", "/buscar-lista", "api/distritos", "/buscar-mapa","/formulario-reserva", "/registro/**").permitAll()

                // 🔐 Rutas protegidas - requieren autenticación
                .requestMatchers("/afiliado-reserva/**", "/gestion-espacio", "/dashboard", "/afiliados/**").authenticated()

                // ⚠️ Todo lo demás requiere login
                .anyRequest().authenticated()
            )
            // 🔐 Página de login personalizada
            .formLogin(form -> form
                .loginPage("/login")   // Debes tener la vista `login.html`
                .permitAll()
            )
            // 🚪 Logout
            .logout(logout -> logout
                .logoutSuccessUrl("/inicio")
                .permitAll()
            );

        return http.build();
    }
}
