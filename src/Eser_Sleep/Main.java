package Eser_Sleep;

public class Main {
    public static void main(String[] args){
        Thread campana1 = new Thread(new Campana("din", 10, 700));
        Thread campana2 = new Thread(new Campana("don", 10, 800));
        Thread campana3 = new Thread(new Campana("dan", 10, 900));

        campana1.start();
        campana2.start();
        campana3.start();
    }
}
