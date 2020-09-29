package Gerencia_Produtos;

public class ProdutoUnitario extends Produto{

	public ProdutoUnitario(String nome,String descricao,double valorProduto,Desconto desconto) {
		this.nome = nome;
		this.valorProduto = valorProduto;
		this.descricao = descricao;
		this.desconto = desconto;
	}
	
}
