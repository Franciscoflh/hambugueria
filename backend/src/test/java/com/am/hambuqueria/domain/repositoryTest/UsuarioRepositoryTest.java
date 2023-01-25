package com.am.hambuqueria.domain.repositoryTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.am.hambuqueria.domain.model.Usuario;
import com.am.hambuqueria.domain.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UsuarioRepositoryTest {
    @Autowired
    private UsuarioRepository repository;

    @Test
    void deveBuscarUsuarioPorNome(){
        var nome = "L";
        var usuarios = repository.findByNomeContaining(nome);

        usuarios.forEach( usuario -> {
            assertTrue(usuario.getNome().contains(nome));
        });
    }

    @Test
    void deveBuscarUsuarioPorEmail(){
        var email = "lucasfelipe@gmail.com";
        var usuario = repository.findByEmail(email);

        assertEquals(email, usuario.getEmail());
    }
}
