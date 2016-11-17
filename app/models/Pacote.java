package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
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
public class Pacote extends Model {

	@Id
	@GeneratedValue
	public Long id;

	public String nome;

	public Float valorTotal;
	
	public String descricao;
	
	public Integer qtdConvidados;

	@ManyToOne
	public Fornecedor fornecedor;
	
	@ManyToOne
	public Cliente cliente;
	
	@ManyToMany(cascade=CascadeType.ALL)
	public List<Fornecedor> f = new ArrayList<Fornecedor>();

	
	public String toString() {
		return nome;
	}

	public static Finder<Long, Pacote> find = new Finder<Long, Pacote>(Pacote.class);

	public Pacote() {
	}
}