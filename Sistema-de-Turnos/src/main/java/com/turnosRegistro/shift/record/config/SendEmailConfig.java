package com.turnosRegistro.shift.record.config;

import com.sendgrid.SendGrid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class SendEmailConfig {

        @Value("${api.key}")
        private String key;
        @Bean
        public SendGrid getSendrid(){
            return new SendGrid(key);
        }
}
