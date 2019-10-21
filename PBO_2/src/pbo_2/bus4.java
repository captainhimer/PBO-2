package pbo_2;
public class bus4 {
public double penumpang;
    public double maxpenumpang;
    public double counter;
    public double penumpangbaru;
    
    //konstruktor kelas bus
    public bus4(double maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
    //method mutator untuk menambah penumpang
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if(temp>=maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
        counter++;
        penumpangbaru += penumpang;
    }
    
    public void getpenumpang(int password){
        if(password == 1234){
            System.out.println("PASSWORD ANDA BENAR");
        }else {
            System.out.println("PASSWORD ANDA SALAH");
        }
    }
    
    public double getaverage(){
        double a = 0.0;
        a = penumpang / counter;
        return a;
    }
    
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah "+ penumpang);
        System.out.println("Penumpang Maksimum seharusnya adalah "+ maxpenumpang);
        System.out.println("Rata rata berat badan adalah "+ getaverage());
    }    
}
