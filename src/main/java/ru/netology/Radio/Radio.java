package ru.netology.Radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setStation(int newStation) {
        if (newStation >= 0 & newStation <= 9) {
            currentStation = newStation;
        }
    }


    public void nextStation() {

        if (currentStation >= 9) {
            currentStation = 0;
            return;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {

        if (currentStation <= 0) {
            currentStation = 9;
            return;
        } else {
            currentStation--;
        }
    }

    public int getStation() {
        return currentStation;
    }


    public void setHigherVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void setLowerVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}


