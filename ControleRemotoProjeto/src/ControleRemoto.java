public class ControleRemoto implements Controlador{

    public ControleRemoto() {
        this.volume = 5;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private int volume;
    private boolean ligado;
    private boolean tocando;

    @Override
    public void ligar() {
        if(!this.isLigado()){
            this.setLigado(true);
            System.out.println("Ligado");
        }

    }

    @Override
    public void desligar() {
        if(this.isLigado()){
            this.setLigado(false);
            System.out.println("Desligado");
        }

    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()){
            System.out.print("Volume: ");
            for(int i = 0; i<this.getVolume(); i++){
                System.out.print("|");
            }
            System.out.println();
            System.out.println("Ligado: " + this.isLigado());
            System.out.println("Tocando: " + this.isTocando());
        }


    }

    @Override
    public void fecharMenu() {
        if(this.isLigado()){
            System.out.println("Fechando Menu");
        }


    }

    @Override
    public void aumentarVolume() {
        if(this.isLigado() && this.getVolume() < 10){
            this.setVolume(this.getVolume() + 1);
        }else if(this.getVolume() >= 10){
            System.out.println("Volume máximo!");
        }


    }

    @Override
    public void diminuirVolume() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(this.getVolume() - 1);

        }else if(this.getVolume() <= 0){
            System.out.println("Volume mínimo!");
        }

    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
            System.out.println("Mudo");
        }


    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(1);
            System.out.print("Volume: ");
            for(int i = 0; i<this.getVolume(); i++){
                System.out.print("|");
            }
            System.out.println();


        }


    }

    @Override
    public void play() {
        if(this.isLigado()){
            this.setTocando(true);
            System.out.println("Tocando");
        }


    }

    @Override
    public void pause() {
        if(this.isLigado()){
            this.setTocando(false);
            System.out.println("Pausado");
        }


    }
}
