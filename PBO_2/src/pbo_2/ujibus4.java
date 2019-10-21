package pbo_2;
public class ujibus4 {
    public static void main(String[] args) {
        bus4 bus = new bus4(5);
        bus.getpenumpang(17);
        bus.getpenumpang(24);
        bus.cetak();
        
        bus.addPenumpang(2);
        bus.cetak();
        
        bus.addPenumpang(1);
        bus.cetak();
        
        bus.addPenumpang(2);
        bus.cetak();
        
        bus.addPenumpang(2);
        bus.cetak();
    }
}
