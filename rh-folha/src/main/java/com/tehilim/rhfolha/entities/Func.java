package com.tehilim.rhfolha.entities;

import java.io.Serializable;

public class Func implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private Double salarioDia;
	
	public Func () {
		
	}

	public Func(Long id, String nome, Double salarioDia) {
		super();
		this.id = id;
		this.nome = nome;
		this.salarioDia = salarioDia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioDia() {
		return salarioDia;
	}

	public void setSalarioDia(Double salarioDia) {
		this.salarioDia = salarioDia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Func other = (Func) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
