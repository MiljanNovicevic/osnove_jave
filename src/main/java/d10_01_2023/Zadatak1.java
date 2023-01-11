package d10_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Autor milos = new Autor("Milos", "Crnjanski");
        Knjiga a = new Knjiga("9780151595563", "Seobe", 1929, milos);


        Autor ivo = new Autor("Ivo", "Andric");
        Knjiga b = new Knjiga("9780451017987", "Na Drini cuprija", 1945, ivo);


        Autor stevan = new Autor("Stevan", "Sremac");
        Knjiga c= new Knjiga("9788650502716", "Pop Cira i pop Spira", 1894, stevan);

        a.print();
        b.print();
        c.print();
    }

}
