package models;

import java.time.LocalDate;

import javax.persistence.*;
import play.data.validation.Constraints.Required;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

@Entity
public class Administrador extends Model {

	@Id
	@GeneratedValue
	public Long id;

	@Required
	public LocalDate dtVisita;

	@Required
	public String localVisita;
	
	@ManyToOne
	public Usuario usuario;

	@ManyToOne
	public Cliente cliente;
	
	
	public static Finder<Long, Administrador> find = new Finder<Long, Administrador>(Administrador.class);

}