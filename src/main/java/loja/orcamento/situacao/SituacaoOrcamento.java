package loja.orcamento.situacao;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amento n�o pode ser aprovado");
	}

	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amento n�o pode ser reprovado");
	}

	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Or�amento n�o pode ser finalizado");
	}
}
