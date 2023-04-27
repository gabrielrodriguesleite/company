package com.company.core;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Funcionario extends Pessoa{
	private String funcao;
	private BigDecimal salario;
	
	public Funcionario(String nome, String nascimento, String salario, String funcao) {
		super(nome, nascimento);
		this.salario = new BigDecimal(salario);
		this.funcao = funcao;
	}
		
	public BigDecimal getSalario() {
		return salario;
	}
	
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	public String getFuncao() {
		return funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String quantosSalarios() {

		return this.salario
				.divide(new BigDecimal(1212), RoundingMode.HALF_EVEN)
				.setScale(2, RoundingMode.HALF_EVEN)
				.toString();
	}
}
