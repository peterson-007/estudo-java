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
 * Sem utilizar generics o erro vai acontecer em tempo de execução
 * e seu código vai compilar de forma correta o arquivo .Class será gerado de forma correta mas quando
 *  ele for executado você vai ter um erro

Já no caso dos Generics você vai ver que uma vez que você disse que um determinado string só vai aceitar
valores do tipo string e se você tentar adicionar um valor de outro tipo você vai ter um erro de compilação 
 * E NÃO vai ser necessário fazer casting
 * 
 * */
