package testimportmvn;

import org.springframework.boot.SpringApplication;

import controller.HelloController;
import service.TestService;

public class TestServiceimpl extends HelloController implements TestService {

	public void say() {
		System.out.println("Hello Maven");

	}
	public static void main(String[] args) {
		SpringApplication.run(TestServiceimpl.class,args);
	}

}
