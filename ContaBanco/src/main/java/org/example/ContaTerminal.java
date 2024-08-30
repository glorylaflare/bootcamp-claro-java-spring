package org.example;
import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeCliente;
        String numeroDaAgencia;
        int numeroDaConta;
        double saldo;
        String numero;

        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = sc.nextLine();

        while(true){
            System.out.println("Por favor, digite o número da agência:");
            numeroDaAgencia = sc.next();
            if(numeroDaAgencia.length() == 4) {
                break;
            } else {
                System.out.println("Número da agência é inválido. Tente novamente.");
            }

        }
        while(true){
            System.out.println("Por favor, digite o número da conta (apenas números):");
            numeroDaConta = sc.nextInt();
            numero = Integer.toString(numeroDaConta);
            if(numero.length() >= 4) {
                numero = numero.substring(0,numero.length()-1) + "-" + numero.substring(numero.length()-1);
                break;
            } else {
                System.out.println("Número da conta é inválido. Tente novamente.");
            }

        }
        while (true) {
            System.out.println("Por favor, digite o seu saldo:");
            saldo = sc.nextDouble();
            if (saldo >= 0) {
                break;
            } else {
                System.out.println("Saldo inválido. O saldo não pode ser negativo.");
            }
        }

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f já está disponível para saque",
                nomeCliente.toUpperCase(), numero, numeroDaAgencia, saldo);

        sc.close();
    }
}