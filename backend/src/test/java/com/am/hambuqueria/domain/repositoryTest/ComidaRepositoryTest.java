package com.am.hambuqueria.domain.repositoryTest;

import com.am.hambuqueria.domain.repository.ComidaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class ComidaRepositoryTest {
    @Autowired
    private ComidaRepository repository;

    @Test
    void deveListarTodasComidas() {
        var comida = repository.findAll();
        assertTrue(comida.isEmpty());
    }

    @Test
    void deveBuscarComidaPorId() {
        var expectedId = 1;
        var comida = repository.findById(expectedId);
        System.out.println("Response\n\n Expected ID: " + expectedId + " --- Burguer ID: " + comida.getId());
        assertEquals(expectedId, comida.getId());
    }

    @Test
    void deveBuscarComidaPorNome() {
        var containing = "T";
        var comidas = repository.findByNomeContaining(containing);
        comidas.forEach(comida -> {
            System.out.println("Response\n\n Containing: " + containing + " --- Burguer Name: " + comida.getNome());
            assertTrue(comida.getNome().contains(containing));
        });
    }
}
