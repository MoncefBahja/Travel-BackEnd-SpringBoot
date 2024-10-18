package org.moncef.userservice.service;
import jakarta.transaction.Transactional;
import org.moncef.userservice.dto.DtoRequestUser;
import org.moncef.userservice.dto.DtoResponseUser;
import org.moncef.userservice.entities.User;
import org.moncef.userservice.mapper.MapperUserIn;
import org.moncef.userservice.repo.RepoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Transactional
@Service
public class ServiceUserImp implements  ServiceUserIn{

    @Autowired
    MapperUserIn mapperUserIn ;
    @Autowired
    RepoUser repoUser ;
    @Override
    public void create(DtoRequestUser dtoRequestUser) {
        repoUser.save(mapperUserIn.dtoRequestUser(dtoRequestUser) );

    }


    @Override
    public List<DtoResponseUser> read() {
        List<User> users = new ArrayList<>() ;
        users = repoUser.findAll() ;
        List<DtoResponseUser> dtoResponseUsers = new ArrayList<>( ) ;
        for (User user : users ){
            DtoResponseUser dtoResponseUser = mapperUserIn.dtoResponseUser(user) ;
            dtoResponseUsers.add(dtoResponseUser);
        }
        return dtoResponseUsers ;
    }

    @Override
    public DtoResponseUser readById(Long id) {
      User   user = repoUser.findById(id).get();
          DtoResponseUser dtoResponseUser = mapperUserIn.dtoResponseUser(user) ;
        return dtoResponseUser;
    }

    @Override
    public void update(Long id, DtoRequestUser dtoRequestUser) {
        User user = repoUser.findById(id).get();
        if(user.getFirstName()!=null) user.setFirstName(dtoRequestUser.getFirstName());
        if(user.getLastName()!=null) user.setLastName(dtoRequestUser.getLastName());
        if(user.getEmail()!=null) user.setEmail(dtoRequestUser.getEmail());
        if(user.getPassword()!=null) user.setPassword(dtoRequestUser.getPassword());
        if(user.getRole()!=null) user.setRole(dtoRequestUser.getRole());
        repoUser.save(user) ;

    }

    @Override
    public void delete(Long id) {
        repoUser.deleteById(id);

    }
}
