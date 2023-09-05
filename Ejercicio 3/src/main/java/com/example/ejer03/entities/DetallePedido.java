package com.example.ejer03.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
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
public class DetallePedido extends EntidadBase{

    private int cantidad;
    private double subtotal;

    @OneToOne(fetch = FetchType.EAGER)
    private Pedido pedido;
}
