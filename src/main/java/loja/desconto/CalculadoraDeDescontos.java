package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal desconto = new DescontoOrcamentoMaisDeCincoItens(
				new DescontoOrcamentoComValorMaiorQueQuinhentos(new SemDesconto())).calcular(orcamento);

		return desconto;
	}
}
