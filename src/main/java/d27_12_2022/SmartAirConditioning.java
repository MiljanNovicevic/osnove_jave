package d27_12_2022;

public class SmartAirConditioning {
    public String brand;
    public double temp;
    public String mode;

    public void stampaj(){
        System.out.println("Marka klime: " + this.brand + "| Temperatura: " + this.temp + "| Mode: " + this.mode);
    }
    public String spoljnjaTemp(double temp){
        if (temp > this.temp){
            return "Napolju je temperatura veca";
        }
        else {return "Napolju je temperatura niza";}



    }
}
