package br.com.fiap.jpa.dao;

public interface GenericDAO<T, K> {
	
	void insert(T entity);
	
	void update(T entity);
	
	void remove(K code);
	
	T search(K code);
	
	void commit();
	
}
