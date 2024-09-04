package com.example.codinglive.Controller;

import com.example.codinglive.DTO.ProdutoDTO;
import com.example.codinglive.Entity.Produto;
import com.example.codinglive.Service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/cadastrarProduto")
    public ResponseEntity<Void> cadastrarProduto(@RequestBody ProdutoDTO produtoDTO) {
        produtoService.salvarProduto(produtoDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/buscarProdutos")
    public ResponseEntity<List<Produto>> consultaTodosProdutos() {
        List<Produto> produtoList = produtoService.consultarProdutos();
        return new ResponseEntity<>(produtoList, HttpStatus.OK);
    }

    @DeleteMapping("/deletarProduto")
    public ResponseEntity<Void> deletarProduto(@RequestParam Integer id) {
        produtoService.deletarProduto(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/updateProduto")
    public ResponseEntity<Void> updateProduct(@RequestParam Integer id, @RequestBody ProdutoDTO produtoDTO) {
        produtoService.updateProduct(id, produtoDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
