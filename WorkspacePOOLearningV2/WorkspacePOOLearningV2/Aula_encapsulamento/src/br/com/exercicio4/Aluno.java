package br.com.exercicio4;

public class Aluno {
	private String nome;
	private int matricula;
	private String curso;
	private double nota;
	
	public Aluno(String nome, int matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public String getCurso() {
		return curso;
	}
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		
		if(nota<0 || nota > 10) {
			this.nota = 0;
		}else {
			this.nota = nota;
		}
	}
}
