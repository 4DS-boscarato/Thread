package Eser_Sleep;

public class Campana implements Runnable {

    private String suono;
    private int volte;
    private int tempo;

    public Campana(String suono, int volte, int tempo){
        this.suono = suono;
        this.tempo = tempo;
        this.volte = tempo;


    }


    public void run() {
        try {
            Thread.sleep(tempo);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < volte; ++i){
            System.out.println(suono);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
