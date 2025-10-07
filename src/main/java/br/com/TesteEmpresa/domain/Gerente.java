package br.com.TesteEmpresa.domain;

public class Gerente extends Funcionario {
    //atributos

    protected String departamento;

    //constructor

    public Gerente(String nome, Double salario, String matricula, String departamento){
        super(nome, salario, matricula);
        this.departamento = departamento;
    }

    //getters

    public String getDepartamento(){
        return departamento;
    }
    //setters

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    @Override
    public void calcularBonus(){
        System.out.printf("A bonificação é de: %.2f%n", this.salario * (10.0/100.0));
    }

}
