package br.unisul.aula.primeirospring.controller;

import br.unisul.aula.primeirospring.model.Mensagem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiro")
public class PrimeiroRequest {

    @GetMapping("/")
    public Mensagem listar(){
        return new Mensagem(1, "Hello Word", "Primeira Mensagem");
    }
}
