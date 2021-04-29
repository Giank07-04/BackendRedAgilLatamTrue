package com.example.demosesion4sb.repo;

import com.example.demosesion4sb.modelo.Asesor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AsesorRepository extends JpaRepository<Asesor, Integer> {
    Optional<Asesor> findOneByEmail(String email);
}
