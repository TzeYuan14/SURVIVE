package com.example.demo;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;


public class UserInterface_4 extends Start_Screen{

    public void createUI(Stage window){

        Scene s1;
        Pane root = new Pane();

        StartingStory text = new StartingStory();

        ChoicesContainer choiceBox = new ChoicesContainer(window);

        AddImage addImg = new AddImage();
        root.getChildren().addAll(addImg, choiceBox, text);

        // Set up a new scene
        s1 = new Scene(root, 1080,720);
        s1.setFill(Color.BLACK);

        window.setScene(s1);
        window.show();
    }

// ******************************************************************************
//                          AddImage Class
// ******************************************************************************
    public static class AddImage extends StackPane{

        ImageView imgView;

        public AddImage(){
            Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/env_1.jpg")));

            imgView = new ImageView();
            imgView.setImage(img);
            imgView.setFitWidth(1080);
            imgView.setFitHeight(720);
            imgView.setOpacity(0.8);

            getChildren().add(imgView);
        }
    }

// ******************************************************************************
//                          StoryText Class
// ******************************************************************************
    public class StartingStory extends Pane{

        int min = 1;
        int max = 4;
        //int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        int random_int = 2;

        Text content;

        public StartingStory(){
            audio.stop();
            content = new Text();
            content.setText("It's the year 2179, a chaotic and apocalyptic world.\n" +
                    "Umbrella Corp. invented a new virus that can be used as a bio weapon against their enemies. This bio-weapon turns ordinary human into a mindless, berserk, bloodthirsty creature who has one objective, attack other human and devour their body, making it a cannibal.\n" +
                    "It's been 6 months after the outbreak of the virus, You have survived so far by relying on your intuition and luck.\n" +
                    "It's a new day to survive, what will you do?");
            content.getFont();
            content.setFont(Font.font(20));
            content.setFill(Color.WHITE);
            content.setWrappingWidth(750);     // Set the text size (750) When it reaches the max text size, it will automatically move to the next line
            content.setTranslateX(150);
            content.setTranslateY(200);

            getChildren().add(content);
        }
    }

// ******************************************************************************
//                         ChoiceContainer Class
// ******************************************************************************
    public static class ChoicesContainer extends StackPane{

        UIButtonDesign choiceBtn1;
        UIButtonDesign choiceBtn2;
        UIButtonDesign choiceBtn3;

        public ChoicesContainer(Stage window){

            // Story Scene 1 - Choice 1
            choiceBtn1 = new UIButtonDesign("Go West");
            choiceBtn1.setOnMouseClicked(event -> {
                Storyline_Apocalypse story = new Storyline_Apocalypse();
                story.storyScene2West_Hospital(window, 0);
            });

            // Story Scene 1 - Choice 2
            choiceBtn2 = new UIButtonDesign("Go North");
            choiceBtn2.setOnMouseClicked(event -> {
                Storyline_Apocalypse story = new Storyline_Apocalypse();
                story.storyScene2North(window);
            });

            // Story Scene 1 - Choice 3
            choiceBtn3 = new UIButtonDesign("Go East");
            choiceBtn3.setOnMouseClicked(event -> {
                Storyline_Apocalypse story = new Storyline_Apocalypse();
                story.storyScene2East_Bandit(window);
            });

            // Set up VBox with spacing 20 between the buttons.
            VBox layout = new VBox(20);
            layout.setTranslateX(200);
            layout.setTranslateY(500);
            layout.getChildren().addAll(choiceBtn1, choiceBtn2, choiceBtn3);

            getChildren().add(layout);
        }

    }


// ******************************************************************************
//                          UIButtonDesign Class
// ******************************************************************************
    public static class UIButtonDesign extends StackPane{
        Text word;

        public UIButtonDesign(String name){
            word = new Text(name);
            word.getFont();
            word.setFont(Font.font(20));
            word.setFill(Color.WHITE);

            Rectangle box = new Rectangle(500, 40);
            box.setOpacity(0.6);
            box.setFill(Color.BLACK);
            box.setEffect(new GaussianBlur(3.5));

            setAlignment(Pos.CENTER);
            getChildren().addAll(box, word);

            setOnMouseEntered(event -> {
                box.setTranslateX(5);
                word.setTranslateX(5);
                box.setFill(Color.WHITE);
                word.setFill(Color.BLACK);
            });

            setOnMouseExited(event -> {
                box.setTranslateX(0);
                word.setTranslateX(0);
                box.setFill(Color.BLACK);
                word.setFill(Color.WHITE);
            });

            DropShadow drop = new DropShadow(50, Color.RED);
            drop.setInput(new Glow());

            setOnMousePressed(event -> setEffect(drop));
            setOnMouseReleased(event -> setEffect(null));

        }
    }
}
