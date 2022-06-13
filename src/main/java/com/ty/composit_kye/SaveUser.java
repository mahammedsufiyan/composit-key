package com.ty.composit_kye;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {

	public static void main(String[] args) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		User user = new User();
		
		UserID userId = new UserID();
		userId.setEmail("rana@gmail.com");
		userId.setPhone(998800);
		
		user.setUserId(userId);
		user.setName("Rana");
		user.setAge(35);
		user.setGender("male");
		user.setPassword("ran12@af");
		
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		
	}
}
