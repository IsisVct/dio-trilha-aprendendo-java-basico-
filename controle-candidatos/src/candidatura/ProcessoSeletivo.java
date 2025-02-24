package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String candidatos[] = { "Ana", "Bruno", "Carlos", "Daniela", "Eduardo" };
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
	}

	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuaTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuaTentando = !atendeu;
			if (continuaTentando) {
				tentativasRealizadas++;
			} else {
				System.out.println("Contato realizado com sucesso");
			}

		} while (continuaTentando && tentativasRealizadas < 3);
		if (atendeu) {
			System.out.println("Conseguimos contato com " + candidato + " na tentativa " + tentativasRealizadas);
		} else {
			System.out.println("Nao conseguimos contato com " + candidato + " com o número maximo de "
					+ tentativasRealizadas + " tentativas realizadas");
		}
	}

	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}

	static void imprimirSelecionados() {
		String candidatos[] = { "Ana", "Bruno", "Carlos", "Daniela", "Eduardo" };
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento: ");
		for (int i = 0; i < candidatos.length; i++) {
			System.out.println("O candidato de n° " + (i + 1) + " é " + candidatos[i]);
		}
	}

	static void selecaoCandidato() {
		String[] candidatos = { "Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor",
				"Juliana" };

		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendidoCandidato = valorPretendido();

			System.out.println("O candidato " + candidato + " solicitou esse salario: " + salarioPretendidoCandidato);
			if (salarioBase >= salarioPretendidoCandidato) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}

	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		} else {
			System.out.println("Aguardando o resultados dos demais candidatos");
		}
	}
}
