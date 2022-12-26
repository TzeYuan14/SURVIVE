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


public class UserInterface_1 {

    public void createUI(Stage window){

        Scene s1;
        Pane root = new Pane();

        StoryText text = new StoryText();

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
            Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Uruk.jpg")));

            imgView = new ImageView();
            imgView.setImage(img);
            imgView.setFitWidth(1080);
            imgView.setFitHeight(720);
            imgView.setOpacity(0.6);

            getChildren().add(imgView);
        }
    }

// ******************************************************************************
//                          StoryText Class
// ******************************************************************************
    public static class StoryText extends Pane{

        Text content;

        public StoryText(){
            content = new Text();
            content.setText(" The city was as lively as ever. Everybody was having a fun time as usual." +
                    " When suddenly, an explosion happened. As one of people on duty that day, you rush over to the scene." +
                    " You and your colleagues see an ominous figure behind the clouds of dust." +
                    " You spine starts to tingle as you feel a rather unsettling aura from this silhouette." +
                    " The idea of running away comes to mind but at the same time you want to fight this figure with your colleagues." +
                    " In the end, you decided to....");
            content.getFont();
            content.setFont(Font.font(20));
            content.setFill(Color.WHITE);
            content.setWrappingWidth(750);     // Set the text size (750) When it reaches the max text size, it will automatically move to the next line
            content.setTranslateX(170);
            content.setTranslateY(215);

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
            choiceBtn1 = new UIButtonDesign("Stand your ground and fight.");
            choiceBtn1.setOnMouseClicked(event -> {
                Storyline_Desert story = new Storyline_Desert();
                story.storyScene2Choice1(window);
            });

            // Story Scene 1 - Choice 2
            choiceBtn2 = new UIButtonDesign("Make a run for it.");
            choiceBtn2.setOnMouseClicked(event -> {
                Storyline_Desert story = new Storyline_Desert();
                story.storyScene2Choice2(window);
            });

            choiceBtn3 = new UIButtonDesign("");

            // Set up VBox with spacing 20 between the buttons.
            VBox layout = new VBox(20);
            layout.setTranslateX(250);
            layout.setTranslateY(420);
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
