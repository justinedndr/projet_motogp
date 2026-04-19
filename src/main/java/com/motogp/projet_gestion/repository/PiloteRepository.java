package com.motogp.projet_gestion.repository;
import com.motogp.projet_gestion.model.Pilote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PiloteRepository extends JpaRepository<Pilote, Long> {
}
