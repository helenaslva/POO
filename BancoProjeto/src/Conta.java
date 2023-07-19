public class Conta {


    public Conta(String dono, int numero) {
        this.numConta = numero;
        this.dono = dono;
        this.saldo = 0;
        this.status =  false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void abrirConta(String tipo){
        this.setTipo(tipo);

        this.setStatus(true);

        if(this.getTipo().equals("cc")){
            this.setSaldo(50.0);
        }else if(this.getTipo().equals("cp")){
            this.setSaldo(150.0);
        }

        System.out.println("Conta aberta com sucesso!");

    }
    public void fecharConta(){
        if(this.getSaldo() == 0){
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }else if(this.getSaldo() > 0){
            System.out.println("Retire seu saldo de " + this.getSaldo() + " para fechar a conta");
        }else if(this.getSaldo() < 0){
            System.out.println("Deposite o valor de " + (this.getSaldo() * -1) + " para fechar a conta");
        }


    }
    public void depositar(double valor){
        if(this.isStatus() == true) {
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("Valor de R$: " + this.getSaldo() + " depositado com sucesso");
        }

    }

    public void sacar(double valor){
        if(this.isStatus() == true){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso!");
                System.out.println("Saldo atual de R$: " + this.getSaldo());
            }else{
                System.out.println("Não é possível realizar o saque.");
            }
        }
    }

    public void pagarMensal(String conta){
        if(this.isStatus() == true){
            if( conta.equals("cc")){
                this.setSaldo(this.getSaldo() - 12.0);
            }else if( conta.equals("cp")){
                this.setSaldo(this.getSaldo() - 20.0);
            }
            System.out.println("Saldo atual de R$: " + this.getSaldo());
            System.out.println("Mensalidade paga com sucesso.");
        }

    }

    public void statusAtual(){
        System.out.println("Dono: " + this.getDono());
        System.out.println("Número: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: R$ " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }


}
