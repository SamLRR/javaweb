package com.trafficlight;

public class TrafficLight {
    static final int QUANTITY_OF_COLOR = 3;
    private static int[] arrayMinutes;
    private InputTime inputTime;

    TrafficLight() {
        arrayMinutes = new int[QUANTITY_OF_COLOR];
        inputTime = new InputTime();
    }

    void setArrayMinutes(int[] arrayMinutes) {
        this.arrayMinutes = arrayMinutes;
    }

    public void start() {
        enterTime();
        showLights();
    }

    private void enterTime() {
        int count = 0;
        do {
            outputToConsole("Please, enter time for show", ColorTypes.values()[count]);
            inputTime.inputTimeFromConsole(count);
            count++;
        } while (count < QUANTITY_OF_COLOR);
    }

    private void outputToConsole(String text, ColorTypes colorTypes) {
        ColorTypes currentColor = colorTypes;
        System.out.printf("%s %s color of Traffic Light (in minutes)%n", text, currentColor);
    }

    private void showLights() {
        System.out.println();
        for (int i = 0; i < QUANTITY_OF_COLOR; i++) {
            outputToConsole("Now is show a", ColorTypes.values()[i]);
            try {
                Thread.sleep(arrayMinutes[i] * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}