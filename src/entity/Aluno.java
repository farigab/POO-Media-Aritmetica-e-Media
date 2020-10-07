package entity;

public class Aluno {
	private String matricula;
	private String nome;
	private String disciplina;
	private Double nota1;
	private Double peso1;
	private Double nota2;
	private Double peso2;
	private Double totalPeso;
	private Double media=0.;
	private Double mediaPonderada=0.;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public Double getPeso1() {
		return peso1;
	}
	public void setPeso1(Double peso1) {
		this.peso1 = peso1;
	}
	public Double getPeso2() {
		return peso2;
	}
	public void setPeso2(Double peso2) {
		this.peso2 = peso2;
	}
	public Double getTotalPeso() {
		return totalPeso;
	}
	public void setTotalPeso(Double totalPeso) {
		this.totalPeso = totalPeso;
	}
	public Double getMediaPonderada() {
		return mediaPonderada;
	}
	public void setMediaPonderada(Double mediaPonderada) {
		this.mediaPonderada = mediaPonderada;
	}
	

	public Aluno(String matricula, String nome, String disciplina, Double nota1, Double peso1, Double nota2,
			Double peso2) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.peso1 = peso1;
		this.nota2 = nota2;
		this.peso2 = peso2;
	}
	
	public Aluno() {
		super();
	}
	
	@Override
	public String toString() {
		return "Aluno (matricula=" + matricula + ", nome=" + nome + ", disciplina=" + disciplina + ", nota1=" + nota1
				+ ", peso1=" + peso1 + ", nota2=" + nota2 + ", peso2=" + peso2 + ", totalPeso=" + totalPeso + ", media="
				+ media + ", mediaPonderada=" + mediaPonderada + ")";
	}

	public void gerarMedia() {
		
		this.media = (this.nota1 + this.nota2)/2;
	}
	
	public void gerarPeso() {
		this.totalPeso = this.peso1 + this.peso2;
	}
	
	public void gerarMediaPonderada() {
		this.mediaPonderada=(this.nota1*this.peso1 + this.nota2*this.peso2)/this.totalPeso;
	    }
	
//	public static void main(String[] args) {
//		Aluno a = new Aluno("20", "Gabriel", "java", 8., 2., 7., 5.);
//		a.gerarPeso();
//		a.gerarMedia();
//		a.gerarMediaPonderada();
//		System.out.println(a);
//	}
	}
