package org.example;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Label label = new Label("Value to convert:");
        TextField textField = new TextField();
        String[] unitLength = {"km", "hm", "dam", "m", "dm", "cm", "mm"};
        ComboBox comboBox = new ComboBox(FXCollections.observableArrayList(unitLength));
        Label label1 = new Label(" = ");
        Label resultLabel = new Label();
        ComboBox comboBox2 = new ComboBox(FXCollections.observableArrayList(unitLength));
        Button button = new Button("Submit");
        button.setStyle("-fx-background-color: #FF0000;");


        button.setOnAction(e -> {
            String name = textField.getText();
            resultLabel.setText("Hello, " + name + "!");
        });

        HBox layout = new HBox(10); // spacing = 10px
        layout.getChildren().addAll(label, textField, comboBox, label1, resultLabel, comboBox2, button);

        Scene scene = new Scene(layout, 900, 300);

        stage.setTitle("JavaFX Simple UI");
        stage.setScene(scene);
        stage.show();
    }
}