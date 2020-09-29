package Execucao;

import java.util.ArrayList;
import Gerencia_Produtos.Desconto;
import Gerencia_Produtos.Produto;
import Gerencia_Produtos.ProdutoComposto;
import Gerencia_Produtos.ProdutoUnitario;

public class Executar {
	public static void main(String[] args) {
		
		Desconto desconto = new Desconto(30);
		
		Produto p1 = new ProdutoUnitario("Baleia","Peza + 8T,apresenta ruidos ensurdecedores, e se mete em tudo",1000,desconto);
		
		Desconto desconto2 = new Desconto(5);
		
		Produto p2 = new ProdutoUnitario("Lula","Lula frita quentinha que derrete na boca",5000,desconto2);	
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		produtos.add(p1);
		produtos.add(p2);
		
		Produto kit = new ProdutoComposto("Kit de informática", produtos);
		System.out.println(kit.getValorComDesconto());
		for(Produto p : produtos) {
			System.out.println(p.);
		}
		//System.out.println(p1.getValorNormal());
		
	}
	
}
