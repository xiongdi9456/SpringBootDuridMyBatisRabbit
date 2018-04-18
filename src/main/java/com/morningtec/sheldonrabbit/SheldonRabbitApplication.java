package com.morningtec.sheldonrabbit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Date;

@SpringBootApplication
@MapperScan("com.morningtec.sheldonrabbit.mapper")
public class SheldonRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SheldonRabbitApplication.class, args);
	}
}


