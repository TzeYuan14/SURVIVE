package com.example.demo;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Objects;

public class StorylineDungeon extends UserInterface_4 {

    StartingStory paragraph = new StartingStory();
    UserInterface_4.AddImage bgImg = new UserInterface_4.AddImage();

// ******************************************************************************
//                        Story Scene 2 - Choice 1-Aroute
// ******************************************************************************
    public void storyScene2Choice1(Stage window){
        Scene scene;
        Pane root = new Pane();

        // Change the story Text
        paragraph.content.setText("Me: \n" +
                "Who are you and what is this place? Do you know how to get out of here? \n\n" +
                "Mysterious man: \n" +
                "You dont need to know who I am and what place this is.\n"+
                "This place is dangerous I will lead you out.\n"+
                "You followed the man and you encountered wolves on the way.\n"+
                "Suddenly, a wolf plunges wildly at you. The man quickly reacts and protects you but he is injured.\n"+
                "The man tells you the way out and ask you to leave alone.");

        paragraph.content.setY(-100);
        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/dungeon_wolf.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.8);
        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Go out alone");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            storyScene3LeftChoice1(window);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Cannot leave him alone, he is injured");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            storyScene3LeftChoice2(window);
        });

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));


        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                        Story Scene 2 - Choice 2 Broute
// ******************************************************************************
    public void storyScene2Choice2(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You stay away from him and continue your own journey.\n\n" +
                "Soon time later, you reach a junction, there are two ways. ");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/junction.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.7);

        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Left");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            storyScene3RightChoice1(window);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Right");
        choices.choiceBtn2.setOnMouseClicked(event ->{
            storyScene3RightChoice2(window);
        });

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                   Left side - Story Scene 3 - Choice A neutral ending
// ******************************************************************************
    public void storyScene3LeftChoice1(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You see a stairs and the light is coming out from the top of it.\n You have successfully get out of the dungeon.");
        paragraph.content.setY(100);

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/dungeonneuending.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.8);

        UserInterface_2.ChoicesContainer choices = new UserInterface_2.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("NORMAL ENDING");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });
        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);


        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                    Left side - Story Scene 3 - Choice 2//
// ******************************************************************************
    public void storyScene3LeftChoice2(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("Me:\n I can't just leave you alone. You are injured because of me.\n\n" +
                "You scared the pack of wolves away with a wooden bat\n" +
                "You carry him to the path to get out that the man told you before he fainted.\n" +
                "In the halfway, you feel very tired and decided to stop by to have a rest.\n" +
                "You found a place and there are some resources and water.\n" +
                "You do emergency first aid for the man.\n" +
                "After around 30 minutes, the man wakes up and speaks\n\n" +
                "Mysterious man:\n" +
                "Thank you.... for helping me.\n\n" +
                "At the same time, the man reaches his hand to you, holding a coin and ask you if you want to know the secret and truth of this dungeon.\n");
        //change position of text
        paragraph.content.setY(-140);
        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Yes");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            storyScene4LeftChoice1(window);
        });

        // Button 2
        choices.choiceBtn2.word.setText("No");
        choices.choiceBtn2.setOnMouseClicked(event -> {
           storyScene4LeftChoice2(window);
        });

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/restpoint.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.8);
        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

    // ******************************************************************************
//                   Left side - Story Scene 4 - Choice 1- dungeon secret ending
// ******************************************************************************
    public void storyScene4LeftChoice1(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You received the coin from his hand.\n" +
                "You take a look at the coin, the sculpture look like the place that you woke up in the beginning.\n" +
                "You rushes back to the place you woke up\n" +
                "There is a secret door.\n" +
                "Behind the secret path, there is a unknown secret country.\n" +
                "There is a giant fantastic tree that only appears in story tales.");
        paragraph.content.setY(-50);

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/dungeonsecretending.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.8);

        UserInterface_2.ChoicesContainer choices = new UserInterface_2.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("SECRET ENDING");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });
        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }
    // ******************************************************************************
//                   Left side - Story Scene 4 - Choice 2
// ******************************************************************************
    public void storyScene4LeftChoice2(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("Mysterious man:\n So that is your choice.. \n\nYou received the coin from his hand.\n" +
                "You take a look at the coin, it looks like a treasure coin.\n" +
                "The man tells you that he is fine and you may go now\n" +
                "You follow the way that the man told you.\n" +
                "You see a stairs and the light is coming out from the top of it.\n You have successfully get out of the dungeon.");
        paragraph.content.setY(-50);

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/dungeonneuending.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.8);

        UserInterface_2.ChoicesContainer choices = new UserInterface_2.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("NORMAL ENDING");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });
        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

// ******************************************************************************
//                   Right side - Story Scene 4 - Choice 1- B route bad ending
// ******************************************************************************
    public void storyScene4RightChoice1(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("On the way, you step on a trigger trap.\n" +
                "Large amount of thorns dropped from the ceiling\n" +
                "YOU DIED.");
        paragraph.content.setY(-50);

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/dungeonbadending.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.8);

        UserInterface_2.ChoicesContainer choices = new UserInterface_2.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Exit game");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Play again");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            UserInterface_2 ui = new UserInterface_2();
            ui.createUI(window);
        });

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }
    // ******************************************************************************
//                   Right side - Story Scene 4 - Choice 2- B route neutral ending
// ******************************************************************************
    public void storyScene4RightChoice2(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You dont remember it's been how long since you start walking.\n" +
                "When you are exhausted and nearly despair, you see a stairs and the light is coming out from the top of it.\n You have successfully get out of the dungeon.");
        paragraph.content.setY(-50);

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/dungeonneuending.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.8);

        UserInterface_2.ChoicesContainer choices = new UserInterface_2.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("NORMAL ENDING");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });
        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }
    // ******************************************************************************
//                        Right Side-Story Scene 3 - Choice 1
// ******************************************************************************
    public void storyScene3RightChoice1(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You meet a pack of wolves on the way.\n" +
                "What would you do?");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/dungeon_wolf.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.7);

        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("RUN");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            storyScene4RightChoice1(window);
        });

        // Button 2
        choices.choiceBtn2.word.setText("SCARE THEM AWAY USING WOODEN BAT");
        choices.choiceBtn2.setOnMouseClicked(event ->{
            storyScene4RightChoice2(window);
        });

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }
    // ******************************************************************************
//                       Right side Story Scene 3 choice2
// ******************************************************************************
    public void storyScene3RightChoice2(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You feel tired after the long way....\n" +
                "Do you want to rest?");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/junction.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.7);

        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("YES");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            storyScene4RightChoice3(window);
        });

        // Button 2
        choices.choiceBtn2.word.setText("No, I need to leave here ASAP");
        choices.choiceBtn2.setOnMouseClicked(event ->{
            storyScene4RightChoice4(window);
        });

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }
    // ******************************************************************************
//                     Right side Story- Scene4- choice 3 B Bad ending
// ******************************************************************************
    public void storyScene4RightChoice3(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You are woken up by the noise of walking.\n When you look at the source of the noise," +
                " you see a pack of wolves trying to ambush you.\n" +
                " You try to run away but you fail to outrun the wolves and you are attacked.\n\n" +
                "YOU DIED");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/wolfmaul.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.7);


        UserInterface_2.ChoicesContainer choices = new UserInterface_2.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Exit game");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Play again");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            UserInterface_2 ui = new UserInterface_2();
            ui.createUI(window);
        });

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }
    // ******************************************************************************
//                        Right side Story -Scene4 -choice 4 B - Neutral ending
// ******************************************************************************
    public void storyScene4RightChoice4(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You feel that staying here is dangerous, you do not want to stay here, not for one second more.\n" +
                "You dont remember it's been how long since you start walking.\n" +
                "When you are exhausted and nearly despair, you see a stairs and the light is coming out from the top of it.\n You have successfully get out of the dungeon.");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/dungeonneuending.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.7);


        UserInterface_2.ChoicesContainer choices = new UserInterface_2.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("NORMAL ENDING");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });
        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }
}
