package web.invoice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import web.invoice.models.entities.Factura;
import web.invoice.models.entities.Producto;
import web.invoice.services.IClienteServices;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;

@RestController
@SessionAttributes("/api")
public class FacturaControllers {

	@Autowired
	private IClienteServices clienteService;	
	
	
	@GetMapping("/facturas/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Factura show(@PathVariable Long id) {
		return clienteService.findFacturaById(id);
	}
	
	@GetMapping("/facturas")
	@ResponseStatus(HttpStatus.OK)
	public List<Factura> index() {
		return clienteService.findFacturaAll();
	}
	
	@DeleteMapping("/facturas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.deleteFacturaById(id);
	}
	
	@GetMapping("/facturas/filtrar-productos/{term}")
	@ResponseStatus(HttpStatus.OK)
	public List<Producto> filtrarProductos(@PathVariable String term){
		return clienteService.findProductoByNombre(term);
	}
	
	@PostMapping("/facturas")
	@ResponseStatus(HttpStatus.CREATED)
	public Factura crear(@RequestBody Factura factura) {
		return clienteService.saveFactura(factura);
	}
}
