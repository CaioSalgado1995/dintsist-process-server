package br.com.utfpr.dis.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.remoting.rmi.RmiServiceExporter;

import br.com.utfpr.dis.services.IProcessamento;
import br.com.utfpr.dis.services.impl.ProcessamentoImpl;

@SpringBootApplication
@ComponentScan(basePackageClasses={ProcessamentoImpl.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	RmiServiceExporter exporter(ProcessamentoImpl processamentoImpl) {
		Class<IProcessamento> serviceInterface = IProcessamento.class;
		RmiServiceExporter exporter = new RmiServiceExporter();
		
		exporter.setServiceInterface(serviceInterface);
		exporter.setService(processamentoImpl);
		exporter.setServiceName(serviceInterface.getName());
		exporter.setRegistryPort(1099);
		
		return exporter;
	}
}
