package web.invoice.models.dao;

import org.springframework.data.repository.CrudRepository;

import web.invoice.models.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente,Long>{
	
}
