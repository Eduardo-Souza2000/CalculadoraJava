package com.example.Calculo;

import com.example.Calculo.Entity.Numeros;
import com.example.Calculo.Service.NumeroService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculoApplicationTests {
	@Autowired
	NumeroService numeroService;


	@Test
	public void testMedia (){
		List<Double> numeros = Arrays.asList(10.0, 20.0, 30.0);
		double media = numeroService.calculaMedia(numeros);
		assertEquals(20.0, media, 0.01);
	}

	@Test
	public void testDesvioPadrao(){
		List<Double> numeros = Arrays.asList(10.0, 20.0, 30.0);
		double desvioPadrao = numeroService.calculaDesvioPadrao(numeros);
		assertEquals(8.16,desvioPadrao, 0.01);

	}

	@Test
	public void testMediana(){
		List<Double> numeros = Arrays.asList(10.0, 20.0, 30.0);
		double mediana = numeroService.calculaMediana(numeros);
		assertEquals(20,mediana, 0.01);
	}

	@Test
	public void testNumMin(){
		List<Double> numeros = Arrays.asList(10.0, 20.0, 30.0);
		double numMin = numeroService.calculaNumeroMinimo(numeros);
		assertEquals(10,numMin, 0.01);
	}

	@Test
	public void testNumMax(){
		List<Double> numeros = Arrays.asList(10.0, 20.0, 30.0);
		double numMax = numeroService.calculaNumeroMaximo(numeros);
		assertEquals(30,numMax, 0.01);
	}

	@Test
	public void testsoma(){
		List<Double> numeros = Arrays.asList(10.0, 20.0, 30.0);
		double soma = numeroService.calculaSoma(numeros);
		assertEquals(60,soma, 0.01);
	}
}
