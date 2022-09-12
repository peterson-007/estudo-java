package excecao;

public class Causa {

	public static void main(String[] args) {
		//NEM SEMPRE A EXCE��O QUE ESTOUROU, � A EXCE��O QUE CAUSOU O PROBLEMA
		//(SEQU�NCIA de causas)
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		
		metodoA(null);
	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}

	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno est� NULLLOOOO!!!");
		}
		
		System.out.println(aluno.nome);
	}
}
