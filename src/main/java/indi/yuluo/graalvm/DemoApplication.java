package indi.yuluo.graalvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: yuluo
 * @date: 2023/5/30 15:53
 * @description: some desc
 */

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class);
		System.out.println("graalvm demo is running……");
	}

}
