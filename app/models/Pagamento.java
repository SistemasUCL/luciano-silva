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
public class Pagamento extends Model {

	@Id
	@GeneratedValue
	public Long id;

	public Boolean ativo;

	public String toString() {
		return ativo.toString();
	}

	public static Finder<Long, Pagamento> find = new Finder<Long, Pagamento>(Pagamento.class);

	public Pagamento() {
	}
}