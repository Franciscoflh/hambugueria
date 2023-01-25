package com.am.hambuqueria.domain.repository;

import com.am.hambuqueria.domain.model.Comida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HamburguerRepository extends JpaRepository<Comida, Integer> {
    Comida findById(@NonNull int expectedId);

    List<Comida> findByNomeContaining(@NonNull String nome);

}