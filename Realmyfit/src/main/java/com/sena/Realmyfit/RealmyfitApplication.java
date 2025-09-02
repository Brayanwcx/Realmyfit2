package com.sena.Realmyfit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = DataSourceAutoConfiguration.class)
public class RealmyfitApplication  {

	public static void main(String[] args) {
		SpringApplication.run(RealmyfitApplication.class, args);
	}

}
