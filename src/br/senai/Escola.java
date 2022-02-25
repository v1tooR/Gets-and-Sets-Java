
package br.senai;

public class Escola {
    
        private int Cod;
	private String Nome;
	private String NomeEscola;
	private String Curso;
        private float N1,N2,N3,N4,Media;
	
        
	public int getCod() {
		return Cod;
	}
	public void setCod(int cod) {
		Cod = cod;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getNomeEscola() {
		return NomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		NomeEscola = nomeEscola;
	}
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String curso) {
		Curso = curso;
	}
        /* Aqui eu estanciei a colocação da media no print */
       
        public void setN1(float n1){
            N1 = n1;
        }
        public void setN2(float n2){
            N2 = n2;
        }
        public void setN3(float n3){
            N3 = n3;
        }
        public void setN4(float n4){
            N4 = n4;
        }
	
        public void CalculaMedia() {
		Media = (N1 + N2 + N3 + N4)/4;
		System.out.print("| A media final é: " + Media);
                if (Media >= 6){
                    System.out.print("| Aprovado\n");
                }else{
                    System.out.print("| Reprovado\n");
                }
	}
        
        public String Imprime() {
		String out = "";
		out += "Cód.: (" + Cod + ") ";
		out += "| Nome: " + Nome;
		out += " | Nome da Escola: " + NomeEscola;
		out += " | Curso: " + Curso;
                out += "| Media: "+ Media;
		return out;
	}
    }
    

