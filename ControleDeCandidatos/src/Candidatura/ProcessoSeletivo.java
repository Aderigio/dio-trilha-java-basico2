package Candidatura;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {

	public static void main(String[] args) {

		System.out.println("Processo Seletivo");

		imprimirSelecionados();

	}
	
	static void imprimirSelecionados () {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};	
		
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		
		// FOrma normal
		for (int indice = 0; indice < candidatos.length; indice ++) {
			System.out.println("O Candidato de numero " + (indice+1) + " é " + candidatos[indice] + "\n");
				
		}
		
		System.out.println("Forma abreviada de intereção for each.");
		
		for(String candidato: candidatos) {
			
			System.out.println("O Candidato selecionado foi " + candidato + "\n");
		}
	
		
	}

	static void selecaoCandidato() {
		// Array com a lista de candidatos

		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};	
		
		int candidatodSelecionado = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.00;
		
		//uso do while para selecionar candidatos
		
		while (candidatodSelecionado <5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido + ". \n");
			if (salarioBase >= salarioPretendido) {
				
				System.out.print( candidatodSelecionado +"º O candidato " + candidato + " foi selecionado para a vaga.\n\n");
				
				candidatodSelecionado++;
			}
			candidatoAtual++;
		}
	};
	
	// Método que simula o valor pretendido

	
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	
	
	// metodo static pode ser chamado em outros lugares

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.00;

		if (salarioBase > salarioPretendido) {
			System.out.print("Ligar para o Candidato\n");

		} else if (salarioBase == salarioPretendido) {

			System.out.print("Ligar para o candidato com contra proposta\n");

		} else
			System.out.print("Aguardando o Resultado dos demais.\n");

		;

	}

}
