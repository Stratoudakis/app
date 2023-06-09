package group54.BookCatalogService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BookCatalogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookCatalogServiceApplication.class, args);
    }

    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
        return server -> {
            server.setPort(3001);
        };
    }
}


