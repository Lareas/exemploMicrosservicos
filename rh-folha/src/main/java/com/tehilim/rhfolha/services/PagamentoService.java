package com.tehilim.rhfolha.services;

import org.springframework.stereotype.Service;

import com.tehilim.rhfolha.entities.Pagamento;

@Service
public class PagamentoService {
	
	public Pagamento getPagamento(Long funcId, Integer dias) {
		return new Pagamento("Luiz", 250.0, dias);
		
	}
}
