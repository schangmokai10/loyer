/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.ServiceImplement;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.loyer.DaoInter.IAdminLoyer;
import com.mycompany.loyer.Data.AdminLoyer;
import com.mycompany.loyer.ServiceInter.IAdminService;
import com.mycompany.loyer.ServiceInter.ServiceException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author oumarou
 */
@Transactional
public class AdminLoyerService implements IAdminService{
    
    
    IAdminLoyer iAdminLoyer;

    public IAdminLoyer getiAdminLoyer() {
        return iAdminLoyer;
    }

    public void setiAdminLoyer(IAdminLoyer iAdminLoyer) {
        this.iAdminLoyer = iAdminLoyer;
    }
    
    

    public AdminLoyer create(AdminLoyer admin) throws ServiceException {

    try {
            
             return iAdminLoyer.create(admin);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(AdminLoyerService.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    }

    public AdminLoyer update(AdminLoyer admin) throws ServiceException {

    try {
            
             return iAdminLoyer.update(admin);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(AdminLoyerService.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    }

    public AdminLoyer findById(Long id) throws ServiceException {

    try {
            
             return iAdminLoyer.findById(id);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(AdminLoyerService.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    }

    public List<AdminLoyer> findAll() throws ServiceException {

      try {
            
             return iAdminLoyer.findAll();
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(AdminLoyerService.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    }
    
}
