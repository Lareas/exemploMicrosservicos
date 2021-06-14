package com.tehilim.rhfolha.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tehilim.rhfolha.entities.Pagamento;
import com.tehilim.rhfolha.services.PagamentoService;

@RestController
@RequestMapping(value = "/pagtos")
public class PagamentoResource {
	
	@Autowired
	private PagamentoService pagService;
		
	@GetMapping(value = "/{funcId}/dias/{dias}")
	public ResponseEntity<Pagamento> getPagamento(@PathVariable Long funcId, @PathVariable Integer dias) {
		Pagamento pagto = pagService.getPagamento(funcId, dias);
		return ResponseEntity.ok(pagto);
	}
	
}
