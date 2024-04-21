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
        String app = "<!DOCTYPE html><html><head><style>"+
        "div {background-color: #cccccc;}"+
        "h1 {text-align: center;}"+
        "p {font-family: verdana;font-size: 20px;}"+
        "</style></head><body>"+
        "<h1>Projeto Infnet</h1>"+
        "<div><wbr>"+
        "<p><b>Aluno: </b> Tiago Soares da Luz</p>"+
        "<p><b>Disciplina: </b>Administração de uma PaaS usando Red Hat OpenShif</p><wbr>"+
        "</body></html>";
        return app;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
