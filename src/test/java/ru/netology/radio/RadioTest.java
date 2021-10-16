package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldGetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation3() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation4() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation5() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationForward() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int actual = radio.changeStationForward();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationForward1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int actual = radio.changeStationForward();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationForward2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int actual = radio.changeStationForward();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationBackward() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);


        int actual = radio.changeStationBackward();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationBackward1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int actual = radio.changeStationBackward();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationBackward2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int actual = radio.changeStationBackward();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int actual = radio.increaseVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        int actual = radio.increaseVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int actual = radio.increaseVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }


    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int actual = radio.decreaseVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int actual = radio.decreaseVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int actual = radio.decreaseVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

}


