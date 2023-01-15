package d13_01_2023;

public class Zadatak1 {

    public static void main(String[] args) {

        Ispit ispit1 = new Ispit("Istorija ekononomije",9,"Boban Stojanovic");
        Ispit ispit2 = new Ispit("Rkonomska statistika",8,"Goran Petrovic");
        Ispit ispit3 = new Ispit("Makroekonomija",10,"Tadija Djukic");
        Ispit ispit4 = new Ispit("Poslovno pravo",6,"Dejan Mitrovic");
        Ispit ispit5 = new Ispit("Medjunarodni marketing",7,"Pera Peric");
        Ispit ispit6 = new Ispit("Javne Finansije",7,"Goran Milovanovic");

        Student student1 = new Student("2258","Miljan Novicevic", "Osnovne" );
        Student student2 = new Student("1145","Pera Peric", "Master" );


        student1.dodajIspit(ispit1);
        student1.dodajIspit(ispit2);
        student1.dodajIspit(ispit3);
        student2.dodajIspit(ispit4);
        student2.dodajIspit(ispit5);
        student2.dodajIspit(ispit6);

        student1.print();
        student2.print();
    }
}
