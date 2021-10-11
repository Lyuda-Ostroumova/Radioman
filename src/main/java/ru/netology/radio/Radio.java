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

    public int changeStationForward() {
        int newStation = currentStation + 1;
        if (currentStation == 9) {
            newStation = 0;
        }
        return newStation;
    }

    public int changeStationBackward() {
        int newStation = currentStation - 1;
        if (currentStation == 0) {
            newStation = 9;
        }
        return newStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        int newVolume = currentVolume;
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            currentVolume = 10;
        }
        return newVolume;

    }

    public int decreaseVolume() {
        int newVolume = currentVolume;
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            newVolume = 0;
        }
        return newVolume;

    }

}
