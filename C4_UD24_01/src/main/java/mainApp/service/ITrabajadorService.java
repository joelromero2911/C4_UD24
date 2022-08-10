package mainApp.service;

import java.util.List;

import mainApp.dto.Trabajador;

public interface ITrabajadorService {
	//Metodos del CRUD
	public List<Trabajador> listarTrabajadores(); //Listar All 
	
	public Trabajador guardarTrabajador(Trabajador trabajador);	//Guarda un cliente CREATE
	
	public Trabajador trabajadorXID(Long id); //Leer datos de un cliente READ
	
	public List<Trabajador> listarTrabajadorTrabajo(String trabajo);//Listar Clientes por campo nombre
	
	public Trabajador actualizarTrabajador(Trabajador trabajo); //Actualiza datos del cliente UPDATE
	
	public void eliminarTrabajador(Long id);// Elimina el cliente DELETE
}
