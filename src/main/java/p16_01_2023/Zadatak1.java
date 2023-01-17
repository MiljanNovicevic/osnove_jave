package p16_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Student student1 = new Student("Marko Markovic", "205611651065","12351",20000);
        Student student2 = new Student("Marko Nikolic","1635165165198","132681",1500);

        Profesor profa1 = new Profesor("Goran Blagojevic","153156156165","Matematika",150000);
        Profesor profa2 = new Profesor("Pera Peric","198156198","MGeografija",170000);

        student1.stampaj();
        profa1.stampaj();



    }
}
