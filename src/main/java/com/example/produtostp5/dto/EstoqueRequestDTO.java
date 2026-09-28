package com.example.produtostp5.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EstoqueRequestDTO {
    private Long produtoId;
    private Integer quantidade;
}
