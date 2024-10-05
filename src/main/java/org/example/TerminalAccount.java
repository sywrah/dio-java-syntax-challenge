package org.example;

import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String clientName = scanner.nextLine();

        System.out.println("Digite o número da sua agência: ");
        String bankAgency = scanner.next();

        System.out.println("Digite o número da sua conta: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Digite o saldo da sua conta: ");
        double amount = scanner.nextDouble();

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + bankAgency + ", conta " + accountNumber + " e seu saldo " + amount + " já está disponível para saque!");
    }
}