package com.spring.Di.SpringDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Condutor {

	public static void main(String[] args) {

		Condutor condutor = new Condutor(new Carro());
		condutor.automovel();
	}

	// Injeção de dependências

	@Autowired // Diz pro Spring que se trata de uma injeção de dependência
	private Veiculo veiculo;

	public Condutor(Veiculo obj) {
		this.veiculo = obj;
	}

	public void automovel() {
		veiculo.acao();
	}

}
