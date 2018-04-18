package com.morningtec.sheldonrabbit.Config;

import com.morningtec.sheldonrabbit.entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(int loopId) {
		//String context = "hello sheldon" + new Date();
		//System.out.println("Sender : " + context);
		User user = new User();
		user.setDeviceId("device123457");
		user.setOs(1);
		user.setFlag(1);
		user.setMigratePass("sdfsf");
		user.setUserId("233442112");
		user.setCreateTime("2018-10-23");

		long startTime = System.currentTimeMillis();
		//System.out.println("user string:"+user.toString());
		System.out.println(loopId+"_start sending-time:"+startTime);
		this.rabbitTemplate.convertAndSend("userregist", user);
		long endTime = System.currentTimeMillis();
		System.out.println(loopId+"_end sending-time:"+endTime);
		long runTime = endTime - startTime;
		System.out.println(loopId+"_Run time : " + runTime+"ms");


	}
}
