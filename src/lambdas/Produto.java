package lambdas;
					//Object - Classe mãe do java(Apenas para ilustrar)
public class Produto extends Object {

	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	//Método para imprimir Produto (caso contrário, o endereço de memória é retornado)
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preÃ§o de R$" + precoFinal; 
	}
}
