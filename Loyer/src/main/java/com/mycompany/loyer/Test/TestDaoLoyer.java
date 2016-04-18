/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Test;

import com.douwe.generic.dao.DataAccessException;
import com.douwe.generic.dao.impl.GenericDao;
import com.mycompany.loyer.DaoImpl.AdminLoyerDaoImpl;
import com.mycompany.loyer.DaoImpl.MaisonDaoImpl;
import com.mycompany.loyer.DaoInter.IAdminLoyer;
import com.mycompany.loyer.DaoInter.IMaisonLoyer;
import com.mycompany.loyer.Data.AdminLoyer;
import com.mycompany.loyer.Data.MaisonLoyer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author oumarou
 */
public class TestDaoLoyer {
    

    public static void main(String[] args) throws DataAccessException{
        
         EntityManagerFactory enf = Persistence.createEntityManagerFactory("loyerPU");
         EntityManager em = enf.createEntityManager();
         IAdminLoyer iadmin = new AdminLoyerDaoImpl();
         IMaisonLoyer imaison = new MaisonDaoImpl();
        
         ((GenericDao) iadmin).setManager(em);
         EntityTransaction tx = em.getTransaction();
         
         tx.begin();
         MaisonLoyer omaison = new MaisonLoyer();
        
         AdminLoyer admin = new AdminLoyer();
         admin.setLogin("login");
         admin.setPasswd("passwd");
         admin.setNom("aicha");
         admin.setPrenom("brahim");
         System.out.println("hello c'est le main de la Dao");

         iadmin.create(admin);
         tx.commit();
        
        
//        omaison.setAdresse("avenu des banques");
//        omaison.setListLocation(null);
//        omaison.setNumeroBatiment(125L);
//        imaison.create(omaison);
  }
}
