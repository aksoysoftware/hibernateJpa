package com.javaex.project.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaex.project.hibernateAndJpa.DataAccess.IActorDal;
import com.javaex.project.hibernateAndJpa.Entities.Actor;


@Service
public class ActorManager implements IActorService{

	private IActorDal actorDal;
	
	
	@Autowired 
	public ActorManager(IActorDal actorDal) {
		
		this.actorDal = actorDal;
	}
	@Transactional
	@Override
	public List<Actor> GetAll() {
		
		return this.actorDal.GetAll();
	}
	@Transactional
	@Override
	public void add(Actor actor) {
			this.actorDal.add(actor);
	}
	@Transactional
	@Override

	public void update(Actor actor) {

		this.actorDal.update(actor);		
	}
	
	@Transactional
	@Override
	public void delete(Actor actor) {
		this.actorDal.delete(actor);
	}
	@Override
	public Actor getById(int id) {

		return this.actorDal.getById(id);
	}

	
}
