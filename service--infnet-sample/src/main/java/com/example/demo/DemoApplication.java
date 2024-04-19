package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() {
        String app = "<!DOCTYPE html><html><head><style>";
        app.concat("div {background-color: #cccccc;}");
        app.concat("h1 {text-align: center;}");
        app.concat("p {font-family: verdana;font-size: 20px;}");
        app.concat("</style></head><body>");

        app.concat("<h1>Projeto Infnet</h1>");
        app.concat("<div><wbr>");
        app.concat("<p><b>Aluno: </b> Tiago Soares da Luz</p>");
        app.concat("<p><b>Disciplina: </b>Administração de uma PaaS usando Red Hat OpenShif</p>");

        app.concat("</body></html>");
        return app;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
