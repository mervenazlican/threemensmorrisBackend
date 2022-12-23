package com.example.northwind.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.northwind.dataAccess.PlayerDao;
import com.example.northwind.model.Oyun;

@Service
public class PlayerService implements PlayerServiceImpl {

	@Autowired
	private PlayerDao playerDao;
	
	public PlayerService(PlayerDao playerDao) {
		this.playerDao=playerDao;
	}
 
	@Override
	public List<Oyun> getAllPlayers() {
		return playerDao.findAll();
	}
	@Override
	public Oyun saveOnePlayer(Oyun newOyun) {
		return playerDao.save(newOyun);
	}
	@Override
	public Oyun getOnePlayers(Integer oyuncuId) {
		return playerDao.findById(oyuncuId).orElse(null);
	}
	@Override
	public Oyun updateOnePlayers(Integer oyuncuId, Oyun newOyun) {
		Optional<Oyun> oyunOptional = playerDao.findById(oyuncuId);
		if(oyunOptional.isPresent()) {
			Oyun oyuncuBul = oyunOptional.get();
			oyuncuBul.setOyuncuAdi(newOyun.getOyuncuAdi());
			oyuncuBul.setOyuncuHareketi(newOyun.getOyuncuHareketi());
			playerDao.save(oyuncuBul);
			return oyuncuBul;
		}else {
			return null;
		}
	}
	@Override
	public void deleteById(Integer oyuncuId) {
		playerDao.deleteById(oyuncuId);
		
	}
 
}
