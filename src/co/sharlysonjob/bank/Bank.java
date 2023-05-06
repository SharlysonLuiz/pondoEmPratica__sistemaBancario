package co.sharlysonjob.bank;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String ag;
    private List <Account> accounts;
    private int lastAccount = 1;

    // construtor do banco
    public Bank(String ag){
        this.ag = ag;
        this.accounts = new ArrayList<>();
    }

    // inserir a conta dentro do <ArrayList>
    public void insertAccount(Account account){
        // adicionando contas no objeto accounts
        accounts.add(account);

    }

    public List<Account> getAccounts(){
        return accounts;
    }

    public Account generateAccount(String name){
        Account account = new Account(ag,"" + lastAccount,name);
        lastAccount++;
        return account;
    }

    public void outputTotal(){
        double total = 0;
        //aqui pega o balanço de todas as contas(do banco) criadas e coloca no total
        for(Account account: accounts){
            double balance = account.getBalance();
            total += balance;
        }
        System.out.println("O banco possui agora: R$" + total);
    }
}
