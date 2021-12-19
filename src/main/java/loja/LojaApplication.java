package loja;

import java.math.BigDecimal;

import loja.desconto.CalculadoraDeDescontos;
import loja.orcamento.Orcamento;

public class LojaApplication {

	public static void main(String[] args) {

		// TESTE IMPOSTOS
//		Orcamento orcamento = new Orcamento(new BigDecimal(100), 2);
//		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
//
//		System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
//
//		System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));

		// TESTE DESCONTOS
		Orcamento orcamento = new Orcamento(new BigDecimal(1000), 6);
		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

		System.out.println(calculadoraDeDescontos.calcular(orcamento));

	}

}
