package models;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

import play.data.validation.Constraints.Required;

@Entity
public class Cliente extends Model {

	@Id
	@GeneratedValue
	public Long id;

	@Required
	public String nomeNoiva;
	
	@Required
	public String nomeNoivo;

	@Required
	public LocalDate dataCasamento;
	
	@ManyToOne
	public Usuario usuario;
	
	@ManyToOne
	public Preferencias preferencia;
	
	
	public String toString() {
		return nomeNoiva;
	}

	public static Finder<Long, Cliente> find = new Finder<Long, Cliente>(Cliente.class);

	public Cliente() {
	}
}