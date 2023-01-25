package com.am.hambuqueria.domain.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_pedido")
    private Integer id;

    private Integer num_pedido;

    @ManyToOne
    @JoinColumn(name = "codigo_usuario", referencedColumnName = "codigo_usuario")
    private Usuario usuario;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "burguer_pedido",
            joinColumns = {@JoinColumn(name = "codigo_burguer")},
            inverseJoinColumns = {@JoinColumn(name = "codigo_pedido")}
    )
    private Set<Hambuguer> hambuguers = new HashSet<Hambuguer>();
}
