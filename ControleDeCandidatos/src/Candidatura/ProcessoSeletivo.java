package Candidatura;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {

	public static void main(String[] args) {

		System.out.println("Processo Seletivo");

		analisarCandidato(1900.00);
		analisarCandidato(2200.00);
		analisarCandidato(2000.00);

	}

	static void selecaoCandidato() {
		// Array com a lista de candidatos

		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};	
		
		int candidatodSelecionado = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.00;
		
		while (candidatodSelecionado <5) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + "Solicitou ");
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
