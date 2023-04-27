package com.company.core;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;

public class Colaboradores {
	private ArrayList<Funcionario> funcionarios;

	public Colaboradores() {
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public void incluirFuncionario(String nome, String nascimento, String salario, String funcao) {

		this.funcionarios.add(new Funcionario(nome, nascimento, salario, funcao));
	}

	public void remove(String nome) {
		this.funcionarios.removeIf(f -> (f.getNome() == nome));
	}

	public void imprimir() {
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%10s   %15s   R$%10s   %15s\n", "Nome", "Data Nascimento", "Salário", "Função");
		for (Funcionario f : this.funcionarios) {
			System.out.printf("%10s   %15s   R$%10s   %15s\n", f.getNome(), f.getNascimentoFormatado(),
					this.formatarMoeda(f.getSalario()), f.getFuncao());
		}
		System.out.println("----------------------------------------------------------------");
	}

	public void reajuste(float porcentagem) {

		this.funcionarios.forEach(f -> {
			f.setSalario(f.getSalario().multiply(new BigDecimal((100.0f + porcentagem) / 100.0f)));
		});

	}

	public void maisIdoso() {

		Funcionario fa = this.funcionarios.get(0);

		for (Funcionario fb : this.funcionarios) {
			if (fb.getNascimento().isBefore(fa.getNascimento())) {
				fa = fb;
			}
		}
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%10s   %15s\n", "Nome", "Data Nascimento");
		System.out.printf("%10s   %15s\n", fa.getNome(), fa.getNascimentoFormatado());
		System.out.println("----------------------------------------------------------------");
	}

	public void imprimirTabelaSalarios() {
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%10s   %15s   %10s   %15s\n", "Nome", "Data Nascimento", "Salários", "Função");
		for (Funcionario f : this.funcionarios) {
			System.out.printf("%10s   %15s   %10s   %15s\n", f.getNome(), f.getNascimentoFormatado(),
					f.quantosSalarios(), f.getFuncao());
		}
		System.out.println("----------------------------------------------------------------");

	}

	public void imprimirTotalDeSalarios() {
		BigDecimal total = new BigDecimal(0);

		for (Funcionario f : this.funcionarios) {
			total = total.add(f.getSalario());
		}
		System.out.println("----------------------------------------------------------------");
		System.out.printf("Total dos salários\n");
		System.out.printf("    R$ %s\n", this.formatarMoeda(total));
		System.out.println("----------------------------------------------------------------");

	}

	private String formatarMoeda(BigDecimal valor) {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		symbols.setDecimalSeparator(',');
		symbols.setGroupingSeparator('.');

		// https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html
		DecimalFormat format = new DecimalFormat("###,###.00");
		format.setDecimalFormatSymbols(symbols);

		return format.format(valor).toString();
	}

	public void imprimirAniversariantesDosMeses(int[] meses) {
		System.out.println("----------------------------------------------------------------");

		List<Month> mesesFiltrar = Arrays.stream(meses).mapToObj(mes -> Month.of(mes)).collect(Collectors.toList());

		List<Funcionario> aniversariantes = this.funcionarios.stream()
				.filter(obj -> mesesFiltrar.contains(obj.getNascimento().getMonth())).collect(Collectors.toList());

		System.out.printf("Funcionários aniversariantes dos meses %s:\n", mesesFiltrar);
		for (Funcionario a : aniversariantes) {
			System.out.println(a.getNome());
		}

		System.out.println("----------------------------------------------------------------");
	}

	public Colaboradores emOrdemAlfabetica() {
		ArrayList<Funcionario> f = new ArrayList<Funcionario>(this.funcionarios);
		Collections.sort(f, (f1, f2) -> f1.getNome().compareTo(f2.getNome()));
		Colaboradores c = new Colaboradores();
		c.setFuncionarios(f);
		return c;
	}

	private void setFuncionarios(ArrayList<Funcionario> f) {
		this.funcionarios = f;
	}

	public void imprimirAgrupadoPorFuncao() {
		System.out.println("----------------------------------------------------------------");
		Map<String, List<Funcionario>> mapa = new HashMap<>();
		for (Funcionario f : this.funcionarios) {
			String chave = f.getFuncao();
			List<Funcionario> lista = mapa.getOrDefault(chave, new ArrayList<>());
			lista.add(f);
			mapa.put(chave, lista);
		}

		for (Map.Entry<String, List<Funcionario>> entrada : mapa.entrySet()) {

			System.out.printf("%15s: ", entrada.getKey());
			for (Funcionario f : entrada.getValue()) {
				System.out.printf(" %10s ", f.getNome());
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------");

	}

}
