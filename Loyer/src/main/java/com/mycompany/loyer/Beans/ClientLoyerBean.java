/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Beans;

import com.mycompany.loyer.DaoInter.IClientLoyer;
import com.mycompany.loyer.Data.ClientLoyer;
import com.mycompany.loyer.ServiceInter.IClientService;
import com.mycompany.loyer.ServiceInter.ServiceException;
import java.util.Date;
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
public class ClientLoyerBean {
    
    @ManagedProperty(value = "#{IClientService}")
    IClientService iClientService;
    
    private ClientLoyer clientLoyer = new ClientLoyer();
    
    Date date = new Date();

    public ClientLoyerBean() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public IClientService getiClientService() {
        return iClientService;
    }

    public void setiClientService(IClientService iClientService) {
        this.iClientService = iClientService;
    }

    public ClientLoyer getClientLoyer() {
        return clientLoyer;
    }

    public void setClientLoyer(ClientLoyer clientLoyer) {
        this.clientLoyer = clientLoyer;
    }
    
    public ClientLoyer create () throws ServiceException{
       clientLoyer.setDateLivraison(date);
       return iClientService.create(clientLoyer);
    }
    public ClientLoyer update() throws ServiceException{
       return iClientService.update(clientLoyer);
    }
    public ClientLoyer findById() throws ServiceException{
       return iClientService.findById(clientLoyer.getId());
    }
    public List<ClientLoyer> findAll() throws ServiceException{
       return iClientService.findAll();
    }
}
