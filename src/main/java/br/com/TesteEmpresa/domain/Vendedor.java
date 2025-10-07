package br.com.TesteEmpresa.domain;

public class Vendedor extends Funcionario {
    //atributos
    protected int totalVendaMes;

    //constructor

    public Vendedor(String nome, Double salario, String matricula, int totalVendaMes){
        super(nome, salario, matricula);
        this.totalVendaMes = totalVendaMes;
    }

    //getters

    public int getTotalVendaMes(){
        return totalVendaMes;
    }
    //setters

    public void setTotalVendaMes(int totalVendaMes){
        this.totalVendaMes = totalVendaMes;
    }
    public void setBonus(){
       this.bonus = (salario * 0.5) + (0.2 * totalVendaMes);
    }

    @Override
    public void calcularBonus(){
        System.out.printf("A bonificação é de: %.2f%n", this.salario * 0.05 + 0.02 * totalVendaMes);
    }

}
