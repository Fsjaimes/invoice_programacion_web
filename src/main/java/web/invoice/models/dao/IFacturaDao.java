package web.invoice.models.dao;

import org.springframework.data.repository.CrudRepository;

import web.invoice.models.entities.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

}
