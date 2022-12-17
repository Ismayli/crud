package springboot.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.crud.model.Clients;

public interface ClientsRepository extends JpaRepository<Clients, Integer>{

}
