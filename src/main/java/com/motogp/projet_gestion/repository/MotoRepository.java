package com.motogp.projet_gestion.repository;
import com.motogp.projet_gestion.model.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoRepository extends JpaRepository<Moto, Long> {
}