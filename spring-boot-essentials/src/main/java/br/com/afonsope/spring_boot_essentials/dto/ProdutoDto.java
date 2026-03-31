package br.com.afonsope.spring_boot_essentials.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ProdutoDto {
    
    private String nome;
    private BigDecimal preco;
    private Integer quantidade;

}
