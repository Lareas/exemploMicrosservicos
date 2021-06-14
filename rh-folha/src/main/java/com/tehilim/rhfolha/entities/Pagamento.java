package com.tehilim.rhfolha.entities;

import java.io.Serializable;

public class Pagamento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private Double salarioDia;
	private Integer dias;
	
	public Pagamento() {
		super();
	}

	public Pagamento(String nome, Double salarioDia, Integer dias) {
		super();
		this.nome = nome;
		this.salarioDia = salarioDia;
		this.dias = dias;
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

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}
	
	public Double getTotal() {
		return dias * salarioDia;
	}
}
