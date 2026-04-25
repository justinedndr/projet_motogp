package com.motogp.projet_gestion.service;

import com.motogp.projet_gestion.model.Pilote;
import com.motogp.projet_gestion.repository.PiloteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PiloteService {

    @Autowired
    private PiloteRepository piloteRepository;

    public List<Pilote> getAllPilotes() {
        return piloteRepository.findAll();
    }
    public Pilote createPilote(Pilote p) {
        return piloteRepository.save(p);
    }
    public Pilote findPiloteById(Long id) {
        return piloteRepository.findById(id).orElse(null);
    }
    public void deletePilote(Long id) {
        piloteRepository.deleteById(id);
    }
}