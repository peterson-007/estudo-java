package generics;

//Classe Caixa utilizando Generics
//Qualquer letra pode ser utilizada, inclusive uma palavra
//Quando um objeto caixa for instanciado, o tipo sera escolhido ex: String, Double...
				//como se todos ESSES PARÂMETROS FOSSEM TROCADOS
public class Caixa<T> {
			//aqui
	private T coisa;
					//aqui tbm
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
		//aqui
	public T abrir() {
		return coisa;
	}
}
