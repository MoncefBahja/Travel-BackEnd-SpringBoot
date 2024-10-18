package org.moncef.userservice.service;

import org.moncef.userservice.dto.DtoRequestUser;
import org.moncef.userservice.dto.DtoResponseUser;

import java.util.List;

public interface ServiceUserIn {
    public void create (DtoRequestUser dtoRequestUser) ;
    public List<DtoResponseUser> read () ;
    public DtoResponseUser readById (Long id ) ;
    public void update (Long id , DtoRequestUser dtoRequestUser) ;
    public void delete (Long id );

}
