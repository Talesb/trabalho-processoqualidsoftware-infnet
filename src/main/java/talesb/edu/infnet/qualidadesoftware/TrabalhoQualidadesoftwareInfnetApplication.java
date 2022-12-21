package talesb.edu.infnet.qualidadesoftware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import talesb.edu.infnet.qualidadesoftware.service.TicketService;

@SpringBootApplication
@ComponentScan("talesb.edu.infnet.qualidadesoftware")
public class TrabalhoQualidadesoftwareInfnetApplication implements CommandLineRunner{

	@Autowired
	private TicketService service;
	
	public static void main(String[] args) {
		SpringApplication.run(TrabalhoQualidadesoftwareInfnetApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		service.printTicketinformation(1);
	}
 
	
	
 
	
	
}
