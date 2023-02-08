package objetos;

public class ProdutoImportado extends Produto{
	
	private Double customizacao;

	public ProdutoImportado() {
		super();
	}
	
	public ProdutoImportado(String name, Double price, Double customizacao) {
		super(name, price);
		this.customizacao = customizacao;
	}

	public double totalPrice() {
		return this.getPrice() + this.getCustomizacao();
	}
	
	public Double getCustomizacao() {
		return customizacao;
	}

	public void setCustomizacao(Double customizacao) {
		this.customizacao = customizacao;
	}

	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customizacao)
				+ ")";
	}
	
	
}
