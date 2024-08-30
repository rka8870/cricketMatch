package com.cricket.match.models.event;

public class Run extends Bowl{
    private int runs;

    public Run(int runs) {
        this.runs = runs;
    }

    public int getRuns() {
        return runs;
    }

    public String getMessage() {
        return runs + " Scored";
    }
}
