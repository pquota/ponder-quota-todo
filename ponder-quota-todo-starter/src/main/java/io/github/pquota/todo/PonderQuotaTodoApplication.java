package io.github.pquota.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = {"io.github.pquota", "io.github.ponderyao.ddd"})
public class PonderQuotaTodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PonderQuotaTodoApplication.class, args);
    }

}
