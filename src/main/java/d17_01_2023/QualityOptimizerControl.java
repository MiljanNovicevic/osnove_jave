package d17_01_2023;

public class QualityOptimizerControl extends Control {
    private int brzinaInterneta;

    public int getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl(){

    }

    @Override
    public void izvrisAkciju(VideoPlayer videoPlayer) {
        if (this.brzinaInterneta * 10.1 <= 144){
            videoPlayer.setKvalitetVidea(144);
        }else if (this.brzinaInterneta*10.1 <=240 ){
            videoPlayer.setKvalitetVidea(240);
        }else if (this.brzinaInterneta*10.1 <=340 ){
            videoPlayer.setKvalitetVidea(340);
        }else if (this.brzinaInterneta*10.1 <=480 ){
            videoPlayer.setKvalitetVidea(480);
        }else if (this.brzinaInterneta*10.1 <=720 ){
            videoPlayer.setKvalitetVidea(720);
        }
    }
}

