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
        registry.addViewController("/inicio").setViewName("PaginaPrincipal");
        registry.addViewController("/").setViewName("PaginaPrincipal");

        // Página Nosotros
        registry.addViewController("/nosotros").setViewName("PaginaNosotros");

        // Página Buscar Lista
        registry.addViewController("/buscar-lista").setViewName("BuscarLista");

        // Página Buscar Mapa
        registry.addViewController("/buscar-mapa").setViewName("BuscarMapa");

        registry.addViewController("/formulario-reserva").setViewName("PaginaFormularioReserva");

        //Pagina Gestion Reserva
        registry.addViewController("/gestion-reserva").setViewName("GestionReserva");

        //Pagina Gestion espacio
        registry.addViewController("/gestion-espacio").setViewName("GestionarEspacio");

        //Pagina Dashboard Afiliados
        registry.addViewController("/dashboard").setViewName("DashboardAfiliados");

        registry.addViewController("/login").setViewName("login");

    }
}
