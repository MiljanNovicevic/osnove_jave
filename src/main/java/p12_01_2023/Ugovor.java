package p12_01_2023;

import d10_01_2023.Kupac;

public class Ugovor {
    private String datumSklapanjaUgovora;
     private FizickoLice prodavac;
    private double cenaNekretnine;
    private String adresaNekretnine;
    private FizickoLice kupac;


    public Ugovor(String datumSklapanjaUgovora, FizickoLice prodavac, int cenaNekretnine, String adresaNekretnine, FizickoLice kupac) {
        this.datumSklapanjaUgovora = datumSklapanjaUgovora;
        this.prodavac = prodavac;
        this.cenaNekretnine = cenaNekretnine;
        this.adresaNekretnine = adresaNekretnine;
        this.kupac = kupac;
    }



    public double procenatZarade (){
        if (this.kupac.isVecKupovao()){
            return 0.02;
        }else return 0.03;}
//        return this.kupac.isVecKupovao() ? 0.02 : 0.03;


    public double zaradaAgencije (){
        return 1000+this.cenaNekretnine*this.procenatZarade();
    }
    public void stampa(){
        System.out.println("Dana " + this.datumSklapanjaUgovora + ".god sklopljen je ugovor izmedju " + this.prodavac.getImeIPrezime() +
                " i " + this.kupac.getImeIPrezime() + " o kupovini nekretnine na adresi " + this.adresaNekretnine + " po ceni od " +
                this.cenaNekretnine + " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + zaradaAgencije());


    }

}
