module com.greenn.neuron2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.greenn.neuron2 to javafx.fxml;
    exports com.greenn.neuron2;
}