package p17_01_2023;

public class StudentOsnovnih extends Student{

    public int cenaSkolarine(){
        return 90000;
    }

    @Override
    public boolean budzet() {
        if (this.getGodStudija()<5){
            return true;
        }

        return false;
    }

    public StudentOsnovnih(String imeIPrezime, String brojIndeksa, int godStudija) {
        super(imeIPrezime, brojIndeksa, godStudija);
    }

    public boolean budzetIlisamo(){
        if (this.godStudija < 5){
            return true;
        }else return false;
    }
    public void stampaj(){
        System.out.println(this.imeIPrezime + ", " + brojIndeksa + ", godina studija " + godStudija);
        System.out.println("Finansiranje budzet/samofinansirajuci: " + budzet());
        System.out.println("Cena skolarine: " + cenaSkolarine());
    }

}
