package br.com.cadastro;

public class Funcionario {
	
	String nome;
	String departamento;
	String dataEntrada;
	String rg;
	double salario;
	boolean estaNaEmpresa;
	boolean demitido;
	
	public void bonifica (double aumento){
		salario = this.salario + aumento;
	}
	
	public void demite (){
		demitido = true;
	}
	
	public double calculaGanhoAnual (){
		return 1;
	}
	
	
}
