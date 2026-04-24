package com.motogp.projet_gestion.repository;
import com.motogp.projet_gestion.model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}