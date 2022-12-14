package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mainApp.dto.Trabajador;
import mainApp.service.TrabajadorServiceImpl;

@RestController
@RequestMapping("/api")
public class TrabajadorController {
	
	@Autowired
	TrabajadorServiceImpl trabajadorServiceImpl;

	@GetMapping("/trabajadores")
	public List<Trabajador> listarTrabajadores(){
		return trabajadorServiceImpl.listarTrabajadores();
	}
	
	//listar Clientes por campo nombre
	@GetMapping("/trabajadores/trabajo/{trabajo}")
	public List<Trabajador> listarTrabajadorTrabajo(@PathVariable(name="trabajo") String trabajo) {
	    return trabajadorServiceImpl.listarTrabajadorTrabajo(trabajo);
	}
	
	
	@PostMapping("/trabajadores")
	public Trabajador salvarTrabajador(@RequestBody Trabajador trabajador) {
		trabajador.setSalario();
		return trabajadorServiceImpl.guardarTrabajador(trabajador);
	}
	
	
	@GetMapping("/trabajadores/{id}")
	public Trabajador trabajadorXID(@PathVariable(name="id") Long id) {
		
		Trabajador trabajador_xid= new Trabajador();
		
		trabajador_xid=trabajadorServiceImpl.trabajadorXID(id);
		
		System.out.println("Trabajador XID: "+trabajador_xid);
		
		return trabajador_xid;
	}
	
	@PutMapping("/trabajadores/{id}")
	public Trabajador actualizarTrabajador(@PathVariable(name="id")Long id,@RequestBody Trabajador trabajador) {
		
		Trabajador trabajador_seleccionado= new Trabajador();
		Trabajador trabajador_actualizado= new Trabajador();
		
		trabajador_seleccionado= trabajadorServiceImpl.trabajadorXID(id);
		
		trabajador_seleccionado.setNombre(trabajador.getNombre());
		trabajador_seleccionado.setTrabajo(trabajador.getTrabajo());
		trabajador_seleccionado.setSalario();
		
		trabajador_actualizado = trabajadorServiceImpl.actualizarTrabajador(trabajador_seleccionado);
		
		System.out.println("El trabajador actualizado es: "+ trabajador_actualizado);
		
		return trabajador_actualizado;
	}
	
	@DeleteMapping("/trabajadores/{id}")
	public void eliminarTrabajador(@PathVariable(name="id")Long id) {
		trabajadorServiceImpl.eliminarTrabajador(id);
	}
}
