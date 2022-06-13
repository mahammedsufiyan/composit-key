package com.ty.composit_kye;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetUserMain {
	
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String jpql = "select u from User u where u.userId.email=?1";
		Query query = entityManager.createQuery(jpql);
		query.setParameter(1, "rana@gmail.com");
		
		List<User> user = query.getResultList();
		if(user.size()>0) {
			for(User u : user) {
				System.out.println(u.getName());
				System.out.println(u.getUserId().getEmail());
				System.out.println(u.getUserId().getPhone());
				System.out.println(u.getAge());
			}
		}
	}
}
