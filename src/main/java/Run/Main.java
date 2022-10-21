package Run;

import Controller.Lobby;
import Graphics.Audio;
import Graphics.CreateMap;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static javax.sound.sampled.Clip.LOOP_CONTINUOUSLY;

public class Main extends Application {
    public static Scene menuScene;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws IOException {

       /* Canvas canvas = new Canvas(CreateMap.WIDTH, CreateMap.HEIGHT);
        Group group = new Group();
        group.getChildren().add(canvas);
        Scene scene = new Scene(group);
        Animation.animation(scene, group);
        primaryStage.setScene(scene);
        File file = new File("src/main/resources/Music/test.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        primaryStage.show();
*/
        try {
            // play audio background
            Audio.lobby.play();
            FileInputStream fileInputStream = new FileInputStream(new File("src/main/resources/FXML/Lobby.fxml"));
            FXMLLoader loader = new FXMLLoader();
            Parent choiceRoot = loader.load(fileInputStream);
            menuScene = new Scene(choiceRoot);
            primaryStage.setScene(menuScene);
            primaryStage.setTitle("BOMBERMAN UET ");
            primaryStage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}