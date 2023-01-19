package d17_01_2023;

public class AudioControl extends Control {

        private boolean pojacaj;

        public AudioControl(boolean pojacaj) {
            this.pojacaj = pojacaj;
        }

        public AudioControl() {

        }

        public boolean isPojacaj() {
            return pojacaj;
        }

        public void setPojacaj(boolean pojacaj) {
            this.pojacaj = pojacaj;
        }

        @Override
        public void izvrisAkciju(VideoPlayer videoPlayer) {
            if (this.pojacaj) {
                videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() + 1);
                if (videoPlayer.getJacinaZvuka() > 100) {
                    videoPlayer.setJacinaZvuka(100);
                } else {
                    videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() - 1);
                    if (videoPlayer.getJacinaZvuka() < 0) {
                        videoPlayer.setJacinaZvuka(0);
                    }
                }
            }
        }
    }


