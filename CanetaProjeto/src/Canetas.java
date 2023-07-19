public class Canetas {

    public Canetas(String modelo, String cor, float ponta) {
        this.setCor(cor);
        this.setModelo(modelo);
        this.setPonta(ponta);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String modelo;
    public  String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){

        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());

    }

    public void rabiscar(){

        if(this.tampada == true){
            System.out.println("Caneta tampada, não pode rabiscar");
        }else{
            System.out.println("Rabiscando");
        }

    }

    public void tampar(){

        this.tampada = true;

    }

    public void destampar(){

        this.tampada = false;

    }
}
