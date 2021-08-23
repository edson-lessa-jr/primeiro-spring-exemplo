package br.unisul.aula.primeirospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Mensagem {
    private int codigo;
    private String titulo;
    private String mensagem;
}
