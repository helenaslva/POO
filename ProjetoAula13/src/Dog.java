public class Dog extends Wolf{
    @Override
    public void makeSound(){
        System.out.println("Auf! Auf!");
    }

    //sobrecarga = diferentes assinaturas(parametros)
    public void react(int hour){
        if(hour < 12){
            System.out.println("Wagging the tail");
        }else if(hour>=18){
            System.out.println("Ignore");
        }else{
            System.out.println("Wagging the tail");
            makeSound();
        }

    }
    public void react(String sentence){
        if(sentence.equals("Food time!") || sentence.equals("Come here!")){
            System.out.println("Wagging the tail");
            makeSound();
        }else{
            System.out.println("Growling at you");
        }

    }
    public void react(boolean owner){
        if(owner == true){
            System.out.println("Wagging the tail");
        }else{
            System.out.println("Growling at you");
            makeSound();
        }

    }
    public void react(int age, double weight){
        if(age<5){
            if(weight<10){
                System.out.println("Wagging the tail");
            }else{
                makeSound();
            }
        }else{
            if(weight<10){
                System.out.println("Growling at you");
            }else{
                System.out.println("Ignore");
            }
        }

    }
}
