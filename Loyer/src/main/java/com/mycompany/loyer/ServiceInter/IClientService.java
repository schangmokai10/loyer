/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.ServiceInter;

import com.mycompany.loyer.Data.ClientLoyer;
import com.mycompany.loyer.Data.Location;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author oumarou
 */
@Transactional
public interface IClientService {
    
    public ClientLoyer create (ClientLoyer oClientLoyer) throws ServiceException;
    public ClientLoyer update(ClientLoyer oClientLoyer) throws ServiceException;
    public ClientLoyer findById(Long id) throws ServiceException;
    public List<ClientLoyer> findAll() throws ServiceException;
    
}
