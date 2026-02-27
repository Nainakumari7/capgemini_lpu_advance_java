package com.prac;

import javax.persistence.EntityManager;
import java.util.List;

public class BlogService {

	private UsersDAO usersDAO;
	private PostDAO postDAO;
	private CommentsDAO commentsDAO;

	public BlogService(EntityManager em) {
		this.usersDAO = new UsersDAO(em);
		this.postDAO = new PostDAO(em);
		this.commentsDAO = new CommentsDAO(em);
	}

	public void registerUser(Users user) {
		usersDAO.saveUser(user);
	}

	public void createPost(int userId, Post post) {
		Users user = usersDAO.findUser(userId);
		post.setAuthor(user);
		postDAO.savePost(post);
		user.getPost().add(post);
		usersDAO.updateUser(user);
	}

	public void addComment(int userId, int postId, Comments comment) {
		Users user = usersDAO.findUser(userId);
		Post post = postDAO.findPost(postId);
		comment.setAuthor(user);
		comment.setPost(post);
		commentsDAO.saveComment(comment);
		user.getComment().add(comment);
		post.getComments().add(comment);
		usersDAO.updateUser(user);
		postDAO.updatePost(post);
	}
}