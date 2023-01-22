package p19_01_2023;

import java.util.ArrayList;

public class Disciplina {
    private String imeDiscipline;
    private String tipDsicipline;
    private ArrayList<Atleticar> nizAtleticara;

    public Disciplina(String imeDiscipline, String tipDsicipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDsicipline = tipDsicipline;
        this.nizAtleticara = new ArrayList<>();
    }

    public void dodajAtleticara(Atleticar atleticar){
        nizAtleticara.add(atleticar);
    }

    public void diskvalifikujAtleticara (String imeIPrezime){
        nizAtleticara.remove(imeIPrezime);
    }
}
