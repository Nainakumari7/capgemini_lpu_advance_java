package com.prac;

import javax.persistence.*;
import java.util.List;

public class CommentsDAO {

	private EntityManager em;

	public CommentsDAO(EntityManager em) {
		this.em = em;
	}

	public void saveComment(Comments comment) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(comment);
		et.commit();
	}

	public Comments findComment(int id) {
		return em.find(Comments.class, id);
	}
}