package amis.fr.region;

import amis.fr.region.config.RegionConfig;
import amis.fr.region.entity.Region;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RegionConfig.class);
        Region region = context.getBean(Region.class);

        region.setNomRegion("Ile de France");

        region.affiche();
    }
}