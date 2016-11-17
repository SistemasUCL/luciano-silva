package models;

import javax.persistence.*;
import play.data.validation.Constraints.Required;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

@Entity
public class Usuario extends Model {

	@Id
	@GeneratedValue
	public Long id;

	@Required
	public String login;

	@Required
	public String senha;

	public Integer perfil; // 1 - Cliente; 0 - Admin
	
	@Required
	public String nome;
	
	@Required
	public String sobrenome;
	
	@Required
	public String email;
	
	@Required
	public String telefone;

	public static Finder<Long, Usuario> find = new Finder<Long, Usuario>(Usuario.class);

}