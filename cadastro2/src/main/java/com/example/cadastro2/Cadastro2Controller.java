package com.example.cadastro2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Cadastro2Controller {
    @RestController
    public class HelloController {
        @GetMapping("/")
        public String home() {
            return "Olá!. Veja minha primeira página web com Java";
        }
    }
}