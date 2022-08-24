package lambdas;
					//Object - Classe m�e do java(Apenas para ilustrar)
public class Produto extends Object {

	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	//M�todo para imprimir Produto (caso contr�rio, o endere�o de mem�ria � retornado)
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço de R$" + precoFinal; 
	}
}
