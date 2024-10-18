package org.moncef.userservice.config;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "global.params")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ConfigGlobal {
    int p1 ;
    int p2 ;

}
