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
public class Endereco extends Model {

	@Id
	@GeneratedValue
	public Long id;

	@Required
	public String logradouro;

	@Required
	public Integer numero;

	public String complemento;

	@Required
	public String cep;

	@Required
	public String bairro;

	@Required
	public String cidade;

	@Required
	public String uf;

	public String toString() {
		return logradouro;
	}

	public static Finder<Long, Endereco> find = new Finder<Long, Endereco>(Endereco.class);

	public Endereco() {
	}
}