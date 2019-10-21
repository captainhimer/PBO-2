package pbo_2;
public class TestSiswa {
    public static void main(String[] args) {
        
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Viko");
        siswa.setAge(16);
        siswa.setAddress("Malang");
        
        System.out.println("Name    : "+siswa.getName());
        System.out.println("Age     : "+siswa.getAge());
        System.out.println("Address : "+siswa.getAddress());
    }
    
}
