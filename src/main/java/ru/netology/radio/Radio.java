package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int stationsNumber = 10;
    private int maxStation = stationsNumber - 1;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int stationsNumber) {
        this.stationsNumber = stationsNumber;
        maxStation =  stationsNumber - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int changeStationForward() {
        int newStation = currentStation + 1;
        if (currentStation == maxStation) {
            newStation = minStation;
        }
        currentStation = newStation;
        return newStation;
    }

    public int changeStationBackward() {
        int newStation = currentStation - 1;
        if (currentStation == minStation) {
            newStation = maxStation;
        }
        currentStation = newStation;
        return newStation;


    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        int newVolume = currentVolume + 1;
        if (currentVolume == maxVolume) {
            newVolume = maxVolume;
        }
        currentVolume = newVolume;
        return newVolume;

    }

    public int decreaseVolume() {
        int newVolume = currentVolume - 1;
        if (currentVolume == minVolume) {
            newVolume = minVolume;
        }
        currentVolume = newVolume;
        return newVolume;

    }

}
