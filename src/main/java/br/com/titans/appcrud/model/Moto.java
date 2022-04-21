package br.com.titans.appcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Moto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String fabricante;
	private String modelo;
	private String cor;
	@Column(nullable = false)
	private Integer ano;
	@Column(nullable = false)
	private String cilindrada;
	private String assentos;

	public Moto() {

	}

	public Moto(Long id, String fabricante, String modelo, String cor, Integer ano, String cilindrada,
			String assentos) {
		super();
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.cilindrada = cilindrada;
		this.assentos = assentos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getAssentos() {
		return assentos;
	}

	public void setAssentos(String assentos) {
		this.assentos = assentos;
	}

}
