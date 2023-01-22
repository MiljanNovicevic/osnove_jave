package p19_01_2023;

import java.util.ArrayList;

public class PoreskaUprava {

    private String imeGrada;
    private ArrayList<Objekat> nizObjekata;

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
        this.nizObjekata = new ArrayList<>();
    }


    public String getImeGrada() {
        return imeGrada;
    }

    public void setImeGrada(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    public ArrayList getNizObjekata() {
        return nizObjekata;
    }

    public void setNizObjekata(ArrayList nizObjekata) {
        this.nizObjekata = nizObjekata;
    }

    public void dodajObjekat(Objekat objekat){
        nizObjekata.add(objekat);

    }
    public void ukupanPorez(){

    }

    public void stampaj(){
        for (int i = 0; i < this.nizObjekata.size(); i++) {
            this.nizObjekata.get(i).stampaj();

        }
    }

}
