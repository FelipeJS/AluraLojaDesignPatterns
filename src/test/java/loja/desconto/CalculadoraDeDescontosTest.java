package loja.desconto;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import loja.orcamento.Orcamento;

public class CalculadoraDeDescontosTest {

	@Test
	public void deveDarDescontoDe10PorCentoDeDescontoParaMaisDe5Itens() {
		Orcamento orcamento = new Orcamento(new BigDecimal(100), 6);
		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

		Assert.assertEquals("10.0", calculadoraDeDescontos.calcular(orcamento).toString());
	}

	@Test
	public void deveDar5PorCentoDeDescontoParaMaisDe500ReaisQuandoTemMenosDe6Itens() {
		Orcamento orcamento = new Orcamento(new BigDecimal(1000), 1);
		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

		Assert.assertEquals("50.00", calculadoraDeDescontos.calcular(orcamento).toString());
	}

	@Test
	public void deveDarZeroDescontoParaMenosDe501ReaisQuandoTemMenosDe6Itens() {
		Orcamento orcamento = new Orcamento(new BigDecimal(200), 4);
		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

		Assert.assertEquals("0", calculadoraDeDescontos.calcular(orcamento).toString());
	}
}
