package org.moncef.userservice.mapper;

import org.moncef.userservice.dto.DtoRequestUser;
import org.moncef.userservice.dto.DtoResponseUser;
import org.moncef.userservice.entities.User;

public interface MapperUserIn {

    public User dtoRequestUser (DtoRequestUser dtoRequestUser) ;
    public DtoResponseUser dtoResponseUser (User user) ;
}
