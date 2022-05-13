package com.example.second;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

//import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Arrays;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        Scene scene = new Scene(group, 1280, 720);
        Label label = new Label("Введите коэффициент при x^2");
        Label label1 = new Label("Введите коэффициент при x");
        Label label2 = new Label("Введите свободный коэффициент");
        Label label3 = new Label("Здесь будет ответ");
        Label label4 = new Label("Инструкция:\n 1) В поля вводить можно только числа(если число вещественное, то вводить через точку)\n" +
                "2) Поля пустыми не оставлять(если коэффициент равен нулю, то прописать 0)");

        label.setLayoutX(160);
        label.setLayoutY(0);
        label4.setLayoutX(600);
        label4.setLayoutY(50);
        label1.setLayoutX(160);
        label1.setLayoutY(50);
        label2.setLayoutX(160);
        label2.setLayoutY(100);
        label.setStyle("-fx-border-color: white;");
        label3.setStyle("-fx-border-color: blue;");// способ выбрать цвет границы
        label4.setStyle("-fx-border-color: red;");
        label3.setLayoutX(500);
        label3.setLayoutY(300);
        label3.setMinHeight(300);
        label3.setMinWidth(300);
        label3.setMaxHeight(200);
        label.setMinHeight(30);
        label.setMaxHeight(30);
        label.setMinWidth(100);
        label.setMaxWidth(300);
        label.setFont(new Font(15));
        label1.setFont(new Font(15));// способ установить размер шрифта
        label2.setFont(new Font(15));
        label3.setFont(new Font(25));
        label4.setFont(new Font(16));
        TextField textField = new TextField();
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        textField1.setLayoutY(50);
        textField2.setLayoutY(100);
        group.getChildren().add(textField);
        group.getChildren().add(textField1);
        group.getChildren().add(textField2);
        Button button = new Button("Рассчитать корни");
        button.setLayoutX(0);
        button.setLayoutY(150);
        group.getChildren().add(button);


        button.setOnMouseClicked(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    double a = Double.parseDouble(textField.getText());
                    double b = Double.parseDouble(textField1.getText());
                    double c = Double.parseDouble(textField2.getText());
                    boolean IsEquation = true;
                    if (a == 0 && b == 0 && c!=0 ) {
                        label3.setText(c + " = 0 - неверно, корней нет");
                        IsEquation = false;
                    }
                    if ((a == 0 && b == 0 && c==0 )){
                        label3.setText(c + " = 0 - верно, корней бесконечно много");
                        IsEquation = false;
                    }
                    if (IsEquation) {
                        double d = b * b - 4 * a * c;
                        if (a == 0) {
                            double k = (-c) / b;
                            label3.setText("Это уравнение не квадратное,но корень\nx = " + k);
                        } else {
                            if (d < 0) {
                                label3.setText("Дискриминант отрицателеньный\nВещественных корней нет");
                            }
                            if (d == 0) {
                                double x = -b / (2 * a);
                                label3.setText(x + " единственный корень\nДискриминант равен нулю");
                            }
                            if (d > 0) {
                                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                                label3.setText(x1 + " - первый корень\n" + x2 + " - второй корень");
                            }


                        }
                    }
                }
                catch (Exception e){
                    label3.setText("Вводить можно только числа\nПерезапустите программу");
                }


            }
        });
        group.getChildren().add(label);
        group.getChildren().add(label1);
        group.getChildren().add(label2);
        group.getChildren().add(label3);
        group.getChildren().add(label4);



        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}