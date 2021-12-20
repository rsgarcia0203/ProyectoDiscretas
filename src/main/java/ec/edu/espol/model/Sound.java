/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import ec.edu.espol.encriptadodiscretas.App;
import java.io.File;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

/**
 *
 * @author rsgar
 */
public abstract class Sound {
        
    public static void playBGMusic() {
        
        String path = "resources/sounds/bg_music.mp3";
        Media sound = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        MediaView mediaView = new MediaView(mediaPlayer);
        
        mediaPlayer.setVolume(0.0);

        mediaPlayer.setOnEndOfMedia(() -> {
            mediaPlayer.seek(Duration.ZERO);
            mediaPlayer.play();
        });

        mediaPlayer.play();

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(3),
                        new KeyValue(mediaPlayer.volumeProperty(), 0.15)));
        timeline.play();
        
    }
    
    public static void stopBGMusic() {

        Media sound = new Media(null);
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setVolume(0.0);

        mediaPlayer.play();

    }
    
    public static void goButton(){
        
        Media sound = new Media(new File("src/main/resources/ec/edu/espol/sounds/go_button.wav").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setVolume(0.4);
        mediaPlayer.play();
    }
    
    public static void click1(){
        
        Media sound = new Media(new File("src/main/resources/ec/edu/espol/sounds/click_01.mp3").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setVolume(0.15);
        mediaPlayer.play();
    }
    
    public static void click2(){
        
        Media sound = new Media(new File("src/main/resources/ec/edu/espol/sounds/click_02.mp3").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setVolume(0.4);
        mediaPlayer.play();
    }
    
    public static void click3(){
        
        Media sound = new Media(new File("src/main/resources/ec/edu/espol/sounds/click_03.mp3").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setVolume(0.6);
        mediaPlayer.play();
    }
    
    public static void success(){
        
        Media sound = new Media(new File("src/main/resources/ec/edu/espol/sounds/success.wav").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setVolume(0.5);
        mediaPlayer.play();
    }
    
    public static void mistake(){
        
        Media sound = new Media(new File("src/main/resources/ec/edu/espol/sounds/mistake.wav").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setVolume(0.5);
        mediaPlayer.play();
    }
    
}