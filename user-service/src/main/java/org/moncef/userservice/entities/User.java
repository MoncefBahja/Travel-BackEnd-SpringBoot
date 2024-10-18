package org.moncef.userservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString @Builder
@Table(name = "users")  // Utilise un nom de table différent
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
    private String firstName ;
    private String lastName ;
    private String email ;
    private String password ;
    private Role role ;



}
