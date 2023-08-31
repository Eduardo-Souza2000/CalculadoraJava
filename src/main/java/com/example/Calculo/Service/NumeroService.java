package com.example.Calculo.Service;

import com.example.Calculo.Entity.Numeros;
import com.example.Calculo.Entity.Resultados;
import org.springframework.stereotype.Service;


import java.util.Collections;
import java.util.List;
@Service
public class NumeroService {
    public Resultados calcular (List<Double> Listanumeros){

        Collections.sort(Listanumeros);
        double media = calculaMedia(Listanumeros);
        double dv = calculaDesvioPadrao(Listanumeros);
        double mediana = calculaMediana(Listanumeros);
        int  quantDados = Listanumeros.size();
        int numMin = (int) calculaNumeroMinimo(Listanumeros);
        int numMax = (int) calculaNumeroMaximo(Listanumeros);
        double soma = calculaSoma(Listanumeros);

        return new Resultados(media, dv, mediana, soma, quantDados, numMin, numMax);
    };

    public double calculaMedia (List<Double> Listanumeros){
        double somas = 0;
        for (double num : Listanumeros){
            somas+= num;
        }
        return somas / Listanumeros.size();
    }

    public double calculaSoma (List<Double> Listanumeros){
        double soma = 0;
        for (double num : Listanumeros){
            soma+= num;
        }
        return soma;
    }

    public double calculaDesvioPadrao  (List<Double> Listanumeros){
        double media = calculaMedia ( Listanumeros);
        double somaRaiz = 0;

        for (double numeroLista : Listanumeros){
            somaRaiz += Math.pow(numeroLista - media,2);
        }
        return  Math.sqrt(somaRaiz / Listanumeros.size());
    }

    public double calculaMediana (List<Double> Listanumeros){
        int tamanhoLista = Listanumeros.size();
        if (tamanhoLista % 2 == 0){
            double meio1 = Listanumeros.get(tamanhoLista/2-1);
            double meio2 = Listanumeros.get(tamanhoLista /2);
            return (meio1 + meio2) /2;
        } else{
            return Listanumeros.get(tamanhoLista/2);
        }
    }

    public double calculaNumeroMinimo(List<Double> Listanumeros) {
        if (Listanumeros.isEmpty()) {
            throw new IllegalArgumentException("A lista de números está vazia.");
        }
        return Collections.min(Listanumeros);
    }

    public double calculaNumeroMaximo(List<Double> Listanumeros) {
        if (Listanumeros.isEmpty()) {
            throw new IllegalArgumentException("A lista de números está vazia.");
        }
        return Collections.max(Listanumeros);
    }
}
