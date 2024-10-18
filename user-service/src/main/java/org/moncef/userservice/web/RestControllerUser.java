package org.moncef.userservice.web;

import org.moncef.userservice.dto.DtoRequestUser;
import org.moncef.userservice.dto.DtoResponseUser;
import org.moncef.userservice.repo.RepoUser;
import org.moncef.userservice.service.ServiceUserIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
//@CrossOrigin("*")
public class RestControllerUser {

    @Autowired
    RepoUser repoUser ;
    @Autowired
    ServiceUserIn serviceUserIn ;

    @PostMapping("/user")
    public void post (@RequestBody  DtoRequestUser dtoRequestUser) {
   serviceUserIn.create(dtoRequestUser);
    }

    @GetMapping ("/user")
    public List<DtoResponseUser> get() {
       return serviceUserIn.read() ;
    }

    @GetMapping ("/user/{id}")
    public DtoResponseUser getById (@PathVariable Long id) {
       return  serviceUserIn.readById(id) ;
    }

    @PutMapping ("/user/{id}")
    public void put (@RequestBody DtoRequestUser dtoRequestUser ,@PathVariable Long id) {
        serviceUserIn.update(id , dtoRequestUser);
    }

    @DeleteMapping ("/user/{id}")
    public void delete (@PathVariable Long id) {
        serviceUserIn.delete(id);
    }









}
