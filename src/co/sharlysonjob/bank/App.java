package co.sharlysonjob.bank;


import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Bank santander = new Bank("0001");
        // C - Criar conta
        // E - Saris(exit)

        while(true){
            System.out.println("O que deseja fazer?\n" +
                    "C - Criar conta\n" +
                    "E - Sair do programa");
            String op = input.nextLine().toUpperCase();


            if(op.equals("C")){
                System.out.println("Digite o Seu nome: ");
                String name = input.nextLine();
                Account account = santander.generateAccount(name);
                santander.insertAccount(account);
                operateAccount(account);
            } else if (op.equals("E")) {
                break;
            }else{
                System.out.println("Comando Inválido");
            }
        }
        List<Account> accountList = santander.getAccounts();
        for(Account cc: accountList){
            System.out.println(cc);
        }

        santander.outputTotal();

    }
    static void operateAccount(Account account){
        while (true){
            Scanner input = new Scanner(System.in);
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
