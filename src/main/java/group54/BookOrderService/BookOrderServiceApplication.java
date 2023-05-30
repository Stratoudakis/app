package group54.BookOrderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;

public class BookOrderServiceApplication {

        public static void main(String[] args) {
            SpringApplication.run(BookOrderServiceApplication.class, args);
        }
    
        @Bean
        public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
            return server -> {
                server.setPort(3003);
            };
        }

}
