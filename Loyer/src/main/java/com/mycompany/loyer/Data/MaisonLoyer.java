/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Data;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author oumarou
 */
@Entity
public class MaisonLoyer {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Column
    private String Adresse;
    @Column
    private Long numeroBatiment;

   @OneToMany(mappedBy = "locationMaison")
    private List<Location> listLocation;
   
   @OneToMany(mappedBy = "PayeMaison")
    private List<PayeLoyer> listPaye;
    
  
    
    @OneToMany(mappedBy = "RapelMaison")
    private List<Rappel> listRappels;
          
    public MaisonLoyer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public Long getNumeroBatiment() {
        return numeroBatiment;
    }

    public void setNumeroBatiment(Long numeroBatiment) {
        this.numeroBatiment = numeroBatiment;
    }

    public List<Location> getListLocation() {
        return listLocation;
    }

    public void setListLocation(List<Location> listLocation) {
        this.listLocation = listLocation;
    }

    public List<Rappel> getListRappels() {
        return listRappels;
    }

    public void setListRappels(List<Rappel> listRappels) {
        this.listRappels = listRappels;
    }

    public List<PayeLoyer> getListPaye() {
        return listPaye;
    }

    public void setListPaye(List<PayeLoyer> listPaye) {
        this.listPaye = listPaye;
    }
    
    
    
    
}
