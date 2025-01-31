package org.moncef.bookingservice.model;


import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class User {

    private  Long id ;
    private String firstName ;
    private String lastName ;
    private String email ;
    private String password ;
    private Role role ;
}
