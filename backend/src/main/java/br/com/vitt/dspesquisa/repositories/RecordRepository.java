package br.com.vitt.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitt.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
