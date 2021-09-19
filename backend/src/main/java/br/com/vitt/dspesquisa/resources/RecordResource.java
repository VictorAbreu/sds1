package br.com.vitt.dspesquisa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vitt.dspesquisa.Services.RecordService;
import br.com.vitt.dspesquisa.dto.RecordDTO;
import br.com.vitt.dspesquisa.dto.RecordInsertDTO;


@RestController
@RequestMapping(value = "/records")
public class RecordResource {
	@Autowired
	private RecordService service;

	@PostMapping
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){
		
		RecordDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
		
	}
	
}
