package com.springboot.Module5Practice2.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "film")
public class Film {
    private String name;
    private String genre;
    private Integer yearOfRelease;

    @Override
    public String toString(){
        return String.format("%s (%s, %d)", this.name, this.genre, this.yearOfRelease);
    }
}
