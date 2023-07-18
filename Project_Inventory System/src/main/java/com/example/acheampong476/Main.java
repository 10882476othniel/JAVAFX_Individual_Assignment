package com.example.acheampong476;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import classes.Product;
import java.util.HashMap;
import java.util.Stack;
import java.util.Queue;
import java.util.List;

import java.io.IOException;

public class Main extends Application {

    public static Management inventory;

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/products.fxml"));
        primaryStage.setTitle("Inventory System");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        inventory = new Management();
        launch(args);
    }
}