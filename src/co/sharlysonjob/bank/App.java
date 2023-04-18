package co.sharlysonjob.bank;

import java.util.Scanner;

public class App {
    public static void main(String[] args){

        // Criar conta de usuário ( agencia, conta, nome)
        // Limitar o nome =  até 12 caracteres
        // Sacar valores
        // Não sacar mais do que tem diponível
        // Depositar valores

        Account account = new Account("0001","000001","Luiz Morais");



        account.deposit(500);
        account.deposit(200);
        account.deposit(70);
        account.withDraw(200);
        account.withDraw(1000);

        System.out.println(account);


        // informar para o usuário as operações(saque, deposito)

    }
}
