package Gerencia_Produtos;

public class CalculadorPreco {
	private Produto produto;
	
	  public CalculadorPreco(Produto produto){
	        this.produto = produto;
	    }

	    public double calcularDescontos() {
	        return  produto.valorProduto - produto.valorProduto*(produto.desconto.valorDesconto/100);
	    }
	    
	    public double calcularDescontosNormal() {
	    	return produto.valorProduto - produto.desconto.valorDesconto;
	    }
	    
}
