package com.example.springjokeprojectv2.config;


import com.example.springjokeprojectv2.models.FakeMail;
import com.example.springjokeprojectv2.models.FakeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:application.dataProperties")
@PropertySources({
        @PropertySource("classpath:application.dataProperties"),
        @PropertySource("classpath:email.properties")
})
public class ConfigurePro {

    @Autowired
    private Environment environment;


    //Collection the variable from application.dataProperties
    @Value("${amine.userName}")
    private String userName;
    @Value("${amine.password}")
    private String password;
    @Value("${amine.url}")
    private String url;

    //Collection the variable from email.properties

    @Value("${user.mail}")
    private String mail;
    @Value("${user.password}")
    private String passwordMail;

   @Bean
   public FakeUser getFakeUser(){
       return new FakeUser(environment.getProperty("username"),password,url);
   }

   @Bean
   public FakeMail getFakeMail(){
       return new FakeMail(mail,passwordMail);
   }
   @Bean
    public static PropertySourcesPlaceholderConfigurer property(){
       return new PropertySourcesPlaceholderConfigurer();
   }

}
