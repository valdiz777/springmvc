package com.zadentech.springmvc;

import java.net.URL;
import java.net.URLClassLoader;

import com.zadentech.springmvc.login.LoginController;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringMvcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
        	System.out.println(url.getFile());
        }
		// ApplicationContext context = new ClassPathXmlApplicationContext("webapp/WEB-INF/todo-servlet.xml");

		// context.getBean(LoginController.class);
		SpringApplication.run(SpringMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
