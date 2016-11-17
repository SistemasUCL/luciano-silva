package models;

import javax.persistence.Id;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

//@Entity
public class fornecedor_pacote extends Model {

	@Id
	public Long fornecedor_id;

	@Id
	public Long pacote_id;

	
	public static Finder<Long, fornecedor_pacote> find = 
			new Finder<Long, fornecedor_pacote>(fornecedor_pacote.class);

			
	public fornecedor_pacote() {
	}
	
}