package com.example.Calculo.Controller;
import com.example.Calculo.Entity.Numeros;
import com.example.Calculo.Entity.Resultados;
import com.example.Calculo.Service.NumeroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calculo")
@Validated
public class NumerosControler {


    private  NumeroService numeroService;

    @Autowired
    public  NumerosControler(NumeroService numeroService){
        this.numeroService = numeroService;
    }

    @PostMapping(path = "/resultado", produces = MediaType.APPLICATION_JSON_VALUE)
    public Resultados calcular(@Valid @RequestBody Numeros numeros){
        List<Double> Listanumeros = numeros.getNumeros();
        return numeroService.calcular(Listanumeros);
    }











}
