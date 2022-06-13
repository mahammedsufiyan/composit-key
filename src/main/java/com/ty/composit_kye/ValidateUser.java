package com.ty.composit_kye;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ValidateUser {

		public static void main(String[] args) {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			Query query = entityManager.createQuery("select u from User u where u.userId.email=?1 and u.password=?2");
			query.setParameter(1, "rana@gmail.com");
			query.setParameter(2, "ran12@af");
			
			List<User> user = query.getResultList();
			if(user.size()>0) {
				System.out.println("****** User is Valid ******");
				for(User usr:user) {
					System.out.println(usr.getName());
					System.out.println(usr.getUserId().getEmail());
					System.out.println(usr.getUserId().getPhone());
					System.out.println(usr.getGender());
				}
			}
					
		}
}
