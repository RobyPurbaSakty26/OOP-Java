# Method Di Java

Method adalah kumpulan setemen yang memiliki tugas tertetu, atau juga bisa dibilang fungis dari objek.

---
Pada kesempatan kali ini kita akan belajar untuk megenal jenis - jenis method beserta fungsinya.

---

Pada saat kita ingin membuat Method. Kita terlebuh dahulu membuat class, karna method sendiri merupakan fungsi dari class yang nentinya akan digunakan oleh ebjek.

```java
    class Mahasiswa{

    }
```

---
Untuk tahap selanjutnya kita memerlukan Constructor yang akan kita gunakan sebagai atribut pada objek yang nantinya akan kita gunakan di oleh oleh method.

```java
        class Mahasiswa{
            String name;
            String NIM;
   
            Mahasiswa(String name, String NIM){
            this.name = name;
            this.NIM = NIM;
        }
```

supaya method bisa dipanggil kita memerlukan objek dan main class.

```java
        class Mahasiswa{
            String name;
            String NIM;
            
            Mahasiswa(String name, String NIM){
            this.name = name;
            this.NIM = NIM;
        }
        public class test {
        public static void main(String[] args){
            Mahasiswa ObjekMahasiswa = new Mahasiswa("ucup","A3.1900158");

        }
        }
```

---
Berukut ini adalah jenis-jenis method yang akan kite pelajari

## Method Tanpa Retrun dan Tanpa Stepmen

```java
        class Mahasiswa{
            String name;
            String NIM;
   
            Mahasiswa(String name, String NIM){
            this.name = name;
            this.NIM = NIM;
            }
        void show(){
            System.out.println("nama : " + this.name);
            System.out.println("NIM : "+ this.NIM);
        }
        }
        public class test {
        public static void main(String[] args){
            Mahasiswa ObjekMahasiswa = new Mahasiswa("ucup","A3.1900158");
            ObjekMahasiswa.show();

        }
        }
```

## Method Tanpa Rerturn dan Dengan Stepmen

```java
        class Mahasiswa{
            String name;
            String NIM;
   
            Mahasiswa(String name, String NIM){
            this.name = name;
            this.NIM = NIM;
            }
        void show(){
            System.out.println("nama : " + this.name);
            System.out.println("NIM : "+ this.NIM);
        }
            void setNama (String nama){
            this.name = nama;
        }
        }
        public class test {
        public static void main(String[] args){
            Mahasiswa ObjekMahasiswa = new Mahasiswa("ucup","A3.1900158");
            ObjekMahasiswa.show();
            ObjekMahasiswa.setNama("tutug");
            ObjekMahasiswa.show();
        }
        }
```

## Method Dengan Retrun dan Tanpa Stepmen

```java
        class Mahasiswa{
            String name;
            String NIM;
   
            Mahasiswa(String name, String NIM){
            this.name = name;
            this.NIM = NIM;
        }
        String getNama(){
            return this.name;
        }
        String getNim(){
            return this.NIM;
        }
        
        }
        public class test {
        public static void main(String[] args){
            Mahasiswa ObjekMahasiswa = new Mahasiswa("ucup","A3.1900158");
            ObjekMahasiswa.show();
            System.out.println(ObjekMahasiswa.getNama());
            System.out.println(ObjekMahasiswa.getNim());
        }
        }
```

## Method Dengan Retrun dan Dengan Stepmen

```java
        class Mahasiswa{
            String name;
            String NIM;
   
            Mahasiswa(String name, String NIM){
            this.name = name;
            this.NIM = NIM;
        }
        String sayHi(String Message){
            return Message + "juga, name saya adalah " + this.name;
        }
        }
        public class test {
        public static void main(String[] args){
            Mahasiswa ObjekMahasiswa = new Mahasiswa("ucup","A3.1900158");
            
            String data = objekMahasiswa.sayHi("ganteng");
            System.out.println(data);
        }
        }
```
