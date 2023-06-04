package web.invoice.services;

import java.util.List;

import web.invoice.models.entities.Cliente;
import web.invoice.models.entities.Factura;
import web.invoice.models.entities.Producto;

public interface IClienteServices {

	public List<Cliente> findAll();
	
	public void save(Cliente cliente);
	
	public Cliente findbyId(Long id);
	
	public void delete(Long id);
	
	public Factura findFacturaById(Long id);
	
	public List<Factura> findFacturaAll();
	
	public Factura saveFactura(Factura factura);
	
	public void deleteFacturaById(Long id);
	
	public List<Producto> findProductoByNombre(String term);
}
