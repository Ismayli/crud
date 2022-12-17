package springboot.crud;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springboot.crud.model.Clients;
import springboot.crud.repositories.ClientsRepository;


@SpringBootApplication
public class CrudApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
		
	}

	@Autowired
	private ClientsRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

		Clients c1 = new Clients("Rosberval", "981554022", "rosberval@email.com", "025.444.777.53");
		Clients c2 = new Clients("Roberta", "984557904", "robertinha@email.com", "063.254.737.23");
		Clients c3 = new Clients("Carina", "991403527", "carina20@email.com", "023.159.356.37");
		Clients c4 = new Clients("Debora", "984003578", "debora_santos@email.com", "012.211.947.11");
		Clients c5 = new Clients("Carol", "981333244", "carolzinha10@email.com", "036.008.322.79");
		Clients c6 = new Clients("Jecircleide", "991623177", "jecircleide@email.com", "026.555.212.57");
		Clients c7 = new Clients("Camila", "984002700", "camila_m@email.com", "017.423.678.99");
		
		repo.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7));
	}
}
