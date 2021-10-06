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

        radio.setCurrentStation(5);

        int actual = radio.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationForward() {
        Radio radio = new Radio();

        radio.changeStationForward(5);

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationForward1() {
        Radio radio = new Radio();

        radio.changeStationForward(9);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationForward2() {
        Radio radio = new Radio();

        radio.changeStationForward(0);

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationForward3() {
        Radio radio = new Radio();

        radio.changeStationForward(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationForward4() {
        Radio radio = new Radio();

        radio.changeStationForward(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationBackward() {
        Radio radio = new Radio();

        radio.changeStationBackward(7);

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationBackward1() {
        Radio radio = new Radio();

        radio.changeStationBackward(0);

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationBackward2() {
        Radio radio = new Radio();

        radio.changeStationBackward(9);

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangeStationBackward3() {
        Radio radio = new Radio();

        radio.changeStationBackward(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume1() {
        Radio radio = new Radio();

        radio.increaseVolume(10);

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.decreaseVolume(8);

        int actual = radio.getCurrentVolume();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume1() {
        Radio radio = new Radio();

        radio.decreaseVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}


