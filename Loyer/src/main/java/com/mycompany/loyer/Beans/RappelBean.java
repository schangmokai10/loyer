/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Beans;

import com.mycompany.loyer.Data.Rappel;
import com.mycompany.loyer.ServiceInter.IRappelService;
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
public class RappelBean {
 
    @ManagedProperty(value = "#{IRappelService}")
    private IRappelService iRappelService;
        
    private Rappel rappel = new Rappel();

    public RappelBean() {
    }

    public IRappelService getiRappelService() {
        return iRappelService;
    }

    public void setiRappelService(IRappelService iRappelService) {
        this.iRappelService = iRappelService;
    }

    public Rappel getRappel() {
        return rappel;
    }

    public void setRappel(Rappel rappel) {
        this.rappel = rappel;
    }

    
        
        
    public Rappel create () throws ServiceException{    
    return iRappelService.create(rappel);
    
    }
    
    
    public Rappel update() throws ServiceException{
    
    
    return iRappelService.update(rappel);
    }
 
    public Rappel findById() throws ServiceException{
    
    return iRappelService.findById(rappel.getId());
    
    }
    
    
    
    public List<Rappel> findAll() throws ServiceException{
    
        
        
    return iRappelService.findAll();
    
    }  
    
}
