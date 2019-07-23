package com.proxibanque.dao;

import java.util.ArrayList;

/**
 * inteface DAO generique
 * 
 * @author BBW
 * 
 * @param <T>
 */
public interface IDao<T> {
	boolean create(T t) throws Exception;

	boolean update(T t) throws Exception;

	boolean delete(T t) throws Exception;

	T getById(int id) throws Exception;

	ArrayList<T> getAll() throws Exception;

}
