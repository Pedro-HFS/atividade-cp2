package br.com.titans.appcrud.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CarroDto {
	@NotBlank
	@NotNull
	private String fabricante;
	private String modelo;
	@NotBlank
	@NotNull
	private String cor;
	private Integer ano;
	private Double motorizacao;
	@NotNull
	private String carroceria;

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
