package mainApp.dto;

import javax.persistence.*;

@Entity
@Table(name="trabajador")
public class Trabajador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "trabajo")
	private String trabajo;
	@Column(name = "salario")
	private double salario;
	
	public Trabajador() {
		
	}
	
	/**
	 * @param id
	 * @param nombre
	 * @param trabajo
	 * @param salario
	 */
	public Trabajador(Long id, String nombre, String trabajo) {
		this.id = id;
		this.nombre = nombre;
		
		for (Trabajo tra : Trabajo.values()) { 
		    if(trabajo.equals(tra.toString())) {
		    	this.trabajo = trabajo;
		    }
		}
		
		if (this.trabajo.equals(Trabajo.informatico)) {
			this.salario = 1000.0;
		} else if (this.trabajo.equals(Trabajo.politico)) {
			this.salario = 1200.0;
		} else {
			this.salario = 0.0;
		}
	}
	
	public enum Trabajo {
	    informatico,
	    politico
	  }

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the trabajo
	 */
	public String getTrabajo() {
		return trabajo;
	}

	/**
	 * @param trabajo the trabajo to set
	 */
	public void setTrabajo(String trabajo) {
		for (Trabajo tra : Trabajo.values()) { 
		    if(trabajo.equals(tra.toString())) {
		    	this.trabajo = trabajo;
		    }
		}
	}

	/**
	 * @return the salario
	 */
	public Double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario() {
		if (this.trabajo.equals((Trabajo.informatico).toString())) {
			this.salario = 1000.0;
		} else if (this.trabajo.equals((Trabajo.politico).toString())) {
			this.salario = 1200.0;
		} else {
			this.salario = 0.0;
		}
	}
	
	
}
