package d19_01_2023;

import java.util.ArrayList;

public class Korpa {

        private ArrayList<Ambalaza> ambalaze;
        public Korpa() {
            this.ambalaze = new ArrayList<>();
        }
        public void dodajAmbalazu (Ambalaza ambalaza) {
            this.ambalaze.add(ambalaza);
        }


        public void izbaciAmbalazu(String barkod) {
            for (int i = 0; i < this.ambalaze.size(); i++) {
                if(this.ambalaze.get(i).getBarkod().equals(barkod)){
                    this.ambalaze.remove(this.ambalaze.get(i));
                }

            }

        }


        public double cenaKorpe (SuperKartica popust) {
            double korpa = 0;
            for (int i = 0; i < this.ambalaze.size(); i++) {
                korpa += this.ambalaze.get(i).cenaArtikla();
            }
            return korpa - popust.getPopust();
        }
    }


