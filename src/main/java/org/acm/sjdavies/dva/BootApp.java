package org.acm.sjdavies.dva;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * <p>Launch the Spring Boot stack.
 *
 * @author Stephen Davies
 * @since October 2017
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.acm.sjdavies.dva.repo")
public class BootApp extends SpringBootServletInitializer {
   
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootApp.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootApp.class, args);
    }

}
