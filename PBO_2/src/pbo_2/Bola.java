package pbo_2;
public class Bola {
    public double jari;
    public double diameter;
    public double luaspermukaan;
    public double volume;
    
    public void setjari(){
        this.jari = jari;
        jari = 10.0;
    }
    
    public void showdiameter(){
        this.diameter = diameter;
        diameter = 10.0;
    }
    
    public void showluaspermukaan(){
        this.luaspermukaan = luaspermukaan;
        luaspermukaan = Math.PI*jari*jari*4;
    }
    
    public void showvolume(){
        this.volume = volume;
        volume = Math.PI*jari*jari*4/3;
    }
    
    public void cetakbola(){
        System.out.println("HASIL BOLA");
        System.out.println("DIAMETER BOLA = "+diameter);
        System.out.println("VOLUME BOLA = "+volume);
        System.out.println("LUAS PERMUKAAN BOLA = "+luaspermukaan);
        
    }
    
}
