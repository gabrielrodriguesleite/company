package com.company.core;

public class App {

	public static void main(String[] args) {

		Colaboradores colaboradores = new Colaboradores();

		colaboradores.incluirFuncionario("Maria", "18/10/2000", "2009.44", "Operador");
		colaboradores.incluirFuncionario("João", "12/05/1990", "2284.38", "Operador");
		colaboradores.incluirFuncionario("Caio", "02/05/1961", "9836.14", "Coordenador");
		colaboradores.incluirFuncionario("Miguel", "14/10/1988", "19119.88", "Diretor");
		colaboradores.incluirFuncionario("Alice", "05/01/1995", "2234.68", "Recepcionista");
		colaboradores.incluirFuncionario("Heitor", "19/11/1999", "1582.72", "Operador");
		colaboradores.incluirFuncionario("Arthur", "31/03/1993", "4071.84", "Contador");
		colaboradores.incluirFuncionario("Laura", "08/07/1994", "3017.45", "Gerente");
		colaboradores.incluirFuncionario("Heloísa", "24/05/2003", "1606.85", "Eletricista");
		colaboradores.incluirFuncionario("Helena", "02/09/1996", "2799.93", "Gerente");

		colaboradores.imprimir();

		colaboradores.remove("João");
		colaboradores.imprimir();

		colaboradores.reajuste(10.0f);

		colaboradores.imprimir();

		colaboradores.maisIdoso();

		colaboradores.imprimirTabelaSalarios();

		colaboradores.imprimirTotalDeSalarios();

		colaboradores.imprimirAniversariantesDosMeses(new int[] { 10, 12 });

		colaboradores.emOrdemAlfabetica().imprimir();

		colaboradores.imprimir();

		colaboradores.imprimirAgrupadoPorFuncao();

	}
}
