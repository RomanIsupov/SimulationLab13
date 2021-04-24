package main.java.com.example.simulationlab13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Listener {

    public static void main(String args[]) {
        System.out.println("Hello. Please enter the probability for geometric distribution.");
        Scanner input = new Scanner(System.in);
        double probability = input.nextDouble();

        System.out.println("Please, enter the total quantity of events in the experiment.");
        int quantity = input.nextInt();

        Experiment experiment = new Experiment(probability, quantity);
        experiment.start();
        printData(experiment);
    }

    private static void printData(Experiment experiment) {
        printProbabilities(experiment);
        printFrequencies(experiment);
        System.out.println();

        printAverage(experiment);
        printAverageError(experiment);
        System.out.println();

        printVariance(experiment);
        printVarianceError(experiment);
        System.out.println();

        printChiSquare(experiment);
    }

    private static void printProbabilities(Experiment experiment) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        double[] probabilities = experiment.getProbabilities();
        System.out.println("Theoretical probabilities:");
        for (double probability : probabilities) {
            System.out.print(decimalFormat.format(probability) + " ");
        }
        System.out.println();
    }

    private static void printFrequencies(Experiment experiment) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        double[] frequencies = experiment.getFrequencies();
        System.out.println("Empirical frequencies:");
        for (double frequency : frequencies) {
            System.out.print(decimalFormat.format(frequency) + " ");
        }
        System.out.println();
    }

    private static void printAverage(Experiment experiment) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        System.out.print("Average: ");
        System.out.println(decimalFormat.format(experiment.getAverage()));
    }

    private static void printVariance(Experiment experiment) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        System.out.print("Variance: ");
        System.out.println(decimalFormat.format(experiment.getVariance()));
    }

    private static void printAverageError(Experiment experiment) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        System.out.print("Average error: ");
        System.out.println(decimalFormat.format(experiment.getAverageError()));
    }

    private static void printVarianceError(Experiment experiment) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        System.out.print("Variance error: ");
        System.out.println(decimalFormat.format(experiment.getVarianceError()));
    }

    private static void printChiSquare(Experiment experiment) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        System.out.print("Chi squared: ");
        System.out.println(decimalFormat.format(experiment.getChiSquared()));
    }
}
