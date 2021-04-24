package main.java.com.example.simulationlab13;

public class Event {

    private double experimentalProbability;
    private final double probability;

    public Event(double probability) {
        this.experimentalProbability = 0.0;
        this.probability = probability;
    }

    public void increaseExperimentalProbability(double increase) {
        this.experimentalProbability += increase;
    }

    public double getProbability() {
        return probability;
    }

    public double getExperimentalProbability() {
        return this.experimentalProbability;
    }
}
