package Gerencia_Produtos;

import java.util.ArrayList;

public class ProdutoComposto extends Produto {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();

	public ProdutoComposto(String nome,ArrayList<Produto> produtos) {
		this.nome = nome;
		this.produtos.addAll(produtos);
		calcularValorTotal();
		calcularDescontoTotal();
	}
	
	private void calcularValorTotal() {
		double valorTemp = valorProduto;
		for(Produto p : produtos) {
			valorTemp += p.getValorProduto();
		}
		valorProduto = valorTemp;
	}
	private void calcularDescontoTotal() {
		double descontTemp = 0;
		for(Produto p : produtos) {
			descontTemp += p.desconto.getValorDesconto();
		}
		desconto = new Desconto(descontTemp);
	}
	

}
