/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.ServiceImplement;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.loyer.DaoInter.IPayerLoyer;
import com.mycompany.loyer.Data.PayeLoyer;
import com.mycompany.loyer.ServiceInter.IPayeLoyerService;
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
public class PayeLoyerService  implements IPayeLoyerService{
    
    IPayerLoyer iPayerLoyer;

    public IPayerLoyer getiPayerLoyer() {
        return iPayerLoyer;
    }

    public void setiPayerLoyer(IPayerLoyer iPayerLoyer) {
        this.iPayerLoyer = iPayerLoyer;
    }
    
    
    

    public PayeLoyer create(PayeLoyer paye) throws ServiceException {

       try {
            
             return iPayerLoyer.create(paye);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(PayeLoyerService.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    }

    public PayeLoyer update(PayeLoyer paye) throws ServiceException {

    
        try {
            
             return iPayerLoyer.update(paye);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(PayeLoyerService.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    }

    public PayeLoyer findById(Long id) throws ServiceException {

        try {
            
             return iPayerLoyer.findById(id);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(PayeLoyerService.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    }

    public List<PayeLoyer> findAll() throws ServiceException {

    
        try {
            
             return iPayerLoyer.findAll();
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(PayeLoyerService.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    }
    
}
