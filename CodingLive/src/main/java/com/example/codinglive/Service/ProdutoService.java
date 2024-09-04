package com.example.codinglive.Service;

import com.example.codinglive.DTO.ProdutoDTO;
import com.example.codinglive.Entity.Produto;
import com.example.codinglive.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public String reverterPalavras(String texto) {
        StringBuilder stringBuilder = new StringBuilder(texto);
        return stringBuilder.reverse().toString();
    }
    public void salvarProduto(ProdutoDTO produtoDTO) {
        Produto produto = new Produto();
        produto.setName(produtoDTO.getName());
        produto.setPreco(produtoDTO.getPreco());
        produtoRepository.save(produto);
    }

    public List<Produto> consultarProdutos() {
        return produtoRepository.findAll();
    }

    public void deletarProduto(Integer id){
        produtoRepository.deleteById(id);
    }

    public void updateProduct(Integer id, ProdutoDTO produtoDTO) {
        Optional<Produto> produtoOld = produtoRepository.findById(id);
        Produto produto = produtoOld.get();
        produto.setPreco(produtoDTO.getPreco());
        produto.setName(produtoDTO.getName());
        produtoRepository.save(produto);
    }
}
