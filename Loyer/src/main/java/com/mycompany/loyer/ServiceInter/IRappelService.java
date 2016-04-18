/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.ServiceInter;

import com.mycompany.loyer.Data.Rappel;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author oumarou
 */
@Transactional
public interface IRappelService {
    
     public Rappel create (Rappel rappel) throws ServiceException;
    public Rappel update(Rappel rappel) throws ServiceException;
    public Rappel findById(Long id) throws ServiceException;
    public List<Rappel> findAll() throws ServiceException;
    
    
}
