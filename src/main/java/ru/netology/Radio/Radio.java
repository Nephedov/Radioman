package ru.netology.Radio;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int numberOfStations = 10;
    private int maxStation = numberOfStations - 1;
    private int minStation = 0;
    private int currentStation;

    private int maxVolume = 100;
    private int minVolume = 0;

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setHigherVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void setLowerVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }


    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 & currentStation < this.numberOfStations) {
            this.currentStation = currentStation;
        }


    }


    public void nextStation() {
        maxStation = numberOfStations - 1;
        if (currentStation >= maxStation) {
            currentStation = 0;
            return;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        maxStation = numberOfStations - 1;
        if (currentStation <= 0) {
            currentStation = maxStation;
            return;
        } else {
            currentStation--;
        }
    }

}