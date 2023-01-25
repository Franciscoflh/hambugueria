package com.am.hambuqueria.domain.repository;

import com.am.hambuqueria.domain.model.Hambuguer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HamburguerRepository extends JpaRepository<Hambuguer, Integer> {
    Hambuguer findById(@NonNull int expectedId);

    List<Hambuguer> findByNomeContaining(@NonNull String nome);

}