package com.prac;

import javax.persistence.*;

public class UsersDAO {

	private EntityManager em;

	public UsersDAO(EntityManager em) {
		this.em = em;
	}

	public void saveUser(Users user) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(user);
		et.commit();
	}

	public Users findUser(int id) {
		return em.find(Users.class, id);
	}

	public void updateUser(Users user) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(user);
		et.commit();
	}
}