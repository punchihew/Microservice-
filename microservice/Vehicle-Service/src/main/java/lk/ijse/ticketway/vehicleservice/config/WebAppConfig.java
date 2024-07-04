package lk.ijse.ticketway.vehicleservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 7/4/2024
 */
@Configuration
public class WebAppConfig {

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
}
