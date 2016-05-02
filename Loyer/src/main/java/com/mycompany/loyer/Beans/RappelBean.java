/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Beans;

import com.mycompany.loyer.Data.ClientLoyer;
import com.mycompany.loyer.Data.MaisonLoyer;
import com.mycompany.loyer.Data.Rappel;
import com.mycompany.loyer.ServiceInter.IClientService;
import com.mycompany.loyer.ServiceInter.IMaisonService;
import com.mycompany.loyer.ServiceInter.IRappelService;
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
public class RappelBean {
 
    @ManagedProperty(value = "#{IRappelService}")
    private IRappelService iRappelService;
    
    @ManagedProperty(value = "#{IClientService}")
    private IClientService iClientService;
    
    @ManagedProperty(value = "#{IMaisonService}")
    private IMaisonService iMaisonService;
    
    private Date date;
    
    private Long idmaison;
    
    private Long idclient;
    
    private List<ClientLoyer> listeclients;
    
    private List<MaisonLoyer> listemaisons;
        
    private Rappel rappel = new Rappel();

    public RappelBean() {
        idclient = 0L;
        idmaison = 0L;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public IClientService getiClientService() {
        return iClientService;
    }

    public void setiClientService(IClientService iClientService) {
        this.iClientService = iClientService;
    }

    public IMaisonService getiMaisonService() {
        return iMaisonService;
    }

    public void setiMaisonService(IMaisonService iMaisonService) {
        this.iMaisonService = iMaisonService;
    }

    public Long getIdmaison() {
        return idmaison;
    }

    public void setIdmaison(Long idmaison) {
        this.idmaison = idmaison;
    }

    public Long getIdclient() {
        return idclient;
    }

    public void setIdclient(Long idclient) {
        this.idclient = idclient;
    }

    public List<ClientLoyer> getListeclients() throws ServiceException {
        return iClientService.findAll();
    }

    public void setListeclients(List<ClientLoyer> listeclients) {
        this.listeclients = listeclients;
    }

    public List<MaisonLoyer> getListemaisons() throws ServiceException {
        return iMaisonService.findAll();
    }

    public void setListemaisons(List<MaisonLoyer> listemaisons) {
        this.listemaisons = listemaisons;
    }

    
        
        
    public Rappel create () throws ServiceException{   
    ClientLoyer clientLoyer = new ClientLoyer();
    MaisonLoyer maisonLoyer = new MaisonLoyer();
    clientLoyer = iClientService.findById(idclient);
    maisonLoyer= iMaisonService.findById(idmaison);
    rappel.setRapelMaison(maisonLoyer);
    rappel.setRapelClient(clientLoyer);
    rappel.setDateDelvrance(date);
    return iRappelService.create(rappel);
    
    }
    
    
    public Rappel update() throws ServiceException{
    ClientLoyer clientLoyer = new ClientLoyer();
    MaisonLoyer maisonLoyer = new MaisonLoyer();
    clientLoyer = iClientService.findById(idclient);
    maisonLoyer= iMaisonService.findById(idmaison);
    rappel.setRapelMaison(maisonLoyer);
    rappel.setRapelClient(clientLoyer);
    rappel.setDateDelvrance(date);
    return iRappelService.update(rappel);
    }
 
    public Rappel findById() throws ServiceException{
    
    return iRappelService.findById(rappel.getId());
    
    }
    
    
    
    public List<Rappel> findAll() throws ServiceException{
    
        
        
    return iRappelService.findAll();
    
    }  
    
}
