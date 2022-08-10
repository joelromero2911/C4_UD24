package mainApp.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import mainApp.dto.Trabajador;

public interface ITrabajadorDAO extends JpaRepository<Trabajador, Long>{
	public List<Trabajador> findByTrabajo(String trabajo);
}
