package co.sharlysonjob.bank;

public class Account {

    private static final int MAX_LENGTH = 13;

    private String ag;
    private String cc;
    private String name;
    private Log logger;
    private double balance;




    public Account(String ag, String cc, String name){
        this.ag = ag;
        this.cc = cc;
        setName(name);
        logger = new Log();

    }

    public void setName(String name){
        if (name.length() > MAX_LENGTH) {
            this.name = name.substring(0, MAX_LENGTH);
        }else {
            this.name = name;
        }
    }

    public void deposit(double value){
        balance += value;
        logger.out("Depósito - " + "R$"+value +" Seu Extrato é R$"+ balance);


    }

    public void withDraw(double value){
        if (value > balance){
            logger.out("Saque - " + " Saque inválido, seu saldo é R$" + balance);
            System.out.println("Saldo insuficiente para saque");
        }else {
            balance -= value;
            logger.out("Saque - " + "R$" + value + ", Seu Extrato é R$" + balance);
        }
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        String result = "A conta " + this.name + " Agencia: " + this.ag + " Conta corrente: " + this.cc + " possui R$: " + balance;
        return result;
    }
}
