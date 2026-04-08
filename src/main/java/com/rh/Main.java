package com.rh;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João Silva", "123.456.789-00", 3000.00);
        
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Salário: R$ " + funcionario.getSalario());

        // Aumentar o salário em 10%
        funcionario.aumentarSalario(10);
        
        System.out.println("Salário após aumento: R$ " + funcionario.getSalario());
    }
}