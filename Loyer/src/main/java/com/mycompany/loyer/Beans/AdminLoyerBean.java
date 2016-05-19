/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Beans;

import com.mycompany.loyer.Data.AdminLoyer;
import com.mycompany.loyer.ServiceInter.IAdminService;
import com.mycompany.loyer.ServiceInter.ServiceException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.primefaces.context.RequestContext;

/**
 *
 * @author oumarou
 */

@ManagedBean
@RequestScoped
public class AdminLoyerBean {
    
    @ManagedProperty(value = "#{IAdminService}")   
    private IAdminService iAdminService;
    
    private AdminLoyer admins = new AdminLoyer();

    public AdminLoyerBean() {
    }

    public IAdminService getiAdminService() {
        return iAdminService;
    }

    public void setiAdminService(IAdminService iAdminService) {
        this.iAdminService = iAdminService;
    }

    public AdminLoyer getAdmins() {
        return admins;
    }

    public void setAdmins(AdminLoyer admins) {
        this.admins = admins;
    }
    
    
    
    
    
    
    
    public AdminLoyer create () throws ServiceException{
    
        
    return iAdminService.create(admins);
    
    }
    
    
    public AdminLoyer update() throws ServiceException{
    
    
    return iAdminService.update(admins);
    }
 
    public AdminLoyer findById() throws ServiceException{
    
    return iAdminService.findById(admins.getId());
    
    }
    
    
    
    public List<AdminLoyer> findAll() throws ServiceException{
    
           List<AdminLoyer> liste = iAdminService.findAll();
        for (AdminLoyer col : liste) {
            System.out.println("****************" + col.getNom()+"*********************");

            }
        
    return iAdminService.findAll();
    
    }
    
    
    
    
    
    public String connection(){
        
         try {
           
            List<AdminLoyer> list = iAdminService.findAll();
            for (AdminLoyer list1 : list) {
                if((list1.getLogin().equals(admins.getLogin()))&&(list1.getPasswd().equals(admins.getPasswd()))){
                    return "admin";
                }
                
            }
               
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "erreur", "Login ou passwd incorrect.");
             RequestContext.getCurrentInstance().showMessageInDialog(message);
             return " ";
           
        } catch (ServiceException ex) {
            Logger.getLogger(AdminLoyerBean.class.getName()).log(Level.SEVERE, null, ex);
          
   }
         return null;
        
        
    
    
    
    }
    
    
    public String deconnection(){
    
    
      return "accueil";
    }
    
    
    
    
}
