package br.com.afonsope.spring_boot_essentials.service;

import org.springframework.stereotype.Service;
import br.com.afonsope.spring_boot_essentials.database.model.ProdutoEntity;
import br.com.afonsope.spring_boot_essentials.dto.ProdutoDto;

import java.util.List;
import java.util.ArrayList;

@Service

public class ProdutoService {

    private static final List<ProdutoEntity> PRODUTOS = new ArrayList<>();

    public List<ProdutoEntity> findAll(){
        return new ArrayList<>(PRODUTOS);
    }

    public ProdutoEntity createProduct(ProdutoDto produtoDto){

        Integer identificador = PRODUTOS.stream()
            .mapToInt(ProdutoEntity::getId)
            .max()
            .orElse(0) + 1;

        ProdutoEntity novoProduto = ProdutoEntity.builder()
            .id(identificador)
            .nome(produtoDto.getNome())
            .preco(produtoDto.getPreco())
            .quantidade(produtoDto.getQuantidade())
            .build();
        
        PRODUTOS.add(novoProduto);

        return novoProduto;
    }
}
