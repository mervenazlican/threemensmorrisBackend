package com.example.northwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.northwind.model.Oyun;
import com.example.northwind.service.PlayerService;


@RestController
@RequestMapping("/game")
public class PlayersController {
	
	@Autowired
	private PlayerService playerService;
	
	@Autowired
	public PlayersController(PlayerService playerService) {
		this.playerService=playerService;
	}

	@GetMapping
	public List<Oyun> getOyuncular(){
		return playerService.getAllPlayers();
	}
	
	@PostMapping
	public Oyun createPlay(@RequestBody Oyun newOyun) {
		return playerService.saveOnePlayer(newOyun);
	}
	
	@GetMapping("/{oyuncuId}")
	public Oyun getOyun(@PathVariable Integer oyuncuId) {
		return playerService.getOnePlayers(oyuncuId);
	
	}
	
	@PutMapping("/{oyuncuId}")
	public Oyun updateOyuncu(@PathVariable Integer oyuncuId, @RequestBody Oyun newOyun) {
		return playerService.updateOnePlayers(oyuncuId,newOyun);
	}
	
	@DeleteMapping("/{oyuncuId}")
	public void deleteOyuncu(@PathVariable Integer oyuncuId) {
		playerService.deleteById(oyuncuId);
	}
}
