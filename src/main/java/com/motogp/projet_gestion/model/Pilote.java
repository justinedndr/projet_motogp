package com.motogp.projet_gestion.model;
import jakarta.persistence.*;

@Entity
@Table(name = "pilotes")
public class Pilote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int numero;

    public Pilote(){
    }

    public Pilote(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}
}
