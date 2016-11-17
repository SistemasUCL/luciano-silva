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
public class Produto extends Model {

	@Id
	@GeneratedValue
	public Long id;

	@Required
	public String nome;

	@Required
	public String descricao;

	@Required
	public Float peso;

	@Required
	public Float tamanho;

	@Required
	public Float preco;

	@ManyToOne
	public Pedido pedido;

	@ManyToOne 
	public Categoria categoria;
	
	public String imagem;


	public String toString() {
		return nome;
	}
	
	

	public static Finder<Long, Produto> find = new Finder<Long, Produto>(Produto.class);

	public Produto() {
	}
	
}