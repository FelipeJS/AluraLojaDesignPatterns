package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class DescontoOrcamentoMaisDeCincoItens extends Desconto {

	public DescontoOrcamentoMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	protected Boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQtdItens() > 5;
	}
}
