package com.example.partie2_2;

import com.example.partie2_1.ButtonClickHandler;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Exercice4 extends Application {

    private Label label;
    private Button vert;
    private Button Rouge;
    private Button bleu;

    public Exercice4 (){
        t
    }

    // creation du contenaur principal
    BorderPane bdPane = new BorderPane();

    //
    this.label = new Label();

    // remplissage
    bdPane.setTop(this.label);



    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {


        // creation de la scene
        Scene scene = new Scene(bdPane);

        // ajout de la scene a la fenetre
        primaryStage.setScene(scene);

        primaryStage.setTitle("Hello application");
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
        primaryStage.show();
    }
}
