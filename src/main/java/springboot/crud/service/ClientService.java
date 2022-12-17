package springboot.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.crud.model.Clients;
import springboot.crud.repositories.ClientsRepository;

@Service
public class ClientService {

	@Autowired
	private ClientsRepository repo;

	public Clients update(Clients clients, Integer id) {
		Clients newClient = findById(id);
		newClient.setCpf(clients.getCpf());
		newClient.setEmail(clients.getEmail());
		newClient.setNome(clients.getNome());
		newClient.setNumero(clients.getNumero());
		return repo.save(newClient);
	}
	
	public Clients findById(Integer id) {
		Optional<Clients> people = repo.findById(id);
		return people.orElse(null);
	}
	
	public Object save(Clients clients) {
		return repo.save(clients);
	}
	
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
	public List<Clients> findAll() {
		return repo.findAll();
	}
}
