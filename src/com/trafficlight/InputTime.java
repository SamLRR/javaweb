package com.trafficlight;

import java.util.Scanner;

class InputTime {
    private static final int QUANTITY_OF_COLOR = TrafficLight.QUANTITY_OF_COLOR;
    private int[] arrayMinutes;

    InputTime() {
        arrayMinutes = new int[QUANTITY_OF_COLOR];
    }

    void inputTimeFromConsole(int count) {
        Scanner input = new Scanner(System.in);
        int numberMinutes = input.nextInt();
        arrayMinutes[count] = numberMinutes;

        if (count == QUANTITY_OF_COLOR - 1) {
            TrafficLight trafficLight = new TrafficLight();
            trafficLight.setArrayMinutes(arrayMinutes);
        }
    }
}
