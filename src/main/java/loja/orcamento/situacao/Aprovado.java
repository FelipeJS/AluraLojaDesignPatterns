package loja.orcamento.situacao;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {

	public BigDecimal calcularValorDoDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacaoOrcamento(new Finalizado());
	}
}
