package com.am.hambuqueria.domain.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Hambuguer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_burguer")
    private Integer id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String nome;

    private String descrição;

    @NotBlank
    private Integer preco;

    @NotBlank
    private String ingredientes;

    //@ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    //@JoinColumn(name = "codigo_usuario", referencedColumnName = "codigo_usuario")
    //private List<Usuario> usuario;
}
