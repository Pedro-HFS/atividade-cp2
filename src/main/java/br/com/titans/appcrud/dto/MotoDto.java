package br.com.titans.appcrud.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MotoDto {
	@NotBlank
	@NotNull
	private String fabricante;
	private String modelo;
	private String cor;
	@NotNull
	private Integer ano;
	@NotBlank
	@NotNull
	private String cilindrada;
	private String assentos;

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
