package org.moncef.userservice.mapper;

import org.moncef.userservice.dto.DtoRequestUser;
import org.moncef.userservice.dto.DtoResponseUser;
import org.moncef.userservice.entities.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
@Component
public class MapperUserImp implements MapperUserIn {
    @Override
    public User dtoRequestUser(DtoRequestUser dtoRequestUser) {
        User user = new User() ;
        BeanUtils.copyProperties(dtoRequestUser, user);
        return user;
    }

    @Override
    public DtoResponseUser dtoResponseUser(User user) {
        DtoResponseUser dtoResponseUser = new DtoResponseUser() ;
        BeanUtils.copyProperties(user,dtoResponseUser);
        return dtoResponseUser;
    }
}
