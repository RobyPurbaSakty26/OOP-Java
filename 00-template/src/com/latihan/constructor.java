package com.latihan;



//clas tanpa constructor
class polos{
    String dataString;
    int dataInt;
}
// ini adalah constructor di panggil saat objek pertama kali dibuat
class Siswa{
    String nama;
    String NIM;
    String Jurusan;
    
//     Siswa(){
//         System.out.println("ini adalah constructor");
//   }


    // constructor dengan parameter
    Siswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        Jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(Jurusan);

    }

    
}

public class constructor {
    public static void main(String[] args) {
        
        // polos objekpolos = new polos();
        // System.out.println(objekpolos.dataString);
        Siswa objek1 = new Siswa("roby", "A2.1900158","TI");
        Siswa objek2 = new Siswa("otong","A2.00001","SI");
        objek1.nama="fuad";
        objek2.nama="mh ihsan";
        System.out.println(objek1.nama);



        

     


    
        
    
}
    

    
}
