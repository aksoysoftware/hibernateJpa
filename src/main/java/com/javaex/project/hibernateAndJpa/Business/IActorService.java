package com.javaex.project.hibernateAndJpa.Business;

import java.util.List;

import com.javaex.project.hibernateAndJpa.Entities.Actor;

public interface IActorService {
	List<Actor> GetAll();
	void add(Actor actor);
	void update(Actor actor);
	void delete(Actor actor);
	Actor getById(int id);

}
