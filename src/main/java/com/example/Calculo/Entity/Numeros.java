package com.example.Calculo.Entity;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Numeros {

    @Size(min = 20, max = 20, message = "A lista de números deve conter exatamente 20 elementos.")
    public List<Double> numeros;

    public List<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Double> numeros) {
        this.numeros = numeros;
    }
}
