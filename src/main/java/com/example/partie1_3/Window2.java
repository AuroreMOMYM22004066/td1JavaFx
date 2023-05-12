package com.example.partie1_3;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Window2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création du conteneur principal
        BorderPane bdPane = new BorderPane();

        // separateur
        Separator sepa = new Separator();

        // ajout la barre de menus // Top
        MenuBar menuBar = new MenuBar();
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu help = new Menu("Help");

        // items menu
        // file
        MenuItem newMenu = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem close = new MenuItem("Close");
        // edit
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");


        // création du conteneur des boutons a gauche
        HBox hbox1 = new HBox();
        VBox vboxLeft = new VBox();

        // contenue de la VBox left
        Label LBouton = new Label("Boutons :");
        Button bouton1 = new Button("Bouton1");
        Button bouton2 = new Button("Bouton2");
        Button bouton3 = new Button("Bouton3");

        // Vbox center
        VBox vboxCenter = new VBox();

        // contenue de la vbox center
        GridPane gridPane = new GridPane();
        // contenue du gridpane
        TextField Tname = new TextField();
        TextField Temail = new TextField();
        TextField Tpassword = new TextField();
        Label name = new Label("Name:");
        Label email = new Label("Email:");
        Label password = new Label("Password:");

        gridPane.add(Tname, 1,0);
        gridPane.add(name, 0,0);
        gridPane.add(Temail, 1,1);
        gridPane.add(email, 0,1);
        gridPane.add(Tpassword, 1,2);
        gridPane.add(password, 0,2);

        HBox hboxCenter = new HBox();
        // contenue hbox
        Button submit = new Button("Submit");
        Button cancel = new Button("Cancel");


        // conteneur bottom
        VBox vboxbottom = new VBox();
        HBox hboxbottom = new HBox();
        Label fin = new Label("Ceci est un label de bas de page");


        //bottom
        vboxbottom.getChildren().addAll(sepa, hboxbottom);
        hboxbottom.getChildren().add(fin);
        hboxbottom.setAlignment(Pos.CENTER);
        //center
        hboxCenter.getChildren().addAll(submit, cancel);
        hboxCenter.setAlignment(Pos.CENTER);
        vboxCenter.getChildren().addAll(gridPane, hboxCenter);
        vboxCenter.setAlignment(Pos.CENTER);
        hbox1.getChildren().add(vboxCenter);
        hbox1.setAlignment(Pos.CENTER);
        //left
        vboxLeft.getChildren().addAll(LBouton, bouton1, bouton2, bouton3);
        vboxLeft.setAlignment(Pos.CENTER);
        //top
        edit.getItems().addAll( cut, copy, paste);
        file.getItems().addAll( newMenu, open, save, close);
        menuBar.getMenus().addAll( file, edit, help );
        bdPane.setTop(menuBar);
        bdPane.setLeft(vboxLeft);
        bdPane.setCenter(hbox1);
        bdPane.setBottom(vboxbottom);





        // Ajout du conteneur à la scene
        Scene scene = new Scene(bdPane);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");

        // Affichage de la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}