/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.ServiceInter;

import com.mycompany.loyer.Data.MaisonLoyer;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author oumarou
 */
@Transactional
public interface IMaisonService {
    
    public MaisonLoyer create (MaisonLoyer oMaisonLoyer) throws ServiceException;
    public MaisonLoyer update(MaisonLoyer oMaisonLoyer) throws ServiceException;
    public MaisonLoyer findById(Long id) throws ServiceException;
    public List<MaisonLoyer> findAll() throws ServiceException;
    
    
}
