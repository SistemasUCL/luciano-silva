package models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.avaje.ebean.Model;
import play.data.validation.Constraints.Required;


//@Entity
public class Categoria extends Model{

	@Id
	@GeneratedValue
	public Long id;

	@Required
	public String nome;

	@Required
	public String descricao;
	
	
	public static Finder<Long, Categoria> find = new Finder<Long, Categoria>(Categoria.class); 
	
}
