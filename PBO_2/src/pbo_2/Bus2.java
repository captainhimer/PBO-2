package pbo_2;
public class Bus2 {
    public int penumpang;
    public int maxpenumpang;
    
    
    
    public Bus2(int maxpenumpang)
    {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
    //method mutator
    public void addpenumpang(int beratpenumpang)
    {
        int temp;
        temp = this.penumpang+penumpang;
        if(temp>maxpenumpang)
        {
            System.out.println("penumpang melebihi kuota");
        }
        else
        {
            this.penumpang = temp;
        }
        
    }
    
    public void getpenumpang(int password)
    {
        if (password==24)
        {
            System.out.println("Password benar");
        }
        else
        {
            System.out.println("Password salah");
        }
    }
    public void cetakpenumpang()
    {
        System.out.println("Berat penumpang Bus sekarang = "+penumpang);
        System.out.println("Maksimum berat penumpang yang seharusnya adalah = "+maxpenumpang);
        
    }
    
}
