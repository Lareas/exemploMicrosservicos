package com.tehilim.rhfolha.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tehilim.rhfolha.entities.Func;
import com.tehilim.rhfolha.entities.Pagamento;

@Service
public class PagamentoService {
	
	@Value("${rh-func.host}")
	private String funcHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Pagamento getPagamento(Long funcId, Integer dias) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", "" + funcId);
		
		Func func = restTemplate.getForObject(funcHost + "/{id}", Func.class, uriVariables);
		return new Pagamento(func.getNome(), func.getSalarioDia(), dias);
		
	}
}
