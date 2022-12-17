package springboot.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.crud.model.Clients;
import springboot.crud.service.ClientService;

@RestController
@RequestMapping("/clientes")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public ResponseEntity<List<Clients>> findAll() {
		List<Clients> Rosberval = clientService.findAll();
		return ResponseEntity.ok().body(Rosberval);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Clients> findById(@PathVariable int id) {
		Clients client = clientService.findById(id);
		return ResponseEntity.ok().body(client);
	}
	
	@PostMapping
	public ResponseEntity<Clients> created(@RequestBody Clients clients) {
		clients = (Clients) clientService.save(clients);
		return ResponseEntity.ok().body(clients);
	}
	
	@PutMapping(path ="/{id}")
	public ResponseEntity<Clients> update(@RequestBody Clients clients , @PathVariable Integer id)  {
		Clients pessoa = clientService.update(clients, id);
		return ResponseEntity.ok().body(pessoa);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable int id){
		clientService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}