package br.com.vitt.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vitt.dspesquisa.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
