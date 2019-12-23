package co.uk.harryabaker.todo.domain.config;

import org.hashids.Hashids;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Hashids hashids() {
        return new Hashids("", 6);
    }

}
