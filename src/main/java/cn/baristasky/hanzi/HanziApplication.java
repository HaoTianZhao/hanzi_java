package cn.baristasky.hanzi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "cn.baristasky.hanzi.dao")
public class HanziApplication {

	public static void main(String[] args) {
		SpringApplication.run(HanziApplication.class, args);
	}
}
