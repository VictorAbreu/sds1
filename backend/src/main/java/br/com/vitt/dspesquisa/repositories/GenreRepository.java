package br.com.vitt.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitt.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
