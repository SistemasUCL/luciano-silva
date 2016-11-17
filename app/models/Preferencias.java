package models;

import java.util.List;

import javax.persistence.*;
import play.data.validation.Constraints.Required;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

@Entity
public class Preferencias extends Model {

	@Id
	@GeneratedValue
	public Long id;

	@Required
	public Integer qtdConvidados;


	public float qtdInvestimento;


	public String horario; //1-Manhã 2- Tarde 3- Noite Colocar como combo na tela


	public String localidade;

	public String detalhes;
	
	public List<String> topicos;
	
	public static Finder<Long, Preferencias> find = new Finder<Long, Preferencias>(Preferencias.class);

}