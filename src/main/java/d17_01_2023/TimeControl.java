package d17_01_2023;

public class TimeControl extends Control{
    private boolean premotaj;

    public TimeControl(boolean premotaj) {
        this.premotaj = premotaj;
    }
    public TimeControl(){}

    public boolean isPremotaj() {
        return premotaj;
    }

    public void setPremotaj(boolean premotaj) {
        this.premotaj = premotaj;
    }

    @Override
    public void izvrisAkciju(VideoPlayer videoPlayer) {
        if (premotaj){ videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea() + 15);
            if (videoPlayer.getTrenutnoVremeVidea() > videoPlayer.getDuzinaVidea())
                videoPlayer.setTrenutnoVremeVidea(videoPlayer.getDuzinaVidea());}
        else {videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea() - 15);
            if (videoPlayer.getTrenutnoVremeVidea() < 0) {
                videoPlayer.setTrenutnoVremeVidea(0);}
        }
    }
}


