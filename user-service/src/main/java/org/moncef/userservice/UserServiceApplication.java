package org.moncef.userservice;

import org.moncef.userservice.config.ConfigGlobal;
import org.moncef.userservice.config.ConfigUser;
import org.moncef.userservice.entities.Role;
import org.moncef.userservice.entities.User;
import org.moncef.userservice.repo.RepoUser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
@EnableConfigurationProperties({ConfigGlobal.class, ConfigUser.class})
@SpringBootApplication
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
@Bean
    CommandLineRunner Start (RepoUser repoUser) {
        return args -> {
            User user1 = User.builder()
                    .firstName("moncef")
                    .lastName("bahja")
                    .email("bahjamoncef@gmail.com")
                    .password("moncef0000")
                    .role(Role.ADMIN)
                    .build() ;
            repoUser.save(user1) ;

            User user2 = User.builder()
                    .firstName("mokhtar")
                    .lastName("bahja")
                    .email("bahjamokhtar@gmail.com")
                    .password("mokhtar0000")
                    .role(Role.USER)
                    .build() ;
            repoUser.save(user2) ;

            User user3 = User.builder()
                    .firstName("habiba")
                    .lastName("ghayas")
                    .email("habibaGayas@gmail.com")
                    .password("habiba9999")
                    .role(Role.USER)
                    .build() ;
            repoUser.save(user3) ;

    };

}
}
