package co.sharlysonjob.bank;


import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Missão da versão: Depositar, Sacar e Sair
        // D = Deposito
        // S = Saque
        // E = Sair (exit)

        Account account = new Account("0001","000001","Luiz Morais");


        while (true){
            System.out.println("Qual operação deseja realizar? \n" +
                    "(D) - Deposito \n" +
                    "(S) - Saque \n" +
                    "(E) - Sair");
            String op = input.nextLine().toUpperCase();

            if(op.equals("D")){
                System.out.println("Qual valor deseja depositar?");
                double value = input.nextDouble();
                account.deposit(value);
            } else if(op.equals("S")){
                System.out.println("Qual valor deseja sacar?");
                double value = input.nextDouble();
                account.withDraw(value);
            }else if(op.equals("E")){
                System.out.println("Deseja realmente sair?(s / n)");
                String value = input.next();
                if(value.equals("s")){
                    break;
                }
            } else {
                System.out.println("Comando Inválido");
            }

            input = new Scanner(System.in);
        }

    }
}
