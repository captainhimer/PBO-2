package pbo_2;
public class Ujibus2 {
    public static void main(String[] args) 
    {
        Bus2 bus = new Bus2(40);
        bus.getpenumpang(17);
        bus.getpenumpang(6969);
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang(19);//tambah 2 penumpang
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang(24);//tambah 1 penumpang
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang(18);//tambah 2 penumpang
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang(29);//tambah 2 penumpang
        bus.cetakpenumpang();
    }
}
