package com.example.demosesion4sb.repo;

import com.example.demosesion4sb.modelo.Maestro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaestroRepository extends JpaRepository<Maestro, Integer> {
}
