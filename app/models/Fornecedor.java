package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

import play.data.validation.Constraints.Required;

@Entity
public class Fornecedor extends Model {

	@Id
	@GeneratedValue
	public Long id;

	@Required
	public String nome;

	public String descricao;

	public String site;

	public Integer minConvidados;
	
	public Integer maxConvidados;
	
	public float valor;
	
	@ManyToOne
	public Usuario usuario;
	
	@ManyToOne
	public Servico servico;
	
	@ManyToMany(mappedBy="f") 
    public List<Pacote> pacote = new ArrayList<Pacote>();

	public String toString() {
		return nome;
	}

	public static Finder<Long, Fornecedor> find = new Finder<Long, Fornecedor>(Fornecedor.class);

	public Fornecedor() {
	}
	
}