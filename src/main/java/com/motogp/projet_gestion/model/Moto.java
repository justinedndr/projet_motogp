package com.motogp.projet_gestion.model;
import jakarta.persistence.*;

@Entity
@Table(name = "motos")
public class Moto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String constructeur;
    private String modele;

    public Moto(){
    }

    public Moto(String constructeur, String modele) {
        this.constructeur = constructeur;
        this.modele = modele;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getConstructeur() {return constructeur;}
    public void setConstructeur(String constructeur) {this.constructeur = constructeur;}

    public String getModele() {return modele;}
    public void setModele(String modele) {this.modele = modele;}
}