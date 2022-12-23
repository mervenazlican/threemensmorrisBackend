package com.example.northwind.service;

import java.util.List;

import com.example.northwind.model.Oyun;

public interface PlayerServiceImpl {

	List<Oyun> getAllPlayers();
	
	Oyun saveOnePlayer(Oyun newOyun);
	
	Oyun getOnePlayers(Integer oyuncuId);
	
	Oyun updateOnePlayers(Integer oyuncuId, Oyun newOyun);
	
	void deleteById(Integer oyuncuId);
}
