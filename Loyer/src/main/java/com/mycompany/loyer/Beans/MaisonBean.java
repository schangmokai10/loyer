/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Beans;

import com.mycompany.loyer.Data.MaisonLoyer;
import com.mycompany.loyer.ServiceInter.IMaisonService;
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
public class MaisonBean {
    
    @ManagedProperty(value = "#{IMaisonService}")
    private IMaisonService iMaisonService;
    
    private MaisonLoyer maisonLoyer = new MaisonLoyer();

    public MaisonBean() {
    }

    public IMaisonService getiMaisonService() {
        return iMaisonService;
    }

    public MaisonLoyer getMaisonLoyer() {
        return maisonLoyer;
    }

    public void setMaisonLoyer(MaisonLoyer maisonLoyer) {
        this.maisonLoyer = maisonLoyer;
    }

    public void setiMaisonService(IMaisonService iMaisonService) {
        this.iMaisonService = iMaisonService;
    }
     
    public MaisonLoyer create () throws ServiceException{
    
        
    return iMaisonService.create(maisonLoyer);
    
    }
    
    
    public MaisonLoyer update() throws ServiceException{
    
    
    return iMaisonService.update(maisonLoyer);
    }
 
    public MaisonLoyer findById() throws ServiceException{
    
    return iMaisonService.findById(maisonLoyer.getId());
    
    }
    
    
    
    public List<MaisonLoyer> findAll() throws ServiceException{     
       return iMaisonService.findAll();  
    }
    
       
    
}
