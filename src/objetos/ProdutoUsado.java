package objetos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto{
	
	private LocalDate dataDeFablicacao;

	public ProdutoUsado() {
		super();
	}
	
	public ProdutoUsado(String name, Double price, LocalDate dataDeFablicacao) {
		super(name, price);
		this.dataDeFablicacao = dataDeFablicacao;
	}

	public LocalDate getDataDeFablicacao() {
		return dataDeFablicacao;
	}

	public void setDataDeFablicacao(LocalDate dataDeFablicacao) {
		this.dataDeFablicacao = dataDeFablicacao;
	}

	@Override
	public String priceTag() {
		return getName() 
				+ " (usado) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ dataDeFablicacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
	
	
}
