package com.prac;

import javax.persistence.*;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("postgres");

		EntityManager em = emf.createEntityManager();

		BlogService service = new BlogService(em);

		Users user = new Users();
		user.setName("John");
		user.setPassword("12345");
		user.setEmail("john@gmail.com");

		service.registerUser(user);

		Post post = new Post();
		post.setTitle("Harry Potter");
		post.setContent("It's a book");

		service.createPost(1, post);

		Comments comment = new Comments();
		comment.setContent("Nice book");

		service.addComment(1, 1, comment);

		em.close();
		emf.close();
	}
}