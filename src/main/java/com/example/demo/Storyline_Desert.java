package com.example.demo;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Objects;

public class Storyline_Desert extends UserInterface_1 {

    UserInterface_1.StoryText paragraph = new UserInterface_1.StoryText();
    UserInterface_1.AddImage bgImg = new UserInterface_1.AddImage();

// ******************************************************************************
//                        Story Scene 2 - Choice 1
// ******************************************************************************
    public void storyScene2Choice1(Stage window){
        Scene scene;
        Pane root = new Pane();

        // Change the story Text
        paragraph.content.setText("The dust cloud settles and the silhouette begins to form a more clear figure, " +
                "it turns out to be a demonic beast, but this one seems to be different that the ordinary demonic beast. " +
                "This demonic beast was engulfed in flames but was not bothered by it. Its magical energy is something nobody has seen before." +
                " The commander begins to rally the troops to commence an attack. You....");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Beast.png")));
        bgImg.imgView.setImage(img);

        // Change the text of buttons
        // Button 1
        UserInterface_1.ChoicesContainer choices = new UserInterface_1.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Charge forward");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            storyScene3Choice1(window);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Follow up on the charge");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            storyScene3Choice2(window);
        });

        // Button 3
        choices.choiceBtn3.word.setText("Abandon all hope and run");
        choices.choiceBtn3.setOnMouseClicked(event -> {
            storyScene3Choice3(window);
        });

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                        Story Scene 2 - Choice 2
// ******************************************************************************
    public void storyScene2Choice2(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("Before the dust settles, you quickly make a run for it. There was no way you can win against that thing. " +
                                  "You heard fighting behind you, but you kept on running. A soldier that runs away from the sight of battle " +
                                  "is no true soldier. You rethink your decision. You can still act like a soldier. You can still stay and fight. " +
                                  "The demonic beasts have started their advance into the city. You can still redeem yourself. In the end, you...");

        // Change the background image of the scene
        Image river = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Ruins.jpg")));
        bgImg.imgView.setImage(river);
        bgImg.imgView.setOpacity(0.7);

        // Change the text of buttons
        // Button 1
        UserInterface_1.ChoicesContainer choices = new UserInterface_1.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Stayed and fight");
        choices.choiceBtn1.setOnMouseClicked(event -> {
        RightStoryScene3Choice1(window);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Desert the city");
        choices.choiceBtn2.setOnMouseClicked(event -> {
        RightStoryScene3Choice2(window);
        });

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

// ******************************************************************************
//                        Second Story Scene 3 - Choice 1
// ******************************************************************************
    public void RightStoryScene3Choice1(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You decided to fight back. You return to where you came from. All you can see is" +
                                  "a mountain of burnt corpses, with a blazing demonic beast standing tall in the middle " +
                                  "of the corpses. There is a very small chance that you can kill it. You.... ");

        Image house = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Corpses.jpg")));
        bgImg.imgView.setImage(house);
        bgImg.imgView.setOpacity(0.8);

        UserInterface_1.ChoicesContainer choices = new UserInterface_1.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Run to help the civilians");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            storyScene5Choice2(window);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Charge at the demonic beast");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            storyScene5Choice1(window);
        });

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.WHITE);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                        Second Story Scene 3 - Choice 2
// ******************************************************************************
    public void RightStoryScene3Choice2(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("There was no point in redeeming yourself. The city does not need a soldier who cowers battle. You " +
                                  "plan to leave the city under the shade of the night. Before you left, you realize that the situation " +
                                  "was handled and the threat of the beasts was neutralized. This further cemented your shame. You leave " +
                                  "the city, hoping to get a chance of starting a new life.");

        UserInterface_1.ChoicesContainer choices = new UserInterface_1.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Exit game");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Play again");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            UserInterface_1 ui = new UserInterface_1();
            ui.createUI(window);
        });

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
//                   Story Scene 3 - Choice 1
// ******************************************************************************
    public void storyScene3Choice1(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("As you and the other troops charged forward and the beast, you it winding up for an attack. " +
                "It begins to accumulate fire around its mouth. Just before you were able to reach it, the beast " +
                "breathes fire out of its mouth, burning everything to a crisp. Not even the shields given to you were " +
                "able to with stand this immense heat. All you felt at the time is the pain of being burned alive. " +
                "All you can see as you fall is the beast heading towards the palace along with its brethren. You feel your " +
                "body giving up. You feel your soul leaving your body. You died.");

        UserInterface_1.ChoicesContainer choices = new UserInterface_1.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Exit game");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Play again");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            UserInterface_1 ui = new UserInterface_1();
            ui.createUI(window);
        });

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
//                    Route 1 - Story Scene 3 - Choice 2
// ******************************************************************************
    public void storyScene3Choice2(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You decided to follow up on your comrades attack instead of leading it. " +
                                  "In the blink of an eye, every single person who were in the front was burnt " +
                                  "to a crisp. The stench of burning meat pierces your nose. There was a slim "+
                                  "chance that a normal human like you could kill it. As every living soldier "+
                                  "there was stunned by what happened, you realized that the lesser demonic " +
                                  "beasts have surrounded you and your comrades while the blazing demonic " +
                                  "went ahead. Your chances have went from slim to non-existent now. But your " +
                                  "task is to buy as much time as possible to allow the citizens to evacuate. " +
                                  "Thus, you and your comrades fought not just for your lives, but also for the " +
                                  "lives of others. Everyone fought valiantly, until they were no longer able to " +
                                  "stand. You were able to take down as many as possible but in the end, you were " +
                                  "the last person to fall.");

        UserInterface_1.ChoicesContainer choices = new UserInterface_1.ChoicesContainer(window);
        choices.setTranslateY(130);
        // Button 1
        choices.choiceBtn1.word.setText("Exit game");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Play again");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            UserInterface_1 ui = new UserInterface_1();
            ui.createUI(window);
        });

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
//                    Route 1 - Story Scene 3 - Choice 3
// ******************************************************************************
    public void storyScene3Choice3(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You turned tail and ran away from the beast unnoticed. Nobody would fault you for what you did. " +
                                  "As you were running away, you heard the screams of agony coming from behind you. The screams were accompanied " +
                                  "by a pungent smell. A smell that is familiar to you and yet it somehow smelled worst. You have a vague idea of " +
                                  "what is happening behind you. You....");

        Image house = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/City.jpg")));
        bgImg.imgView.setImage(house);
        bgImg.imgView.setOpacity(0.5);

        UserInterface_1.ChoicesContainer choices = new UserInterface_1.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Turn around and look");
        choices.choiceBtn1.setOnMouseClicked(event -> {
        storyScene4Choice1(window);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Keep running");
        choices.choiceBtn2.setOnMouseClicked(event -> {
        storyScene4Choice2(window);
        });

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.GRAY);

        window.setScene(scene);
        window.show();
    }


// ******************************************************************************
//                    Route 1 - Story Scene 4 - Choice 1
// ******************************************************************************
    public void storyScene4Choice1(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You turn around and saw a sight that would haunt you for the rest of your life. " +
                                 "What you saw was your comrades being burned alive by the demonic beast. " +
                                 "You felt a plethora of emotions swelling inside you. Fear. Anger. Anguish. Regret. " +
                                 "Your mind urged to keep on running but your heart keeps telling you to stop running. " +
                                 "After a while you made your choice, you....");

        Image house = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Corpses.jpg")));
        bgImg.imgView.setImage(house);
        bgImg.imgView.setOpacity(0.55);

        UserInterface_1.ChoicesContainer choices = new UserInterface_1.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Keep on running");
        choices.choiceBtn1.setOnMouseClicked(event -> {
        storyScene5Choice2(window);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Charge at the demonic beast");
        choices.choiceBtn2.setOnMouseClicked(event -> {
        storyScene5Choice1(window);
        });

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.WHITE);

        window.setScene(scene);
        window.show();
    }




// ******************************************************************************
//                    Route 1 - Story Scene 4 - Choice 2
// ******************************************************************************
    public void storyScene4Choice2(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You decided to keep on running forward, ignoring everything happening behind you, " +
                "for you already know what you will see if you turn around, and you are not ready for the sight. " +
                "While you kept on running, your heart keeps telling you to fight back. The other beasts have begun their assault. " +
                "Your mind urged to keep on running but your heart keeps telling you to stop running. " +
                "After a while you made your choice, you....");

        Image house = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Ruins.jpg")));
        bgImg.imgView.setImage(house);
        bgImg.imgView.setOpacity(0.8);

        UserInterface_1.ChoicesContainer choices = new UserInterface_1.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Turn around and fight");
        choices.choiceBtn1.setOnMouseClicked(event -> {
        storyScene5Choice1(window);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Run away and help the citizens instead");
        choices.choiceBtn2.setOnMouseClicked(event -> {
        storyScene5Choice2(window);
        });

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.GRAY);

        window.setScene(scene);
        window.show();
    }



// ******************************************************************************
//                    Route 1 - Story Scene 5 - Choice 1
// ******************************************************************************
    public void storyScene5Choice1(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You were fully aware of the chances of surviving if you fought the demonic beasts. " +
                                  "Yet you still decided to fight the beast knowing full well of the discrepancy in " +
                                  "power. Some might say it was a foolish act. Some might say it was a brave one. You " +
                                  "leapt to towards the beast when it was unaware and was able to hit the beast's " +
                                  "vital point. The beast retaliates and strikes you in return. It was able sever your " +
                                  "left arm. Despite the injury and the heat emanating from the beast, you went in for " +
                                  "another strike, this time it hits one of the beast's eye. The beast in return pierces " +
                                  "your chest. As a last ditch effort to take down this demonic beast, you went for its head " +
                                  "and stabbed its brain. The beast fell, and so did you. But at least you were able to " +
                                  "avenge your fallen comrades. You draw your last breath with a smile on your face.");

        UserInterface_1.ChoicesContainer choices = new UserInterface_1.ChoicesContainer(window);
        choices.setTranslateY(130);
        // Button 1
        choices.choiceBtn1.word.setText("Exit game");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            System.exit(0);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Play again");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            UserInterface_1 ui = new UserInterface_1();
            ui.createUI(window);
        });

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
//                    Route 1 - Story Scene 5 - Choice 2
// ******************************************************************************
    public void storyScene5Choice2(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You thought about fighting but abandoned the idea as quickly as possible. Your comrades died " +
                                  "trying to protect the citizens. So the least you could do was not throw your life away and " +
                                  "honor their sacrifice. You quickly went to the evacuation team to help evacuate the citizens. " +
                                  "You reach the evacuation team and you gave them a report of the current situation. Despite " +
                                  "running away from the battlefield, you were not given any disciplinary actions. At least, " +
                                  " for now. The scouts later see a horde of demonic beasts approaching, with the one you. " +
                                  "encountered earlier leading the charge. This time you can't run since it will only danger the citizens. You went ahead and.....");

        paragraph.setTranslateY(-50);

        Image house = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/Assault.png")));
        bgImg.imgView.setImage(house);
        bgImg.imgView.setOpacity(0.8);

        UserInterface_1.ChoicesContainer choices = new UserInterface_1.ChoicesContainer(window);
        // Button 1
        choices.choiceBtn1.word.setText("Mount one of the wall cannons");
        choices.choiceBtn1.setOnMouseClicked(event -> {
        storyScene6Choice1(window);
       });

        // Button 2
        choices.choiceBtn2.word.setText("Picked up a weapon and head to the front lines");
        choices.choiceBtn2.setOnMouseClicked(event -> {
        storyScene6Choice2(window);
        });

        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.GRAY);

        window.setScene(scene);
        window.show();
    }



// ******************************************************************************
//                    Route 1 - Story Scene 6 - Choice 1
// ******************************************************************************
public void storyScene6Choice1(Stage window){
    Scene scene;
    Pane root = new Pane();

    paragraph.content.setText("You mount one of wall cannons that are available. You only had one objective in " +
            "mind, and that is to kill the blazing demonic beast. However, your current orders " +
            "are to fend off the beasts to allow the citizens to evacuate safely. You relentlessly " +
            "shoot down the horde of demonic beasts with your fellow comrades. The horde seems to " +
            "thin out, but unbeknownst to you, there was a another wave of enemies. This time, the " +
            "blazing demonic beast is among them. You set your sights onto the beast. You shoot " +
            "your shot but the beast was able to dodge it. You calm yourself and ready up for " +
            "another shot. You fire the cannon and hit your target. It is now injured. You immediately " +
            "load another shot and try to hit it while its staggered. You fire another round, and " +
            "this time hits its head. The blazing beast is dead. The other beasts are in disarray. " +
            "All that is left is to clean them up. You felt proud of yourself for killing the " +
            "blazing beast and avenging your fallen comrades.");

    UserInterface_1.ChoicesContainer choices = new UserInterface_1.ChoicesContainer(window);
    choices.setTranslateY(110);
    // Button 1
    choices.choiceBtn1.word.setText("GOOD ENDING");
    choices.choiceBtn1.setOnMouseClicked(event -> {
        System.exit(0);
    });

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
//                    Route 1 - Story Scene 6 - Choice 2
// ******************************************************************************
public void storyScene6Choice2(Stage window){
    Scene scene;
    Pane root = new Pane();

    paragraph.content.setText("You picked up a weapon and head for the front lines. You were to kill the wretched beast with " +
                              "your bare hands. Despite knowing the dangers of being on the front lines, you went ahead and did " +
                              "it anyways. The first wave of demonic beasts arrive, but the blazing was nowhere to be found. You " +
                              "followed the orders given to you, which to fend off the beasts to ensure the civilians evacuate " +
                              "safely. Despite fighting the beasts in close range combat, with supporting fire from the wall cannons, " +
                              "killing the beasts became much easier. The second wave arrives and you see the blazing beast. The smart " +
                              "thing to do here is to let the mounted cannons injure the beast first, then strike it when its staggered. " +
                              "And you did exactly that. You avoid the fire breath attacks from the beast and kill the others beasts " +
                              "surrounding it. One of the mounted cannons was able to hit the blazing. You took this opportunity to kill it. " +
                              "The beast has fallen. But your tasks is far from over. Demonic beasts still threaten the citizens." +
                              "You press on forward and charge at the beasts. You continue to fight, until it was all done.");

    UserInterface_1.ChoicesContainer choices = new UserInterface_1.ChoicesContainer(window);
    choices.setTranslateY(110);
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

    root.getChildren().addAll(paragraph, choices);

        // Set up a new scene
    scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }
}
