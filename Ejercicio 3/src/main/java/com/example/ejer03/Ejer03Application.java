package com.example.ejer03;

import com.example.ejer03.entities.*;
import com.example.ejer03.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootApplication
public class Ejer03Application {

    @Autowired
    ClienteRepository clienteRepositorio;

    @Autowired
    ConfiguracionGeneralRepository configuracionGeneralRepositorio;

    @Autowired
    DetallePedidoRepository detallePedidoRepositorio;

    @Autowired
    DomicilioRepository domicilioRepositorio;

    @Autowired
    FacturaRepository facturaRepositorio;

    @Autowired
    PedidoRepository pedidoRepositorio;

    @Autowired
    ProductoRepository productoRepositorio;

    @Autowired
    RubroRepository rubroRepositorio;

    @Autowired
    UsuarioRepository usuarioRepositorio;

    public static void main(String[] args) {
        SpringApplication.run(Ejer03Application.class, args);
    }

    @Bean
    CommandLineRunner demo() {
        return args -> {

            //Patrón de diseño builder
            Usuario usuario = Usuario.builder()
                    .nombre("Juan Cruz Castellanos")
                    .password("ChinchulinArrugado")
                    .build();
            // Guardar el objeto en la base de datos
            usuarioRepositorio.save(usuario);

            Domicilio domicilio = Domicilio.builder()
                    .calle("Tapon Moyano")
                    .numero("2070")
                    .localidad("Guaymallen")
                    .build();
            // Guardar el objeto en la base de datos
            domicilioRepositorio.save(domicilio);

            Pedido pedido = Pedido.builder()
                    .fecha("05/09/2023")
                    .usuario(usuario)
                    .domicilio(domicilio)
                    .tipoEnvio("Por mar")
                    .estado("Aduana")
                    .horaEstimadaEntrega("00:00")
                    .build();
            // Guardar el objeto en la base de datos
            pedidoRepositorio.save(pedido);

            Producto producto = Producto.builder()
                    .denominacion("Hamburguesa SMASH")
                    .precioCompra(1200)
                    .stockAnual(2000)
                    .stockMinimo(500)
                    .tiempoEstimadoCocina(30)
                    .precioVenta(2500)
                    .receta("Carne, Pan")
                    .build();
            // Guardar el objeto en la base de datos
            productoRepositorio.save(producto);


            Rubro rubro = Rubro.builder()
                    .denominacion("Alimento")
                    .build();
            // Guardar el objeto en la base de datos
            rubroRepositorio.save(rubro);


            try {
                Optional<Pedido> pedidoRecuperado = pedidoRepositorio.findById(pedido.getId());
                if (pedidoRecuperado.isPresent()) {
                    Pedido pedido1 = pedidoRecuperado.get();
                    System.out.println(pedido1);
                }
            } catch (Exception e) {
                System.out.println("Error en PEDIDO");
                System.out.println(e.getMessage());
            }

            try {
                Optional<Domicilio> domicilioRecuperado = domicilioRepositorio.findById(pedido.getId());
                if (domicilioRecuperado.isPresent()) {
                    Domicilio domicilio1 = domicilioRecuperado.get();
                    System.out.println(domicilio1);
                }
            } catch (Exception e) {
                System.out.println("Error en DOMICILIO");
                System.out.println(e.getMessage());
            }

            try {
                Optional<Producto> productoRecuperado = productoRepositorio.findById(pedido.getId());
                if (productoRecuperado.isPresent()) {
                    Producto producto1 = productoRecuperado.get();
                    System.out.println(producto1);
                }
            } catch (Exception e) {
                System.out.println("Error en PRODUCTO");
                System.out.println(e.getMessage());
            }

            try {
                Optional<Rubro> rubroRecuperado = rubroRepositorio.findById(pedido.getId());
                if (rubroRecuperado.isPresent()) {
                    Rubro rubro1 = rubroRecuperado.get();
                    System.out.println(rubro1);
                }
            } catch (Exception e) {
                System.out.println("Error en RUBRO");
                System.out.println(e.getMessage());
            }

            try {
                Optional<Usuario> usuarioRecuperado = usuarioRepositorio.findById(pedido.getId());
                if (usuarioRecuperado.isPresent()) {
                    Usuario usuario1 = usuarioRecuperado.get();
                    System.out.println(usuario1);

                }
            } catch (Exception e) {
                System.out.println("Error en USUARIO");
                System.out.println(e.getMessage());
            }
            System.out.println("SEX");

        };
    }

}


