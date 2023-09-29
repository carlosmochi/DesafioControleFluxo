import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}

		// Metodo para execução de valores teste
		
		// System.out.println("Realizando Testes automáticos!");
		// testes();
		
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois)
			throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		for(int numeroAtual = 1; numeroAtual <= contagem; numeroAtual++){
			System.out.println("Imprimindo o número "+numeroAtual);
		}
	}

	static void testes(){
		try {
			System.out.println("Primeiro valor: 1; Segundo valor: 5");
			contar(1, 5);
			System.out.println("Primeiro valor: 12; Segundo valor: 30");
			contar(12, 30);
			System.out.println("Primeiro valor: 12; Segundo valor: 5");
			contar(12, 5);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
}