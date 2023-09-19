package com.codebase;

public class Printer {
    public int paperLeft;
    public int tonerVolume;

    public Printer(int paperLeft, int tonerVolume) {
        this.paperLeft = paperLeft;
        this.tonerVolume = tonerVolume;
    }

    public void print(int pages, int copies) {
        int totalPagesToPrint = pages * copies;

        if (paperLeft >= totalPagesToPrint && tonerVolume >= totalPagesToPrint) {
            paperLeft -= totalPagesToPrint;
            tonerVolume -= totalPagesToPrint;
            System.out.println("Printing " + totalPagesToPrint + " pages.");
        } else {
            System.out.println("Not enough paper or toner to print.");
        }
    }

    public int getPaperLeft() {
        return paperLeft;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }
}

