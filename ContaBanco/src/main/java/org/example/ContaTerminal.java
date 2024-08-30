package org.example;
import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeCliente = getNomeCliente(sc);
        String numeroDaAgencia = getNumeroDaAgencia(sc);
        int numeroDaConta = getNumeroDaConta(sc);
        double saldo = getSaldo(sc);

        Conta conta = new Conta(nomeCliente, numeroDaAgencia, numeroDaConta, saldo);

        System.out.println(conta);
        sc.close();
    }

    private static double getSaldo(Scanner sc) {
        double saldo;
        while (true) {
            System.out.println("Por favor, digite o seu saldo:");
            saldo = sc.nextDouble();
            if (saldo >= 0) {
                return saldo;
            } else {
                System.out.println("Saldo inválido. O saldo não pode ser negativo.");
            }
        }
    }

    private static int getNumeroDaConta(Scanner sc) {
        int numeroDaConta;
        while(true) {
            try {
                System.out.println("Por favor, digite o número da conta (apenas números):");
                numeroDaConta = sc.nextInt();
                String numero = Integer.toString(numeroDaConta);
                if(numero.length() >= 4) {
                    return numeroDaConta;
                } else {
                    System.out.println("Número da conta é inválido. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira apenas números.");
                sc.next();
            }
        }
    }

    private static String getNumeroDaAgencia(Scanner sc) {
        String numeroDaAgencia;
        while(true){
            System.out.println("Por favor, digite o número da agência:");
            numeroDaAgencia = sc.next();
            if(numeroDaAgencia.length() == 4) {
                return numeroDaAgencia;
            } else {
                System.out.println("Número da agência é inválido. Tente novamente.");
            }
        }
    }

    private static String getNomeCliente(Scanner sc) {
        System.out.println("Por favor, digite o seu nome:");
        return sc.nextLine().toUpperCase();
    }
}