package br.com.utfpr.dis.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.utfpr.dis.services.IProcessamento;

@Service
public class ProcessamentoImpl implements IProcessamento {

	public int[] processaImagem(List<Double> ganho) {
		System.out.println("Chegou no servidor");
		System.out.println(ganho.size());
		
		return null;
	}
	
	private List<Double> carregaArquivoG1() {
		return null;
	}

}
