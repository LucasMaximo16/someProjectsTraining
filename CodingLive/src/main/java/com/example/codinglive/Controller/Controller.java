package com.example.codinglive.Controller;

import com.example.codinglive.Palavras;
import com.example.codinglive.Player;
import com.example.codinglive.Service.ProdutoService;
import com.example.codinglive.ServiceInverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class Controller {
    @Autowired
    public ServiceInverter serviceInverter;

    @Autowired
    public ProdutoService produtoService;

    @GetMapping("/invert")
    public String inverterCaracteres(@RequestBody Player input){
        return serviceInverter.removeDuplicates(input).toString();
    }

    @GetMapping("/fibonacci")
    public int fibonacci(@RequestParam int input){
        return serviceInverter.fibonacci(input);
    }

    @GetMapping("/sort")
    public String inverterCaracteres(@RequestBody Map<String,Player> input){
        return serviceInverter.sortByValue(input).toString();
    }
    @GetMapping("/contador")
    public Map<String,Integer> fibonacci(@RequestBody Palavras input){
        return serviceInverter.contador(input);
    }

    @GetMapping("/caracteres")
    public String calculaCaracteres(@RequestParam String input){
        return serviceInverter.frequenciaDeCaracteres(input).toString();
    }
    @GetMapping("/inversorMapa")
    public String inversorMapa(@RequestBody Map<String,Integer> input){
        return serviceInverter.inverterMapa(input).toString();
    }
    @GetMapping("/filtroValores")
    public String FiltroValores(@RequestBody Map<String,Integer> input, @RequestParam Integer valorFiltro){
        return serviceInverter.mapaFiltro(input,valorFiltro).toString();
    }

    @GetMapping("/calculaMedia")
    public String FiltroValores(@RequestBody Map<String,Integer> input){
        return serviceInverter.calculaMediaValores(input);
    }
    @GetMapping("/mapaFrequenciaPalavras")
    public String mapaFrequenciaPalavras(@RequestBody String input){
        return serviceInverter.frequenciaDePalavras(input).toString();
    }

    @GetMapping("/reverter")
    public String reverseString(@RequestParam String texto){
        return serviceInverter.reverterPalavras(texto);
    }

    @GetMapping("/fatoriaContrario")
    public Integer fatorialContrario(@RequestParam Integer input){return  serviceInverter.fatorialRecursivo(input);}

    @GetMapping("/fibo")
    public Integer fiboo(@RequestParam Integer input){return  serviceInverter.fibonnaci(input);}

    @GetMapping("/orderArray")
    public String fiboo(@RequestBody Player input){return serviceInverter.ordernarArrays(input);}

    @GetMapping("/contarCaracteres")
    public String contarCaracteres(@RequestParam String input){
        return serviceInverter.ocorrenciaDePalavras(input).toString();
    }

    @GetMapping("/calculaMediaLista")
    public String FiltroValores(@RequestBody List<Integer> input){
        return serviceInverter.calculaMediaValoresLista(input).toString();
    }
}
