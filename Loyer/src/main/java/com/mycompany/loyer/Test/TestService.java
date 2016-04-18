/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Test;

import com.mycompany.loyer.Data.AdminLoyer;
import com.mycompany.loyer.ServiceInter.IAdminService;
import com.mycompany.loyer.ServiceInter.ServiceException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author oumarou
 */
public class TestService {
    
    
    public static void main(String[] args) throws ServiceException {
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:Spring-Config.xml");
        IAdminService service = ctx.getBean("IAdminService", IAdminService.class);
        //IDepartementService servi = ctx.getBean("IDepartementService", IDepartementService.class);
//        IMotCleService servis = ctx.getBean("IMotCleService", IMotCleService.class);
//        IEtudiantService etu = ctx.getBean("IEtudiantService", IEtudiantService.class);
//        IAdminService admins = ctx.getBean("IAdminSevice", IAdminService.class);
        AdminLoyer adm =  new AdminLoyer();
 
        adm.setLogin("login2");
        adm.setPasswd("paswd2");
        adm.setNom("ami");
        adm.setPrenom("Brahim");
        service.create(adm);

             System.out.println(adm.getNom());
       
       
       
    }
        
        
    }
