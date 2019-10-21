package pbo_2;
public class ujibus3 {
    public static void main(String[] args) {
        bus3 busbesar = new bus3(40);
        busbesar.cetak();
        
        busbesar.addpenumpang(15);
        busbesar.cetak();
        
        busbesar.addpenumpang(5);
        busbesar.cetak();
        
        busbesar.addpenumpang(26);
        busbesar.cetak();
    }
}
