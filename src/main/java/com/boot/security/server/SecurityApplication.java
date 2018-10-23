package com.boot.security.server;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 启动类
 * 
 * @author Jax
 *
 */
@SpringBootApplication
@MapperScan(basePackages = "com.boot.security.server.dao")
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
}
