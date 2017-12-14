package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Contactos {
    @FXML
    Button btn_atras;

    public void atras(ActionEvent actionEvent) {
        Stage stage = (Stage) btn_atras.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("opcion.fxml"));
        Parent root = null;
        try {
            root = (Parent)fxmlLoader.load();
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicacion");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("Lo siento. Llama al administrador.");
            alerta.showAndWait();
            Platform.exit();
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
