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
public class Imagem extends Model {

	@Id
	@GeneratedValue
	public Long id;

	@Required
	public byte[] foto;

	@ManyToOne
	public Produto produto;

	public String toString() {
		return foto.toString();
	}

	public static Finder<Long, Imagem> find = new Finder<Long, Imagem>(Imagem.class);

	public Imagem() {
	}
}
