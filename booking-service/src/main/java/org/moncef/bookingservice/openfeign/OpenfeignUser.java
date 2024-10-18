package org.moncef.bookingservice.openfeign;
import org.moncef.bookingservice.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="USER-SERVICE")
public interface OpenfeignUser {
    @GetMapping ("/user")
    public List<User> findAllUsers () ;
    @GetMapping ("/user/{id}")
    public User findUserById (@PathVariable Long id) ;
}
