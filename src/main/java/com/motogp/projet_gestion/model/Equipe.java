package com.motogp.projet_gestion.model;
import jakarta.persistence.*;

@Entity
@Table(name = "equipes")
public class Equipe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String marque;

    public Equipe(){
    }

    public Equipe(String nom, String marque) {
        this.nom = nom;
        this.marque = marque;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public String getMarque() {return marque;}
    public void setMarque(String marque) {this.marque = marque;}
}