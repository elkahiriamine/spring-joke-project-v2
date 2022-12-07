package com.example.springjokeprojectv2;

import com.example.springjokeprojectv2.models.FakeMail;
import com.example.springjokeprojectv2.models.FakeUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-configure.xml")
public class SpringJokeProjectV2Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringJokeProjectV2Application.class, args);

        FakeUser fakeUser = applicationContext.getBean(FakeUser.class);
        System.out.println(fakeUser.getUserName());

        FakeMail fakeMail = applicationContext.getBean(FakeMail.class);
        System.out.println(fakeMail.getMail());

    }

}
