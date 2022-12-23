package com.example.northwind.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.northwind.model.Oyun;

public interface PlayerDao extends JpaRepository<Oyun, Integer> {

}
