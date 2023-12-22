package com.greenn.neuron2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    ArrayList<Integer> inputArray = new ArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(int i = 0; i<60; i++){
            inputArray.add(0);
        }
    }

    public enum letters{
       A(new ArrayList<Integer>(Arrays.asList(
               0,0,0,0,0,0,
               0,0,0,0,0,0,
               0,0,1,1,0,0,
               0,1,0,0,1,0,
               0,1,0,0,1,0,
               0,1,1,1,1,0,
               0,1,0,0,1,0,
               0,1,0,0,1,0,
               0,0,0,0,0,0,
               0,0,0,0,0,0
       ))),
       B(new ArrayList<Integer>(Arrays.asList(
               0,0,0,0,0,0,
               0,0,0,0,0,0,
               0,1,1,1,0,0,
               0,1,0,0,1,0,
               0,1,1,1,0,0,
               0,1,0,0,1,0,
               0,1,0,0,1,0,
               0,1,1,1,0,0,
               0,0,0,0,0,0,
               0,0,0,0,0,0
       ))),
       C(new ArrayList<Integer>(Arrays.asList(
               0,0,0,0,0,0,
               0,0,0,0,0,0,
               0,0,1,1,0,0,
               0,1,0,0,1,0,
               0,1,0,0,0,0,
               0,1,0,0,0,0,
               0,1,0,0,1,0,
               0,0,1,1,0,0,
               0,0,0,0,0,0,
               0,0,0,0,0,0
       ))),
       D(new ArrayList<Integer>(Arrays.asList(
               0,0,0,0,0,0,
               0,0,0,0,0,0,
               0,1,1,1,0,0,
               0,1,0,0,1,0,
               0,1,0,0,1,0,
               0,1,0,0,1,0,
               0,1,0,0,1,0,
               0,1,1,1,0,0,
               0,0,0,0,0,0,
               0,0,0,0,0,0
       ))),
       E(new ArrayList<Integer>(Arrays.asList(
               0,0,0,0,0,0,
               0,0,0,0,0,0,
               0,1,1,1,1,0,
               0,1,0,0,0,0,
               0,1,1,1,0,0,
               0,1,0,0,0,0,
               0,1,0,0,0,0,
               0,1,1,1,1,0,
               0,0,0,0,0,0,
               0,0,0,0,0,0
       ))),
       F(new ArrayList<Integer>(Arrays.asList(
               0,0,0,0,0,0,
               0,0,0,0,0,0,
               0,1,1,1,1,0,
               0,1,0,0,0,0,
               0,1,1,1,0,0,
               0,1,0,0,0,0,
               0,1,0,0,0,0,
               0,1,0,0,0,0,
               0,0,0,0,0,0,
               0,0,0,0,0,0
       ))),
       G(new ArrayList<Integer>(Arrays.asList(
               0,0,0,0,0,0,
               0,0,0,0,0,0,
               0,0,1,1,0,0,
               0,1,0,0,0,0,
               0,1,0,0,0,0,
               0,1,0,1,1,0,
               0,1,0,0,1,0,
               0,0,1,1,0,0,
               0,0,0,0,0,0,
               0,0,0,0,0,0
       ))),
       H(new ArrayList<Integer>(Arrays.asList(
               0,0,0,0,0,0,
               0,0,0,0,0,0,
               0,1,0,0,1,0,
               0,1,0,0,1,0,
               0,1,1,1,1,0,
               0,1,0,0,1,0,
               0,1,0,0,1,0,
               0,1,0,0,1,0,
               0,0,0,0,0,0,
               0,0,0,0,0,0
       ))),
       I(new ArrayList<Integer>(Arrays.asList(
               0,0,0,0,0,0,
               0,0,0,0,0,0,
               0,1,1,1,0,0,
               0,0,1,0,0,0,
               0,0,1,0,0,0,
               0,0,1,0,0,0,
               0,0,1,0,0,0,
               0,1,1,1,0,0,
               0,0,0,0,0,0,
               0,0,0,0,0,0
       ))),
       J(new ArrayList<Integer>(Arrays.asList(
               0,0,0,0,0,0,
               0,0,0,0,0,0,
               0,0,0,0,1,0,
               0,0,0,0,1,0,
               0,0,0,0,1,0,
               0,1,0,0,1,0,
               0,1,0,0,1,0,
               0,0,1,1,0,0,
               0,0,0,0,0,0,
               0,0,0,0,0,0
       )));

       letters(ArrayList<Integer> integers) {
       }
   }
    public void onButtonClicked(ActionEvent actionEvent) {
     Button button = (Button) actionEvent.getSource();
        button.styleProperty().setValue("-fx-background-color: deepSkyBlue;");
     int index = Integer.parseInt(button.getId().substring(4));
     inputArray.set(index-1, 1);
    }

    public void onButtonSaveClicked(ActionEvent actionEvent) {
        System.out.println(inputArray);
    }


}