package ru.netology.Radio;

public class Radio {
    public int currentStation;
    public int currentVolume;

    public void setStation (int newStation) {
        if (newStation >= 0 & newStation <= 9) {
            currentStation = newStation;
        } else {currentStation = -1;}
    }


    public void nextStation () {

        if (currentStation < 0 || currentStation >= 9) {
            currentStation = 0;
            return;
        }

        if (currentStation >= 0 & currentStation < 9) {
            currentStation++;
            return;
        }
    }

    public void prevStation () {

        if (currentStation <= 0 || currentStation > 9) {
            currentStation = 9;
            return;
        }

        if (currentStation > 0 & currentStation <= 9) {
            currentStation--;
            return;
        }
    }
}
