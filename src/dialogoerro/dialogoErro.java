/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogoerro;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author maria
 */
public class dialogoErro extends Application {

    @Override
    public void start(Stage Stage) {
        Button btn = new Button();
        btn.setText("Clique aqui");
        btn.setOnAction((ActionEvent event) -> {
            Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
            dialogoErro.setTitle("Error Message");
            dialogoErro.setHeaderText("");
            dialogoErro.setContentText("Esta pessoa é linda demais!");
            dialogoErro.showAndWait();
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 200, 200);

        Stage.setTitle("Information!");
        Stage.setScene(scene);
        Stage.show();
    }

}
