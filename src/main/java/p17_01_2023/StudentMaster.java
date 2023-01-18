package p17_01_2023;

public class StudentMaster extends Student {

    public int cenaSkolarine(){
        return 100000;
    }

    public StudentMaster(String imeIPrezime, String brojIndeksa, int godStudija) {
        super(imeIPrezime, brojIndeksa, godStudija);
    }

    @Override
    public boolean budzet() {
        if (this.getGodStudija()<2){
            return true;
        }

        return false;}

    public void stampaj(){
        System.out.println(this.imeIPrezime + ", " + brojIndeksa + ", godina studija " + godStudija);
        System.out.println("Finansiranje budzet/samofinansirajuci: " + budzet());
        System.out.println("Cena skolarine: " + cenaSkolarine());
    }
}
