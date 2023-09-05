package com.example.ejer03.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rubro extends EntidadBase{

    private String denominacion;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Producto> productos = new ArrayList<>();

}
