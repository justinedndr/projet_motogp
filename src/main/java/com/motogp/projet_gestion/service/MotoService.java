package com.motogp.projet_gestion.service;

import com.motogp.projet_gestion.model.Moto;
import com.motogp.projet_gestion.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoService {

    @Autowired
    private MotoRepository motoRepository;

    public List<Moto> getAllMotos() {
        return motoRepository.findAll();
    }
    public Moto createMoto(Moto m) {
        return motoRepository.save(m);
    }
    public Moto findMotoById(Long id) {
        return motoRepository.findById(id).orElse(null);
    }
    public void deleteMoto(Long id) {
        motoRepository.deleteById(id);
    }
}