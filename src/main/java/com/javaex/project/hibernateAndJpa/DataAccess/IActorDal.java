package com.javaex.project.hibernateAndJpa.DataAccess;

import java.util.List;

import com.javaex.project.hibernateAndJpa.Entities.Actor;

public interface IActorDal {
	
	List<Actor> GetAll();
	void add(Actor actor);
	void update(Actor actor);
	void delete(Actor actor);
	Actor getById(int id);
	

}
