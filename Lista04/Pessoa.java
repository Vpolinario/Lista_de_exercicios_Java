package Lista04;

import java.util.Calendar;

public class Pessoa {
	
	private String nome, sobreNome;
	private int idade;
	private double altura, peso, imc;
	private String classCorporal;
	private Data dataNascimento = new Data();
	
	public Pessoa () {
		nome = "";
		sobreNome = "";
		idade  = 0;
		altura = 0.0;
		peso = 0.0;
		imc = 0.0;
		classCorporal = "";
		dataNascimento.setDia(0);
		dataNascimento.setMes(0);
		dataNascimento.setAno(0);		
	}
	
	public Pessoa(String nome, String sobreNome, int idade, double alutura, double peso, double imc, String classCorpora, Data dataNascimento ){
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.imc = imc;
		this.classCorporal = classCorporal;
		this.dataNascimento = dataNascimento;
		
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setaltura(double altura) {
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getImc() {
		return imc;
	}
	
	public void setImc(double imc) {
		this.imc = imc;
	}
	
	
	public String getClassCorporal() {
		return classCorporal;
	}
	
	public void setClassCorporal(String classCorporal) {
		this.classCorporal = classCorporal;
	}
	
	public Data getDataNascimento(){
		return dataNascimento;
	}
	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double CalculaIMC(double peso,double altura) {
		return imc = (peso/(Math.pow(altura,2)));
	}
	
	public String InformaObesidade(double imc) {
		if (imc < 18.5){
			classCorporal = "Abaixo do peso";			
		} else if (( imc >= 18.5) && (imc <=24.9)){
			classCorporal = "Peso normal";		
		}else if (( imc >= 25) && (imc <=29.9)){
			classCorporal = "Sobrepeso";		
		}else if (( imc >= 30) && (imc <=34.9)){
			classCorporal = "Obesidade grau 1 ";		
		}else if (( imc >= 35) && (imc <=29.9)){
			classCorporal = "Obesidade grau 2";		
		}else if (( imc >= 40)){
			classCorporal = "Obesidade grau 3";		
		}
		return classCorporal;
	}
	
	public int CalculaIdade (Data dataNascimento) {
		Calendar data_agora = Calendar.getInstance();
		return idade = (data_agora.get(Calendar.YEAR) - dataNascimento.getAno());
	}    
}
