package com.example.demo;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;

public class Storyline_Forest extends UserInterface_3 {

    UserInterface_3.StoryText paragraph = new UserInterface_3.StoryText();
    UserInterface_3.AddImage bgImg = new UserInterface_3.AddImage();

// ******************************************************************************
//                        Story Scene 2 - Choice 1
// ******************************************************************************
    public void storyScene2Choice1(Stage window){
        Scene scene;
        Pane root = new Pane();

        // Change the story Text
        paragraph.content.setText("You muster a surge of courage to discover the source of sound. In the forest by moonlight, " +
                "you notice a huge dark figure behind the pine tree, which is approximate 500ft distance from you. All of a sudden, the " +
                "dark shadow turn around and you can clearly see that the dark shadow is actually a wild grizzly bear! The bear stare at you" +
                " and start chasing you! You have to ...");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/DeepForest.jpg")));
        bgImg.imgView.setImage(img);

        // Change the text of buttons
        // Button 1
        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Find a hiding spot");
        choices.choiceBtn1.setOnMouseClicked(event -> storyScene3LeftChoice1(window));

        // Button 2
        choices.choiceBtn2.word.setText("Pretend to be dead");
        choices.choiceBtn2.setOnMouseClicked(event -> storyScene3LeftChoice2(window));

        // Button 3
        choices.choiceBtn3.word.setText("Run");
        choices.choiceBtn3.setOnMouseClicked(event -> storyScene3LeftChoice3(window));

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

// ******************************************************************************
//                   Left side - Story Scene 3 - Choice 1
// ******************************************************************************
    public void storyScene3LeftChoice1(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You search for a hiding spot while running away from the wild bear, but unfortunately, " +
                "you didn't manage to find a suitable hiding spot as you are surrounded by pine trees only. You feel " +
                "a surge of adrenaline as you are being chasing by the wild bear. Suddenly, you accidentally" +
                " fall down and hurt your knee, and the wild bear is just right in front of you. It attack you by biting your arm and leg. You " +
                " moan with pain and the attack of wild bear causes you loss of consciousness and death. ");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Bear.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.setOpacity(0.5);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText(" > Continue");
        choices.choiceBtn1.setOnMouseClicked(event -> badEnding(window));

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                    Left side - Story Scene 3 - Choice 2
// ******************************************************************************
    public void storyScene3LeftChoice2(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You understand that the bear runs very fast and you have almost no chance of winning" +
                " Therefore, you decide to try your luck on 'playing dead' for the wild bear. Unfortunately, the" +
                "cleverness of the wild bear is beyond your imagination. It attack you by biting your arm and leg. You " +
                "moan with pain and the attack of wild bear causes you loss of consciousness and death.");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Bear.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.setOpacity(0.5);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText(" > Continue");
        choices.choiceBtn1.setOnMouseClicked(event -> badEnding(window));

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                    Left side - Story Scene 3 - Choice 3
// ******************************************************************************
    public void storyScene3LeftChoice3(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You start to running away from the bear. Luckily, you notice there is a dilapidated house with a" +
                " glimmer of light in the " +
                "distance of 200ft at the right. You quickly run towards that direction and prepare to hide in the house. When you" +
                " try to open the front door, the door is locked! 'Hello, is anybody here? I need help!' You knock the door so many times but " +
                "the other side of the door didn't respond to you. Now, you choose to ...");

        Image house = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/House.jpeg")));
        bgImg.imgView.setImage(house);
        bgImg.imgView.setOpacity(0.8);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Continue to knock the door");
        choices.choiceBtn1.setOnMouseClicked(event -> continueKnockDoor(window));

        // Button 2
        choices.choiceBtn2.word.setText("Give up knocking the door and continue to run");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            giveUpKnock(window);
        });

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                  Choice 2 - Give up knocking the door
// ******************************************************************************
    public void giveUpKnock(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("As the house owner didn't respond to you, so you have no choice to give up knocking the door" +
                " and continue running. You feel a surge of adrenaline as you are being chasing by the wild bear. " +
                 "Suddenly, you accidentally fall down and hurt your knee, and the wild bear is just right in front of you. " +
                "It attack you by biting your arm and leg. " +
                "You moan with pain and the attack of wild bear causes you loss of consciousness and death.");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Bear.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.setOpacity(0.9);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText(" > Continue");
        choices.choiceBtn1.setOnMouseClicked(event -> badEnding(window));

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//               Story Scene 4 - Choice 1 - Continue knock the door
// ******************************************************************************
    public void continueKnockDoor(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("Suddenly, the door opens up. 'Come in!' You enter the house and close" +
                " the door immediately after you hear a man's voice. 'Are you alright? Have a sit in " +
                "that dining chair. Take your time to rest and I will prepare some delicious dishes and drinks for you.'" +
                " After he has finished talking, he walks into the kitchen to start preparing the food. However," +
                " you feel a bit out of place because you know there is a rancid smell in this house somewhere." +
                " You decide to ...");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/InteriorHouse.jpg")));
        bgImg.imgView.setImage(img);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Find the direction of the rancid smell's source");
        choices.choiceBtn1.setOnMouseClicked(event -> findDirectionSmell(window));

        // Button 2
        choices.choiceBtn2.word.setText("Walk around in this house");
        choices.choiceBtn2.setOnMouseClicked(event -> walkAround(window));

        // Button 3
        choices.choiceBtn3.word.setText("Wait for the delicious dishes to be served");
        choices.choiceBtn3.setOnMouseClicked(event -> diningRoom(window));

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }



// ******************************************************************************
//            Story Scene 5 - Choice 1 - Find the direction of rancid smell
// ******************************************************************************
    public void findDirectionSmell(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("As you enter a bedroom, the rancid smell is getting stronger. Finally, you come to the front" +
                "of a closet located on the right side of the room's door. You are pretty sure there is something inside the closet. " +
                "You don't why you have a bad feeling opening the closet's door. Do you still want to open the closet's door? ");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Bedroom.jpg")));
        bgImg.imgView.setImage(img);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Return to the dining room");
        choices.choiceBtn1.setOnMouseClicked(event -> diningRoom(window));

        // Button 2
       choices.choiceBtn2.word.setText("Open the closet's door");
        choices.choiceBtn2.setOnMouseClicked(event -> openClosetDoor(window));

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//            Story Scene 5 - Choice 2 - Walk around in this house
// ******************************************************************************
    public void walkAround(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You walk into a living room in this house. The french windows are chopped" +
                " as they are in small square panes that added to the beauty of the living room. The grandfather" +
                " clock in the corner ticked slowly and unevenly; now again it gives a little cough, hesitating " +
                "momentarily, like an old man with asthma, then ploughed on again with quiet insistence. Also, " +
                "you notice there is a yellow diary book placed on a round table which is next to the grandfather clock. " +
                "You decide to ...");

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/LivingRoom.jpg")));
        bgImg.imgView.setImage(img);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Open the diary book and read it");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            openDiary(window);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Return to the dining room");
        choices.choiceBtn2.setOnMouseClicked(event -> diningRoom(window));

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                  Choice 1 - Open the diary book and read it
// ******************************************************************************
    public void openDiary(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("Driven by the curiosity, you open the diary book and read it. \n" +
                "Friday, 13 March 2020 \n" +
                "This was my best time ever I had! I really enjoyed watching that girl yelling and screaming for help, meanwhile she" +
                " was suffering from pain before she died! Ahhh, my mind... I felt like I'm on the top of the world and couldn't wait anymore. " +
                "All thanks to Emily, my sister who helped me a lot to kidnap children and women to fill up my satisfaction!\n" +
                "\nAfter you read the diary, you are pretty sure that the man is actually a real psycho! You closed the diary book, and run out" +
                " quickly from the living room, but it's too late to do that.\n'So you know all my secret already? then you have no choice but to die!' " +
                " He is holding the knife and rushing towards my direction. I attempt to dodge the attack but fail to do so. He stabs my body causing you" +
                " blood loss. You start losing consciousness, and regret the choice you have made.");
        paragraph.content.setTranslateY(100);


        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText(" > Continue");
        choices.choiceBtn1.setOnMouseClicked(event -> badEnding(window));

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        root.getChildren().addAll(paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//            Story Scene 6 - Choice 1 - Open the closet's door
// ******************************************************************************
    public void openClosetDoor(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("It takes you ages to get the courage up and open the closet's door. Suddenly, a female human body fall off " +
                "from the closet and you realise that she is dead already! Because of the falling dead body sound, you can clearly hear a creaky " +
                "floor-board sound which is approaching the bedroom! Along with the panic, you decide to ... ");

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Open the bedroom's window and escape from the house");

         choices.choiceBtn1.setOnMouseClicked(event -> openWindow(window));

        // Button 2
        choices.choiceBtn2.word.setText("Hide under the bed");
        choices.choiceBtn2.setOnMouseClicked(event -> hideUnderBed(window));

        // Button 3
        choices.choiceBtn3.word.setText("Get ready to attack him");
        choices.choiceBtn3.setOnMouseClicked(event -> attackMan(window));

        root.getChildren().addAll(paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

// ******************************************************************************
//               Choice 1 - Open the bedroom's window and escape
// ******************************************************************************
    public void openWindow(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You try to open the window but unfortunately, the window is stuck. No matter you have used all" +
                " the strength of yourself, the window still can't open! Suddenly, the man is standing in front of room's door, holding " +
                "with a knife and looking at the dead body. 'What are you... Oh, so you know my secret already? then you have no choice but to die!" +
                "' Once the words are finished, he grabs the knife and rushes towards my direction. You fail to dodge his attack" +
                " and are stabbed by him. You start losing consciousness, and regret the choice you have made.");

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText(" > Continue");
        choices.choiceBtn1.setOnMouseClicked(event -> badEnding(window));

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        root.getChildren().addAll(paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                      Choice 2 - Hide under the bed
// ******************************************************************************
    public void hideUnderBed(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You try to put the dead body to the original position (inside the closet) and hide under the bed." +
                " Just as you would expect, the man comes into the bedroom. You feel so nervous as your heartbeats accelerate, and you hope" +
                " he wouldn't find your hiding spot! Luckily, he stays at the bedroom just a few minutes and later goes to another place. Now," +
                " you have to choose... ");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/HidingBed.jpg")));
        bgImg.imgView.setImage(img);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Hide for a while");
        choices.choiceBtn1.setOnMouseClicked(event -> hideForWhile(window));

        // Button 2
        choices.choiceBtn2.word.setText("Come out from under the bed");
        choices.choiceBtn2.setOnMouseClicked(event -> comeOutBed(window));

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

// ******************************************************************************
//                      Hide for a while
// ******************************************************************************
    public void hideForWhile(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You have no idea when he will come back to the bedroom, so you decide to stay under the bedroom" +
                " for a while. After a while, you are shocked because the man suddenly gets down on the ground, appears in front of you " +
                "and stares at you. 'I... found you' He laughs evilly. Things don't happen the way you expect them to, and you are stabbed" +
                " by him. You start losing consciousness, and regret the choice you have made.");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Eyes.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.setOpacity(0.8);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText(" > Continue");
        choices.choiceBtn1.setOnMouseClicked(event -> badEnding(window));

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                     Come out from under the bed
// ******************************************************************************
    public void comeOutBed(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You realise that this is a golden opportunity to escape from the house. Hence, you come out from" +
                " under the bed and try to open the window, but the window is stuck! Fortunately, you know there is a hammer located under" +
                " the bed. You pick up the hammer, break the window and escape from the house... ");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Bedroom.jpg")));
        bgImg.imgView.setImage(img);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText(" > Continue ");
        choices.choiceBtn1.setOnMouseClicked(event -> escapeFromHouse(window));

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                      Choice 3 - Attack the man
// ******************************************************************************
    public void attackMan(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You decide to take a vase and hide behind the door. After a while, the man comes into the bedroom as you " +
                "expect. When he is not looking at you, you hit his head with the vase. Then, you quickly come out from the bedroom and " +
                " rush towards the direction of main front door. As you leave the house, the moaning sound of the man can be heard clearly, " +
                "but you choose to ignore that... ");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/DoorOpen.jpg")));
        bgImg.imgView.setImage(img);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText(" > Continue");
        choices.choiceBtn1.setOnMouseClicked(event -> escapeFromHouse(window));

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//          If player choose "return to dining room"
//          OR "wait for the delicious dishes to be served",
//          the program will trigger the function below and lead to Bad ending
// ******************************************************************************
    public void diningRoom(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("'Here you go, Tuna Sandwich and Egg Mayo and Pickle Sandwich along with orange juice. Enjoy :)' The man" +
                " serves the food and drink on the dining table. When I pick the tuna sandwich and take a first bite, the lettuce and the" +
                "tomato as well as the tuna with a mild, buttery taste and no fishy smell inside the whole wheat bread is the perfect balance. " +
                "I couldn't stop eating the sandwich! \nA moment later, you drink a glass of orange juice after you have finished eating all the" +
                " sandwich. All of a sudden, you feel so tired and you are sure there must be something inside the orange juice! \n'I put a " +
                "sleeping pill inside the drink to let you have a good dream.'The man said with an evil smile. \nYou know that you have tricked " +
                "by this man, but now you can't do anything! Then, you start to lose consciousness and don't know the things happened afterwards.");
        paragraph.content.setTranslateY(130);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText(" > Continue");
        choices.choiceBtn1.setOnMouseClicked(event -> badEnding(window));

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        root.getChildren().addAll(paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                          Escape from the house
// ******************************************************************************
    public void escapeFromHouse(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("While you are running in the forest, you always think about the corpse scene occurred in the bedroom and " +
                "you couldn't forget about that as it's the first time you encounter the crime scene. Soon, you can vaguely hear the running footsteps " +
                "sound behind you in the forest! You don't know who is running behind you, but you can be sure that it's definitely the house owner! " +
                "Therefore, you think of a way to...");

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Find a place to hide");
        choices.choiceBtn1.setOnMouseClicked(event -> hideInCave(window));

        // Button 2
        choices.choiceBtn2.word.setText("Keep running");
        choices.choiceBtn2.setOnMouseClicked(event -> jumpRiver(window));

        root.getChildren().addAll(paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                          Find a place to hide
// ******************************************************************************
    public void hideInCave(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("Luckily, you found a cave which is a space large enough for a human" +
                " to enter. Therefore, you quickly enter the cave and find a place to have a rest after you have confirmed that you didn't " +
                "hear any running footsteps sound anymore. A moment later, your eyes start to close slowly and" +
                " sleep soundly. \n'Hey dude, are you alright? Why are you sleeping alone in this cave?' You are awakened by a female voice and" +
                " realise that it's morning now. You wake up immediately and ask her for a help, \n'I'm lost in the forest. Could you help me to " +
                "get out from the forest?' You said. \n'Sure, follow me. By the way, my name is Emily.'");
        paragraph.content.setTranslateY(170);

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Cave.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.55);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("> Continue");
        choices.choiceBtn1.setOnMouseClicked(event -> normalEnding(window));

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("Do not follow her");
        choices.choiceBtn3.word.setFill(Color.BLACK);
        choices.choiceBtn3.setOnMouseClicked(event -> doNotFollow(window));

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

// ******************************************************************************
//                            Keep running
// ******************************************************************************
    public void jumpRiver(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("Unfortunately, you stop running and couldn't go one step further because there is a torrent in the river which is" +
                " right in front of you. \n'Where can you run this time!' Unexpectedly, the man is standing behind you, holding a cleaver and " +
                "coming at you! Under this circumstance, you have no choice but to jump into the river. Because of the torrent in the river, " +
                "you start to lose consciousness and don't know the things happened afterwards...");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Running.jpg")));
        bgImg.imgView.setImage(img);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("> Continue");
        choices.choiceBtn1.setOnMouseClicked(event -> theEnd(window));

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                            Saved by a person
// ******************************************************************************
    public void theEnd(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("'Hello, are you awake?' Suddenly, you choke on a mouthful of water, get up and look around the unknown place. When you look at the person who" +
                " is talking to you just now, you realise that you have been saved by this teenager. \n 'Where am I now?' You ask the teenager.\n He replies, " +
                "'Here is the small forest village. Do you need some help? Seems like you haven't eaten in days.' You reply him with a head nod. \n" +
                "'Don't worry, I will bring you to my house in my village and you have a rest in there. Follow me. '");
        paragraph.content.setTranslateY(210);

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/VillageRiver.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.55);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("> Continue");
        choices.choiceBtn1.setOnMouseClicked(event -> goodEnding(window));

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

// ******************************************************************************
//                       Secret path - Do not follow her
// ******************************************************************************
    public void doNotFollow(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("After she introduces her name, there is a scene that happened in your dream, and is flashing through your mind. " +
                "The scene is about you are being stabbed by the house owner after you read a diary book in that dilapidated house. Suddenly, you remember there is a horrific word " +
                "mentioned in the diary: EMILY. You get goose bumps and feel scared of her because she will definitely bring you back to that house based on your " +
                "sudden intuition! \nTherefore, you plan to give an excuse, saying you are having a stomachache right now. Obviously, she gives you" +
                " some time to settle your personal matter. \nAfter you get out of her sight, you run as fast as you can, trying to get out of this forest." +
                "\nSoon, you can clearly see there is a road about 150ft ahead and fortunately, a vehicle is passing by on the road. You" +
                " immediately stop the car and ask the driver for help. Finally, you escape from the forest successfully.");
        paragraph.content.setTranslateY(150);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("> Continue");
        choices.choiceBtn1.setOnMouseClicked(event -> secretEnding(window));

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        root.getChildren().addAll(paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                               Bad Ending
// ******************************************************************************
    public void badEnding(Stage window){

        Scene scene;
        Pane root = new Pane();
        Text p = new Text();
        p.setText("BAD ENDING");
        p.setFont(Font.font("Impact",100));
        p.setFill(Color.WHITE);
        p.setTranslateX(300);
        p.setTranslateY(220);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Exit game");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Play again");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            UserInterface_3 ui = new UserInterface_3();
            ui.createUI(window);
        });

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));
        root.getChildren().addAll(p, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

// ******************************************************************************
//                              Normal Ending
// ******************************************************************************
    public void normalEnding(Stage window){

        Scene scene;
        Pane root = new Pane();
        Text p = new Text();
        p.setText("NORMAL ENDING");
        p.setFont(Font.font("Impact",100));
        p.setFill(Color.WHITE);
        p.setTranslateX(220);
        p.setTranslateY(220);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Exit game");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));
        root.getChildren().addAll(p, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

// ******************************************************************************
//                              Good Ending
// ******************************************************************************
    public void goodEnding(Stage window){

        Scene scene;
        Pane root = new Pane();
        Text p = new Text();
        p.setText("GOOD ENDING");
        p.setFont(Font.font("Impact",100));
        p.setFill(Color.WHITE);
        p.setTranslateX(280);
        p.setTranslateY(220);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Exit game");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));

        root.getChildren().addAll(p, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

// ******************************************************************************
//                              Secret Ending
// ******************************************************************************
    public void secretEnding(Stage window){

        Scene scene;
        Pane root = new Pane();
        Text p = new Text();
        p.setText("SECRET ENDING");
        p.setFont(Font.font("Impact",100));
        p.setFill(Color.WHITE);
        p.setTranslateX(240);
        p.setTranslateY(220);

        UserInterface_3.ChoicesContainer choices = new UserInterface_3.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Exit game");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });

        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> choices.choiceBtn2.setDisable(true));

        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> choices.choiceBtn3.setDisable(true));
        root.getChildren().addAll(p, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

}

