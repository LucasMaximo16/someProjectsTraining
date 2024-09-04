package com.example.codinglive;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ServiceInverter {

    public Map<String,Integer> ocorrenciaDePalavras(String input){
        Map<String,Integer> map = new HashMap<>();

        char[] characters = input.toCharArray();
        for(char c : characters){
            String cta = String.valueOf(c);
            if(map.containsKey(cta)){
                map.put(cta,map.get(cta) + 1);
            }else{
                map.put(cta,1);
            }
        }
        return map;
    }

    public String ordernarArrays(Player player){
       return player.getInput().stream().sorted()
               .map(String::valueOf)
               .collect(Collectors.joining(", "));
    }

    public Integer fibonnaci(Integer nNumero){
        int atual = 1;
        int anterior = 0;
        int result = 0;

        for(int i = 1; i < nNumero ; i++){
            result = atual + anterior;
            anterior = atual;
            atual = result;
        }
        return result;
    }

    public Integer fatorialRecursivo(Integer numeroFatorial){
        int atual = numeroFatorial;
        int anterior = numeroFatorial - 1;
        int resultado = 0;
        int total = 0;

        for (int i = 1 ; i < numeroFatorial; i++){
            resultado = atual * anterior;
            atual = resultado;
            anterior = anterior - 1;

            total = resultado ;
        }
        return total;
    }


    public Map<String,Integer> frequenciaDePalavras(String text){
        Map<String,Integer> mapaMedia = new HashMap<>();
        List<String> listaPalavras = new ArrayList<>();

        String[] palavras = text.split("\\s+");
        for (String p : palavras){
            if (mapaMedia.containsKey(p)){
                mapaMedia.put(p,mapaMedia.get(p) + 1);
            }else{
                mapaMedia.put(p,1);
            }
        }
        return mapaMedia;
    }

    public String calculaMediaValores(Map<String,Integer> map){
        Map<String,Integer> mapaMedia = new HashMap<>();
        Integer total = 0;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            Integer valor = entry.getValue();
            total = total + valor;
        }
        return "Average " + total / map.entrySet().stream().count();
    }

    public String calculaMediaValoresLista(List<Integer> list){
        int total = 0;
        list.stream().mapToInt(Integer :: intValue).sum();

        return "Average " + total / list.size();
    }



    public Map<String, Integer> mapaFiltro2(Map<String, Integer> map, Integer numeroFiltro) {
        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > numeroFiltro) // Filtra as entradas com valores maiores que numeroFiltro
                .collect(Collectors.toMap(
                        Map.Entry::getKey, // Extrai a chave da entrada filtrada
                        Map.Entry::getValue // Extrai o valor da entrada filtrada
                ));
    }
    public Map<String,Integer> mapaFiltro(Map<String,Integer> map, Integer numeroFiltro){
        Map<String,Integer> mapaFiltrado = new HashMap<>();
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() > numeroFiltro ){
                mapaFiltrado.put(entry.getKey(), entry.getValue());
            }
        }
        return mapaFiltrado;
    }

    public Map<Integer,String> inverterMapa(Map<String,Integer> map){
        Map<Integer,String> mapaInverso = new HashMap<>();

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            mapaInverso.put(entry.getValue(), entry.getKey());
        }
        return mapaInverso;
    }
    public Map<String,Integer>  frequenciaDeCaracteres(String texto){
        Map<String,Integer> mapaContadorCaracteres = new HashMap<>();
        char[] listaDeCaracteres = texto.toCharArray();

        for(char c : listaDeCaracteres){
            if(mapaContadorCaracteres.containsKey(String.valueOf(c))){
                mapaContadorCaracteres.put(String.valueOf(c),mapaContadorCaracteres.get(String.valueOf(c)) + 1);
            }else {
                mapaContadorCaracteres.put(String.valueOf(c),1);
            }
        }

        return mapaContadorCaracteres;
    }
    public Map<String,Integer> contador (Palavras words){
        Map<String, Integer> mapaPalavras = new HashMap<>();

        for (String palavra: words.getPalavras()){
            if(mapaPalavras.containsKey(palavra)){
                mapaPalavras.put(palavra,mapaPalavras.get(palavra) + 1);
            }else {
                mapaPalavras.put(palavra,1);
            }
        }
        return mapaPalavras;
    }
    public Map<String, Player> sortByValue(Map<String, Player> map) {
        for (Map.Entry<String,Player> entry : map.entrySet()){

            System.out.println(entry.getValue());
            System.out.println(entry.getKey());

            Player player = entry.getValue();
            Collections.sort(player.getInput());

        }
        return map;
    }

    public int fibonacci(int n) {
        int anterior = 0;
        int posterior = 1;
        for (int i = 1; i < n; i++){
            int atual = posterior + anterior;
            anterior = posterior;
            posterior = atual;
        }
        return posterior;
    }


    public List<Integer> removeDuplicates(Player player) {
        Set<Integer> integersSet = new HashSet<>(player.getInput());

        return new ArrayList<>(integersSet);
    }

    public String reverterPalavras(String texto) {
        StringBuilder stringBuilder = new StringBuilder(texto);
        return stringBuilder.reverse().toString();
    }

    /* public String reverseString (String s){
        return new StringBuilder(s).reverse().toString();
    }

    /* public String encontrarUnicoNaoRepetido(String input) {
        char[] character = input.toCharArray();
        List<String> list = new ArrayList<>();

        for(char c : character){
            list.add(String.valueOf(c));
        }

        Optional<String> result = list.stream()
                .filter(c -> list.stream().filter(c::equals).count() == 1).findFirst();

        return result.orElse(null);
    }

   /*
    public String inverterString(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()){
            deque.addLast(c);
        }
        char first = deque.getFirst();
        deque.addLast(first);
        deque.removeFirst();

        StringBuilder result = new StringBuilder();
        for(char c : deque){
            result.append(c);
        }
        return result.toString();
    }
   */
}
