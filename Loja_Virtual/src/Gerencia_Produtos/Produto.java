package Gerencia_Produtos;

public abstract class Produto {
	protected String nome;
	protected double valorProduto;
	protected String descricao;
	public Desconto desconto;
	protected CalculadorPreco calculadorPreco;
	
	public Produto() {
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValorProduto() {
		return valorProduto;
	}
		
	public Desconto getDesconto() {
		return desconto;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValorComDesconto() {
		calculadorPreco = new CalculadorPreco(this);
		return calculadorPreco.calcularDescontos();
	}
	
	public double getValorNormal() {
		calculadorPreco = new CalculadorPreco(this);
		return calculadorPreco.calcularDescontosNormal();
	}
	
	
}
