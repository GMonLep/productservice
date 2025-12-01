package com.perfulandia.productservice.config;
import com.perfulandia.productservice.repository.ProductoRepository;
import com.perfulandia.productservice.model.Producto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Creacion {
    @Bean
    CommandLineRunner initDatabase(ProductoRepository repository) {
        return args -> {
            //iniciamos la cuenta vacia pq la base de datos va a estar vacia
            if (repository.count() == 0) {
                repository.save(Producto.builder()
                        .nombre("Baconator Onion Individual")
                        .precio(8500)
                        .urlImagen("https://tofuu.getjusto.com/orioneat-local/resized2/7uKG4YoqtN3pbHGEx-300-x.webp")
                        .build());

                repository.save(Producto.builder()
                        .nombre("Trio Cheese Burger 50%")
                        .precio(10990)
                        .urlImagen("https://tofuu.getjusto.com/orioneat-local/resized2/uoeHjryGcfRecqwrw-300-x.webp")
                        .build());

                repository.save(Producto.builder()
                        .nombre("Biggie Box Tenders Daves")
                        .precio(12500)
                        .urlImagen("https://tofuu.getjusto.com/orioneat-local/resized2/6ZXT9f2QQbvNdsXBR-300-x.webp")
                        .build());

                repository.save(Producto.builder()
                        .nombre("Papa Fried Bacon Cheddar")
                        .precio(3500)
                        .urlImagen("https://tofuu.getjusto.com/orioneat-local/resized2/7uKG4YoqtN3pbHGEx-300-x.webp")
                        .build());

                repository.save(Producto.builder()
                        .nombre("Duo Box Daves")
                        .precio(18500)
                        .urlImagen("https://tofuu.getjusto.com/orioneat-local/resized2/g8wvyR6P6yvEjvReh-300-x.webp")
                        .build());

                repository.save(Producto.builder()
                        .nombre("Box 4x4")
                        .precio(23990)
                        .urlImagen("https://tofuu.getjusto.com/orioneat-local/resized2/nmg2oLNs3r5cmAwCC-300-x.webp")
                        .build());

                System.out.println("Productos creados");
            } else {
                System.out.println("Productos ya existen. No se agregaron");
            }
        };
}}
