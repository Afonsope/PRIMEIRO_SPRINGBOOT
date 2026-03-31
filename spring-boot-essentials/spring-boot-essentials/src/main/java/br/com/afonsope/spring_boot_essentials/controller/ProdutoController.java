package br.com.afonsope.spring_boot_essentials.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.afonsope.spring_boot_essentials.database.model.ProdutoEntity;
import br.com.afonsope.spring_boot_essentials.service.ProdutoService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor

public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> findAll(){
        return produtoService.findAll();
    }


}
