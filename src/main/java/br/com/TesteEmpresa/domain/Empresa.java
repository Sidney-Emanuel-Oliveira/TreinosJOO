package br.com.TesteEmpresa.domain;

public class Empresa {
    public static void main(String[] args){
        Vendedor vendedor = new Vendedor("Jonas", 2100.03, "MT900", 9);

        System.out.println(vendedor.nome);
        vendedor.calcularBonus();
        System.out.println("-----------------------------------------------------------------");


        Gerente gerente = new Gerente("Lucas", 8000.82, "MT001", "DEPARTAMENTO DE VENDAS");
        System.out.println(gerente.nome);
        gerente.calcularBonus();

    }
}
