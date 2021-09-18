package br.com.vitt.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitt.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
