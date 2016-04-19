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
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

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
    
    
    
    
    
    
    
    
    
    
    
    
}
