package com.latihan;


//membuat class sebagai template
class Mahasiswa{
    String nama ;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}




public class main {
    public static void main(String[] args) throws Exception {
        // instansiasi / membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama= "Roby";
        mahasiswa1.NIM ="A2.1900158";
        mahasiswa1.jurusan="IT";
        mahasiswa1.IPK =4.0;
        mahasiswa1.umur=17;
        

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiwa2 = new Mahasiswa();
        mahasiwa2.nama= "kanjeng dimas";
        mahasiwa2.NIM ="A2.1900111";
        mahasiwa2.jurusan="SI";
        mahasiwa2.IPK =3.0;
        mahasiwa2.umur=27;
        

        System.out.println(mahasiwa2.nama);
        System.out.println(mahasiwa2.NIM);
        System.out.println(mahasiwa2.jurusan);
        System.out.println(mahasiwa2.IPK);
        System.out.println(mahasiwa2.umur);


            
    }
}
