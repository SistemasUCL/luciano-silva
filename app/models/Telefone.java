package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

import play.data.validation.Constraints.Required;

//@Entity
public class Telefone extends Model {

	@Id
	@GeneratedValue
	public Long id;

	@Required
    public String ddd;
    
    @Required
	public String numero;

	@ManyToOne
	public Cliente cliente;
	
	public String toString() {
		return ddd + numero;
	}

	public static Finder<Long, Telefone> find = new Finder<Long, Telefone>(Telefone.class);

	public Telefone() {
	}
}