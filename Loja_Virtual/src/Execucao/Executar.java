package Execucao;

import java.util.ArrayList;
import Gerencia_Produtos.Desconto;
import Gerencia_Produtos.Produto;
import Gerencia_Produtos.ProdutoComposto;
import Gerencia_Produtos.ProdutoUnitario;

public class Executar {

	public static void main(String[] args) {
		Desconto desconto = new Desconto(30);
		
		Produto p1 = new ProdutoUnitario("Baleia","PEza + 8T,apresenta ruidos insurdesedores, e se mete em tudo",1000,desconto);
		Produto p2 = new ProdutoUnitario("Lula","Lula frita quentinah qeu derrete na boca",5000,desconto);	
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		produtos.add(p1);
		produtos.add(p2);
		
		Produto kit = new ProdutoComposto("Kit de informática", produtos);
		 System.out.println(kit.getValorComDesconto());
	}

}
