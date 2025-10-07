package br.com.TesteEmpresa.domain;

public class Funcionario {

    //atributos

    protected String nome;
    protected Double salario;
    protected String matricula;
    protected Double bonus;

    //constructor

    public Funcionario(String nome, Double salario, String matricula) {
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //metodo

    public void calcularBonus() {
        this.bonus = bonus * this.salario;
    }
}
