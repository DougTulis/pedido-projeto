package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto;
import entities.cliente;
import entities.pedidoCabecalho;
import entities.pedidoItem;

public class Programa {

	public static void main(String[] args) {

		List<pedidoItem> listaItem = new ArrayList<>();
        Locale.setDefault(Locale.US);
		cliente Cliente = new cliente(50,"Douglas",22,"13 de maio",1199,"Pontal","SP");
		Produto p1 = new Produto(30,"Teclado",5,150.00); 
		Produto p2 = new Produto(40,"Mouse",3,200.00);
		Produto p3 = new Produto(50,"Caixa de Som",6,50.00);
		pedidoItem item1 = new pedidoItem(1,p1,1,150.00);
		pedidoItem item2 = new pedidoItem(2,p2,1,200.00);
		pedidoItem item3 = new pedidoItem(3,p3,1,50.00);
        listaItem.add(item1);
        listaItem.add(item2);
        listaItem.add(item3);
        pedidoCabecalho cabecalho = new pedidoCabecalho(5,LocalDate.now() , Cliente, 400.0,listaItem);
        
        System.out.println(cabecalho.toString());
        
		}
	

}
