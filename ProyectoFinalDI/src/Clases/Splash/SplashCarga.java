package Clases.Splash;

public class SplashCarga extends Thread{
    
    public static void main(String[] arg){
        Uni1 uni1 = new Uni1();
        Uni2 uni2 = new Uni2();
        uni1.start();
        uni2.start();
    }
}