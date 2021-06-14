package com.tehilim.rhfunc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tehilim.rhfunc.entities.Func;

public interface FuncRepository extends JpaRepository<Func, Long>{
	

}
