package generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		
		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(123);
		
		Integer coisaA = caixaA.abrir();
		System.out.println(coisaA);
	}
}

/*
 * 
 * Sem utilizar generics o erro vai acontecer em tempo de execu��o
 * e seu c�digo vai compilar de forma correta o arquivo .Class ser� gerado de forma correta mas quando
 *  ele for executado voc� vai ter um erro

J� no caso dos Generics voc� vai ver que uma vez que voc� disse que um determinado string s� vai aceitar
valores do tipo string e se voc� tentar adicionar um valor de outro tipo voc� vai ter um erro de compila��o 
 * E N�O vai ser necess�rio fazer casting
 * 
 * */
