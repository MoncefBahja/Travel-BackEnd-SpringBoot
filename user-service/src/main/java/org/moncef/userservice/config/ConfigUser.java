package org.moncef.userservice.config;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "user.params")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ConfigUser {
    int x ;
    int y ;
}
