package com.greenn.neuron2;

import java.util.List;

public class Neuron {
    List<Double> listOfInputs;
    List<Double> listOfWeights;
    List<Double> listOfOutputs;
    double theta;
    private Double process(double input, double weight, double theta){
        if(input*weight>=theta) return 1.0; else return 0.0;
    }
}
