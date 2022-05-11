package com.wf3.restapi;

import com.wf3.restapi.model.entity.Table;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestapiApplication {

    public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);

        Table table1 = new Table(1, "table1", 10, 150.00);
        Table table2 = new Table(2, "table2", 15, 250.00);
        System.out.println(table1.toString());
        System.out.println(table2.toString());
    }

}
