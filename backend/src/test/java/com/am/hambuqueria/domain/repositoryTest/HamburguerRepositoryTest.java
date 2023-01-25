package com.am.hambuqueria.domain.repositoryTest;

import com.am.hambuqueria.domain.repository.HamburguerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class HamburguerRepositoryTest {
    @Autowired
    private HamburguerRepository repository;

    @Test
    void deveBuscarBurguerPorId() {
        var expectedId = 1;
        var hamburguer = repository.findById(expectedId);
        System.out.println("Response\n\n Expected ID: " + expectedId + " --- Burguer ID: " + hamburguer.getId());
        assertEquals(expectedId, hamburguer.getId());
    }

    @Test
    void deveBuscarBurguerPorNome() {
        var containing = "T";
        var hamburguers = repository.findByNomeContaining(containing);
        hamburguers.forEach( hambuguer -> {
            System.out.println("Response\n\n Containing: " + containing + " --- Burguer Name: " + hambuguer.getNome());
            assertTrue(hambuguer.getNome().contains(containing));
        });
    }
}
