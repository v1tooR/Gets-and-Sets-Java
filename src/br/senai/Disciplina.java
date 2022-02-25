
package br.senai;

public class Disciplina {
    private String Disciplina;
	private int periodo;
	
	public String getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	public String Imprime() {
		String out = "";
		out += " | Disciplina: " + Disciplina;
		out += " | Período: " + periodo + "º termo \n";
		return out;
	}
}
