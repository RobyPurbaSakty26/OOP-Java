package com.latihan.Methods;


class Mahasiswa{
    // data member
    String name;
    String NIM;

    //contructor
    Mahasiswa(String name, String NIM){
        this.name = name;
        this.NIM = NIM;
    }
    // methode tanpa return dan  dan tanpa parameter
    void show(){
        System.out.println("nama : " + this.name);
        System.out.println("NIM : "+ this.NIM);
    }
    // methide tanpa return dan dengan parameter
    void setNama (String nama){
        this.name = nama;
    }

    //method dengan return tapi tidak ada parameter
    String getNama(){
        return this.name;
    }
    String getNim(){
        return this.NIM;
    }
    //dengen return dan parameter
    String sayHi(String Message){
        return Message + "juga, name saya adalah " + this.name;
    }
}
class Dosen{
    String name;

    Dosen(String nama){
        this.name = nama;
    }
}

public class Main {

    public static void main(String[] args ){
        
       Mahasiswa objek = new Mahasiswa("Roby", "a2.190158");

        //methode
        objek.show();
        objek.setNama("tutug");
        objek.show();


        System.out.println(objek.getNama());
        System.out.println(objek.getNim());
        
        String data = objek.sayHi("ganteng");
        System.out.println(data);

        
        

    }
    
    }
    

