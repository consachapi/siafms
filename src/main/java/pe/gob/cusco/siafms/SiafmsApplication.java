package pe.gob.cusco.siafms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SiafmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiafmsApplication.class, args);
	}

}
