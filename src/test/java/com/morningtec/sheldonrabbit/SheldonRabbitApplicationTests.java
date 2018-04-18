package com.morningtec.sheldonrabbit;

import com.morningtec.sheldonrabbit.Config.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SheldonRabbitApplicationTests {

	@Autowired
	private Sender sender;

	@Test
	public void hello() throws Exception{
		for (int i=0; i<1000; i++){
			sender.send(i);
		}
	}

}
