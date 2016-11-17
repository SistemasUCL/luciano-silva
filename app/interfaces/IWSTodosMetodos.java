package interfaces;

import java.io.Serializable;

import com.avaje.ebean.Model;

public interface IWSTodosMetodos<T extends Model, PK extends Serializable> {
	T create(T t);

	T read(PK id);

	T update(T t);

	void delete(T t);
}