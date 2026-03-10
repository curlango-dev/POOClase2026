package uabc.curlango.demodominoxxx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class DominoApplication extends Application {
    private JuegoDomino juego;
    @Override
    public void start(Stage stage) throws IOException {
        juego = new JuegoDomino();
        Ficha ficha = juego.getFicha();
        FichaEmoji fichaEmoji = new FichaEmoji(ficha.getLadoA(), ficha.getLadoB());

        BorderPane root = new BorderPane();
        Label label = new Label(fichaEmoji.getEmoji());
        Font font = new Font("Arial", 60);
        label.setFont(font);
        root.setCenter(label);

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Domino!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}