/*
 * Copyright (c) 2021. Dandelion tutorials
 */

package com.example.demo.service;

import com.example.demo.model.PlayerInput;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.example.demo.model.Player;

public interface PlayerService {

  Mono<Player> getPlayerById(Integer id);
  Mono<Player> getPlayerByName(String name);
  Flux<Player> getAllPlayers();
  Flux<Player> getPlayersByClub(String club);
  Flux<Player> getPlayersByNationality(String nationality);
  Mono<Player> addPlayer(PlayerInput playerInput);
  Mono<Player> updatePlayer(Integer id, PlayerInput playerInput);
  Mono<Player> deletePlayerById(Integer id);
  Mono<Player> deletePlayerByName(String name);

}
