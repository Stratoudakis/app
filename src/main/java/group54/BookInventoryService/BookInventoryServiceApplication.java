package group54.BookInventoryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;


public class BookInventoryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookInventoryServiceApplication.class, args);
    }

    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
        return server -> {
            server.setPort(3002);
        };
    }
}
