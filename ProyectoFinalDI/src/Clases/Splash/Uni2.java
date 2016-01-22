package Clases.Splash;

public class Uni2 extends Thread{
    
    int infinito = 1;
    
    public void run(){
        while(infinito == 1){
            try{
                Thread.sleep(1000);
                //Cambiar foto Uni2
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
    }
}