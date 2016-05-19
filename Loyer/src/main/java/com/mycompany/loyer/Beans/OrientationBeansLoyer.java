/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author oumarou
 */
@ManagedBean
@RequestScoped
public class OrientationBeansLoyer {

    public OrientationBeansLoyer() {
    }

    public String accueil() {
        return "accueil";

    }

    public String admin() {
        return "admin";

    }

    public String client() {
        return "client";
    }

    public String location() {
        return "location";
    }

    public String maison() {
        return "maison";
    }

    public String rappel() {
        return "rappel";
    }

    public String paye() {

        return "paye";
    }

}
