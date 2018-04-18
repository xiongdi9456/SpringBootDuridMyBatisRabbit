package com.morningtec.sheldonrabbit.Config;

import com.morningtec.sheldonrabbit.entity.User;
import com.morningtec.sheldonrabbit.mapper.UserMapper;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
@RabbitListener(queues = "userregist")
public class UserRegisterMessageListener {

    @Autowired
    private UserMapper userMapper;

    @RabbitHandler
    public void process(User userObj) {

        long startTime = System.currentTimeMillis();
        System.out.println("received time:"+startTime);
        System.out.println("Receiver object : " + userObj.toString());
        //插入数据库处理
        userMapper.insertUser(userObj);
        long endTime = System.currentTimeMillis();
        System.out.println("process over time:"+endTime);
        System.out.println("process time:"+(endTime-startTime)+"ms");

    }

}
