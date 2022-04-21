package br.com.titans.appcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String fabricante;

	private String modelo;

	@Column(nullable = false)
	private String cor;

	private Integer ano;

	private Double motorizacao;

	private String carroceria;

	public Carro() {

	}

	public Carro(Long id, String fabricante, String modelo, String cor, Integer ano, Double motorizacao,
			String carroceria) {
		super();
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.motorizacao = motorizacao;
		this.carroceria = carroceria;
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

	public Double getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(Double motorizacao) {
		this.motorizacao = motorizacao;
	}

	public String getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}

}
