package com.javaex.project.hibernateAndJpa.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.project.hibernateAndJpa.Entities.Actor;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


@Repository
public class HibernateActorDal implements IActorDal {

	//JPA--> ORM JAVA STANDARD
	private EntityManager entityManager;
	
	
	
	@Autowired
	public HibernateActorDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	//AOP ASCEPT ORIENTED PROGRAMMING
	@Override
	@Transactional
	public List<Actor> GetAll() {
		Session session= entityManager.unwrap(Session.class);
		List<Actor> actors = session.createQuery("From actor",Actor.class).getResultList();
		 return actors;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void add(Actor actor) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(actor);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void update(Actor actor) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(actor);		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void delete(Actor actor) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(actor);
	}

	@Override
	public Actor getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Actor actor = session.get(Actor.class,id);
		return actor;

	}

	
}
