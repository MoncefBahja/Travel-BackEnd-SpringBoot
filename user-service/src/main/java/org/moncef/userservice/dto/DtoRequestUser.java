package org.moncef.userservice.dto;


import lombok.*;
import org.moncef.userservice.entities.Role;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class DtoRequestUser {


    private String firstName ;
    private String lastName ;
    private String email ;
    private String password ;
    private Role role ;

}
