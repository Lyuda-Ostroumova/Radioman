package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldGetCurrentStation() {
        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {
        radio.setCurrentStation(12);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation1() {
        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation2() {
        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation3() {
        radio.setCurrentStation(15);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation4() {
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation5() {
        radio.setCurrentStation(6);

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation6() {
        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationForward() {
        radio.setCurrentStation(5);

        int actual = radio.changeStationForward();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationForward1() {
        radio.setCurrentStation(9);

        int actual = radio.changeStationForward();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationForward2() {
        radio.setCurrentStation(0);

        int actual = radio.changeStationForward();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationBackward() {
        radio.setCurrentStation(5);

        int actual = radio.changeStationBackward();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationBackward1() {
        radio.setCurrentStation(0);

        int actual = radio.changeStationBackward();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationBackward2() {
        radio.setCurrentStation(9);

        int actual = radio.changeStationBackward();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {

        radio.setCurrentVolume(100);

        int actual = radio.increaseVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        radio.setCurrentVolume(55);

        int actual = radio.getCurrentVolume();
        int expected = 55;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume1() {
        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume2() {
        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume3() {
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume1() {
        radio.setCurrentVolume(100);

        int actual = radio.increaseVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume2() {
        radio.setCurrentVolume(0);

        int actual = radio.increaseVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume3() {
        radio.setCurrentVolume(50);

        int actual = radio.increaseVolume();
        int expected = 51;

        assertEquals(expected, actual);
    }


    @Test
    void shouldDecreaseVolume() {
        radio.setCurrentVolume(50);

        int actual = radio.decreaseVolume();
        int expected = 49;

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume1() {
        radio.setCurrentVolume(0);

        int actual = radio.decreaseVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume2() {
        radio.setCurrentVolume(100);

        int actual = radio.decreaseVolume();
        int expected = 99;

        assertEquals(expected, actual);
    }

}


