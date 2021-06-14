package com.tehilim.rhfunc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tehilim.rhfunc.entities.Func;
import com.tehilim.rhfunc.repositories.FuncRepository;

@RestController
@RequestMapping(name="/funcs")
public class FuncResource {
	
	@Autowired
	private FuncRepository funcRepository;
	
	@GetMapping
	public ResponseEntity<List<Func>> findAll() {
		List<Func> list = funcRepository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Func> findById(@PathVariable Long id) {
		Func func = funcRepository.findById(id).get();
		return ResponseEntity.ok(func);
	}

}
