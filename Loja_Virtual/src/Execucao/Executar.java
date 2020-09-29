package Execucao;

import java.util.ArrayList;
import Gerencia_Produtos.Desconto;
import Gerencia_Produtos.Produto;
import Gerencia_Produtos.ProdutoComposto;
import Gerencia_Produtos.ProdutoUnitario;

public class Executar {
	public static void main(String[] args) {
		
		Desconto desconto = new Desconto(30);
		
		Produto p1 = new ProdutoUnitario("Laptoop Xuxa","Faz barulhinho quanto aperta as teclas é acende luizinhas",300,desconto);
		
		Desconto desconto2 = new Desconto(5);
		
		Produto p2 = new ProdutoUnitario("Ultrabook","Processador: AMD-OF 11 geração;Ram: 32gb; Placa dedicada:GTX 3090; 2x Entradas Usb 4.0",5000,desconto2);		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		produtos.add(p1);
		produtos.add(p2);
		
		Produto kit = new ProdutoComposto("Kit de informática", produtos);
		
		System.out.println(p1.getNome());
		System.out.println(p1.getDescricao());
		System.out.println(p1.getValorComDesconto());				
		System.out.println("////////////////////");
		System.out.println(p2.getNome());
		System.out.println(p2.getDescricao());
		System.out.println(p2.getValorComDesconto());	
		System.out.println("////////////////////");
		System.out.println(kit.getNome());
		System.out.println(kit.getValorComDesconto());
		
	}
	
}
