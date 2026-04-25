package com.motogp.projet_gestion.service;

import com.motogp.projet_gestion.model.Equipe;
import com.motogp.projet_gestion.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeService {

    @Autowired
    private EquipeRepository equipeRepository;

    public List<Equipe> getAllEquipes() {
        return equipeRepository.findAll();
    }
    public Equipe createEquipe(Equipe e) {
        return equipeRepository.save(e);
    }
    public Equipe findEquipeById(Long id) {
        return equipeRepository.findById(id).orElse(null);
    }
    public void deleteEquipe(Long id) {
        equipeRepository.deleteById(id);
    }
}