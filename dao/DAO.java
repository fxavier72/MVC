package dao;

import java.util.List;
import java.sql.Connection;

public abstract class DAO<T> {
	public Connection connect = ConnexionPostgreSql.getInstance();
	
	public abstract T create(T obj);
	public abstract T read(int code);
	public abstract List<T> readAll();
	public abstract T update(T obj);
	public abstract void delete(T obj);
}
