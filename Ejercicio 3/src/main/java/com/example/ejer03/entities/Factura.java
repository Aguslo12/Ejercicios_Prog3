package com.example.ejer03.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Factura extends EntidadBase {

    //DateTime
    private String fecha;
    private int numero;
    private double descuento;
    //(efectivo - etc)
    private String formaPago;
    private int total;

    @OneToOne(fetch = FetchType.EAGER)
    private Pedido pedido;
}
