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
    void deveBuscarUsuarioPorId() {
        var expectedId = 2;
        var usuario = repository.findById(expectedId);
        System.out.println("Response\n\n Expected ID: " + expectedId + " --- User ID: " + usuario.getId());
        assertEquals(expectedId, usuario.getId());
    }

    @Test
    void deveBuscarUsuarioPorNome() {
        var nome = "E";
        var usuarios = repository.findByNomeContaining(nome);
        usuarios.forEach(usuario -> {
            System.out.println("Response\n\n Containing: " + nome + " --- User Name: " + usuario.getNome());
            assertTrue(usuario.getNome().contains(nome));
        });
    }

    @Test
    void deveBuscarUsuarioPorEmail() {
        var email = "lucasfelipe@gmail.com";
        var usuario = repository.findByEmail(email);
        System.out.println("Response\n\n Email: " + email + " --- User Email: " + usuario.getEmail());
        assertEquals(email, usuario.getEmail());
    }
}
