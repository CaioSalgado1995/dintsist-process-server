package br.com.utfpr.dis.services.impl;

import org.springframework.stereotype.Service;

import br.com.utfpr.dis.services.IProcessamento;

@Service
public class ProcessamentoImpl implements IProcessamento {

	public int[] processaImagem(int[] vetor) {
		System.out.println("Chegou no servidor");
		return null;
	}

}
