package p19_01_2023;

public abstract class Atleticar {

    protected String imeIPrezime;

    protected String rezultat;

    public abstract void boljiOd(String imeIPrezime);

    public void stampaj(){
        System.out.println(imeIPrezime);
        System.out.println(rezultat);
    }


}
