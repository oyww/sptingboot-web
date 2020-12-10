package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("controller")//多个包就用{"","",...}
@EnableAutoConfiguration//自动配置
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
