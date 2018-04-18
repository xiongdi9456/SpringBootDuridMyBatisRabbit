package com.morningtec.sheldonrabbit.Config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue userRegistQueue() {
        return new Queue("userregist");
    }

    @Bean
    public Queue userMigrateQueue() {
        return new Queue("usermigrate");
    }


}
