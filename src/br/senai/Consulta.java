
package br.senai;

import java.util.HashSet;
import java.util.Set;

public class Consulta {
    public static void main(String[] args) {
		
		Escola e = new Escola();
		Disciplina d1 = new Disciplina();
		Disciplina d2 = new Disciplina();
		Disciplina d3 = new Disciplina();
                
              
		e.setCod(1234);
		e.setNome("Victor Santos");
		e.setNomeEscola("SENAI Taubaté");
		e.setCurso("3TDS");
		d1.setDisciplina("Programação para Dispositivos Móveis - PPDM");
		d1.setPeriodo(3);
		d2.setDisciplina("Requisitos e Modelagem de Software - RMSO");
		d2.setPeriodo(3);
		d3.setDisciplina("Testes de Software - TSOF");
		d3.setPeriodo(3);
                e.setN1(10);
                e.setN2(9);
                e.setN3(8);
                e.setN4(10);
        
		
		String est = e.Imprime();
		String imp1 = d1.Imprime();
		String imp2 = d2.Imprime();
		String imp3 = d3.Imprime();
		
		System.out.println(est);
		System.out.println(imp1);
		System.out.println(imp2);
		System.out.println(imp3);
		e.CalculaMedia();
	}
}
