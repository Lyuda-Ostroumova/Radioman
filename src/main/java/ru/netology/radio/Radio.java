package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void changeStationForward(int currentStation) {
        if (currentStation >= 0 && currentStation < 9) {
            this.currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            this.currentStation = 0;
        }
    }

    public void changeStationBackward(int currentStation) {
        if (currentStation <= 9 && currentStation > 0) {
            this.currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            this.currentStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            this.currentVolume = 10;
        }
    }

    public void decreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            this.currentVolume = 0;
        }
    }
}
