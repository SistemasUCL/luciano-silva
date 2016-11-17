package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.avaje.ebean.Model;
import play.data.validation.Constraints.Required;

@Entity
public class Servico extends Model {

	@Id
	@GeneratedValue
	public Long id;

    public String tipo;
	
    public float valorServico;
	
    public String descricao;
	
    public List<String> topicos;
    
    
	public static Finder<Long, Servico> find = new Finder<Long, Servico>(Servico.class);
}