package web.invoice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.invoice.models.dao.IClienteDao;
import web.invoice.models.dao.IFacturaDao;
import web.invoice.models.dao.IProductoDao;
import web.invoice.models.entities.Cliente;
import web.invoice.models.entities.Factura;
import web.invoice.models.entities.Producto;

@Service
public class ClienteServicesImpl implements IClienteServices{
	
	@Autowired
	private IClienteDao clienteDao;
	
	@Autowired
	private IFacturaDao facturaDao;
	
	@Autowired
	private IProductoDao productoDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findbyId(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}

	@Override
	public Factura findFacturaById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Factura> findFacturaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Factura saveFactura(Factura factura) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFacturaById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> findProductoByNombre(String term) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
