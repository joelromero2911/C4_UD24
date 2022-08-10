package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.ITrabajadorDAO;
import mainApp.dto.Trabajador;

@Service
public class TrabajadorServiceImpl  implements ITrabajadorService{

	@Autowired
	ITrabajadorDAO iTrabajadorDAO;
	
	@Override
	public List<Trabajador> listarTrabajadores() {
		return iTrabajadorDAO.findAll();
	}

	@Override
	public Trabajador guardarTrabajador(Trabajador trabajador) {
		return iTrabajadorDAO.save(trabajador);
	}

	@Override
	public Trabajador trabajadorXID(Long id) {
		return iTrabajadorDAO.findById(id).get();
	}

	@Override
	public List<Trabajador> listarTrabajadorTrabajo(String trabajo) {
		return iTrabajadorDAO.findByTrabajo(trabajo);
	}

	@Override
	public Trabajador actualizarTrabajador(Trabajador trabajo) {
		return iTrabajadorDAO.save(trabajo);
	}

	@Override
	public void eliminarTrabajador(Long id) {
		iTrabajadorDAO.deleteById(id);
	}

}
