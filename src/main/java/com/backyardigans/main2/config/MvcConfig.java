package com.backyardigans.main2.config;

import org.springframework.lang.NonNull;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(@NonNull ViewControllerRegistry registry) {
        // Página principal
        registry.addViewController("/inicio").setViewName("public/pagina-principal");
        registry.addViewController("/").setViewName("public/pagina-principal");

        // Página Nosotros
        registry.addViewController("/nosotros").setViewName("public/pagina-nosotros");

        // Página Buscar Lista
        registry.addViewController("/buscar-lista").setViewName("public/buscar-lista");

        // Página Buscar Mapa
        registry.addViewController("/buscar-mapa").setViewName("public/buscar-mapa");

        registry.addViewController("/pagina-espacio").setViewName("public/pagina-espacio");

        //Pagina Gestion Reserva
        registry.addViewController("/gestion-reserva").setViewName("gestion-reserva");

        //Pagina Gestion espacio
        registry.addViewController("/gestion-espacio").setViewName("GestionarEspacio");

        //Pagina Dashboard Administradores
        registry.addViewController("/control-administrador").setViewName("administrador/dashboard-administrador");
        //Pagina Dashboard Afiliados
        registry.addViewController("/control-afiliados").setViewName("afiliados/dashboard-afiliados");
        //Pagina Dashboard Usuarios
        registry.addViewController("/control-usuarios").setViewName("usuarios/dashboard-usuarios");

        registry.addViewController("/pagina-registro").setViewName("public/pagina-registro");
        
        registry.addViewController("/pagina-login").setViewName("public/pagina-login");

        registry.addViewController("/banner-administrador").setViewName("banner");

        registry.addViewController("/datos-administrador").setViewName("datos");

    



    }
}
