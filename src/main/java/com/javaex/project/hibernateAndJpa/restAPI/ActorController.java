package com.javaex.project.hibernateAndJpa.restAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.project.hibernateAndJpa.Business.IActorService;
import com.javaex.project.hibernateAndJpa.Entities.Actor;


@RestController
@RequestMapping("/api")

public class ActorController {
	private IActorService actorService ;

	@Autowired
	public ActorController(IActorService actorService) {
		this.actorService = actorService;
	}
	@GetMapping("/actors")
	public List<Actor> get(){
		return actorService.GetAll();
	}
	@PostMapping( "/add")
	public void add(@RequestBody Actor actor) {
		actorService.add(actor);
	}
	@PostMapping("/update")
	public void update(@RequestBody Actor actor) {
		actorService.update(actor);
	}
	@PostMapping("/delete")
	public void delete(@RequestBody Actor actor) {
		actorService.delete(actor);
	}
}
