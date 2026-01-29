package amis.fr.region.config;

import amis.fr.region.entity.Pays;
import amis.fr.region.entity.Region;
import amis.fr.region.entity.Ville;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "amis.fr.region")
public class RegionConfig {

    @Bean
    public Ville ville() {
        return new Ville();
    }

    @Bean
    public Pays pays() {
        return new Pays();
    }

    @Bean
    public Region region() {
        return new Region();
    }
}