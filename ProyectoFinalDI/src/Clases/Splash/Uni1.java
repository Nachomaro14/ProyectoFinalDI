package Clases.Splash;

public class Uni1 extends Thread{
    int infinito = 1;
    
    public void run(){
        while(infinito == 1){
            //Cambiar foto Uni1
            try{
                Thread.sleep(2000);
            }catch(InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
    }
}