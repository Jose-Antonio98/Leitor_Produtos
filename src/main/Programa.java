package main;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import objetos.Produto;
import objetos.ProdutoImportado;
import objetos.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		
		List<Produto> prod = new ArrayList<>();

		System.out.print("Entre com o numero de produtos: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do produto Nº" + i);
			System.out.print("Comum, usado, importado (c/u/i): ");
			String p = sc.next();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			if (p.equals("c")) {
				prod.add(new Produto(nome, preco));
			} else if (p.equals("i")) {
				System.out.print("Customização: ");
				Double custom = sc.nextDouble();
				prod.add(new ProdutoImportado(nome, preco, custom));
			} else if (p.equals("u")) {
				System.out.print("Data de produção: ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				prod.add(new ProdutoUsado(nome, preco, date));
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS: ");
		for (Produto produto : prod) {
			System.out.println(produto.priceTag());
		}
		sc.close();
	}

}
