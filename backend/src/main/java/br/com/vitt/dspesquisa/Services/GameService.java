package br.com.vitt.dspesquisa.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.vitt.dspesquisa.dto.GameDTO;
import br.com.vitt.dspesquisa.entities.Game;
import br.com.vitt.dspesquisa.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameDTO> findAll(){
		List<Game> list = gameRepository.findAll();
		
		return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
	}

}
