package com.example.demo;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Objects;

public class Storyline_Apocalypse extends UserInterface_4 {

    StartingStory paragraph = new StartingStory();
    UserInterface_4.AddImage bgImg = new UserInterface_4.AddImage();
//----------------------------------------------------------------------------------------------------------------------

    public void startingStory(Stage window){
        Scene scene;
        Pane root = new Pane();

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/env_1.jpg")));
        bgImg.imgView.setImage(img);

        paragraph.content.setText("It's the year 2179, a chaotic and apocalyptic world.\n" +
                "Umbrella Corp. invented a new virus that can be used as a bio weapon against their enemies. This bio-weapon turns ordinary human into a mindless, berserk, bloodthirsty creature who has one objective, attack other human and devour their body, making it a cannibal.\n" +
                "It's been 6 months after the outbreak of the virus, You have survived so far by relying on your intuition and luck.\n" +
                "It's a new day to survive, what will you do?");

        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Go West");
        choices.choiceBtn1.setOnMouseClicked(event -> {
                storyScene2West_Hospital(window, 0);
            });
        choices.choiceBtn2.word.setText("Go North");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            storyScene2North(window);
        });
        choices.choiceBtn3.word.setText("Go East");
        choices.choiceBtn3.setOnMouseClicked(event -> {
            //
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
//                        Story Scene 2 - West
// ******************************************************************************
    public void storyScene2West_Hospital(Stage window, int b){
        Scene scene;
        Pane root = new Pane();

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/hospital.jpg")));
        bgImg.imgView.setImage(img);

        if(b == 1){
            paragraph.content.setText("You found some medical supplies and alcohol");

            // Change the text of buttons
            // Button 1
            UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
            choices.choiceBtn1.word.setText("Continue Exploring");
            choices.choiceBtn1.setOnMouseClicked(event -> {
                storyScene3West_Fight(window);
            });
            choices.choiceBtn2.word.setText("");
            choices.choiceBtn2.setOnMouseClicked(event -> {
                storyScene2West_Hospital(window, 1);
            });
            choices.choiceBtn3.word.setText("");
            choices.choiceBtn3.setOnMouseClicked(event -> {
                storyScene2West_Hospital(window, 1);
            });
            // Add all the elements into the scene
            root.getChildren().addAll(bgImg, paragraph, choices);
        }
        else{
            // Change the story Text
            paragraph.content.setText("You found an abandoned hospital, maybe there are medical supplies inside.");

            // Change the text of buttons
            // Button 1
            UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
            choices.choiceBtn1.word.setText("Explore the area");
            choices.choiceBtn1.setOnMouseClicked(event -> {
                storyScene2West_Hospital(window, 1);
            });

            choices.choiceBtn2.word.setText("Shout for Survivors");
            choices.choiceBtn2.setOnMouseClicked(event -> {
                bad_end(window, 1);
            });

            choices.choiceBtn3.word.setText("Go Back");
            choices.choiceBtn3.setOnMouseClicked(event -> {
                startingStory(window);
            });
            // Add all the elements into the scene
            root.getChildren().addAll(bgImg, paragraph, choices);
        }

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

    //# ******************************************************************************
//                   Story Scene 4 - West
// ******************************************************************************
    public void storyScene3West_Fight(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You Encounter a cannibal!!!");

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/fight1.jpg")));
        bgImg.imgView.setImage(img);

        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Fight");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            storyScene4West_Wounded(window);
        });
        // Button 2
        choices.choiceBtn2.word.setText("Run");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            storyScene2East_Bandit(window);
        });
        // Bad end
        choices.choiceBtn3.word.setText("Use Alcohol as molotov to distract the Cannibal");
        choices.choiceBtn3.setOnMouseClicked(event -> {
            bad_end(window, 3);
        });

        root.getChildren().addAll(bgImg, paragraph, choices);
        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }
    //# ******************************************************************************
//                   Story Scene 5 - West
// ******************************************************************************
    public void storyScene4West_Wounded(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("After a rough fight, you finally emerged victorious but at the cost of stamina & several wound.\n"+
                "You found a place to recuperate...\n"+"After a while, you seem able to continue your journey despite several wound.\n"+
                "But these wound won't hold me back.");

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/wounded.jpg")));
        bgImg.imgView.setImage(img);

        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Leave Hospital & Continue Journey");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            storyScene5West_Survivors(window, 0);
        });
        // Button 2
        choices.choiceBtn2.word.setText("Rest again for a while");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            bad_end(window, 4);
        });
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> {
            storyScene4West_Wounded(window);
        });

        root.getChildren().addAll(bgImg, paragraph, choices);
        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }
    //# ******************************************************************************
//                   Story Scene 6 - West
// ******************************************************************************
    public void storyScene5West_Survivors(Stage window, int b){
        Scene scene;
        Pane root = new Pane();

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/survivors.jpg")));
        bgImg.imgView.setImage(img);

        if(b == 1){
            Image img1 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/blackBG.jpg")));
            bgImg.imgView.setImage(img1);

            paragraph.content.setText("You choose to go solo and they respected your decision.\n" +
                    "In the current state of world you thought you should not trust anyone, you only have yourself to trust.\n" +
                    "You choose to continue your journey solo.");
            // Button 1
            UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
            choices.choiceBtn1.word.setText("Continue");
            choices.choiceBtn1.setOnMouseClicked(event -> {
                storyScene2East_Bandit(window);
            });

            // Add all the elements into the scene
            root.getChildren().addAll(bgImg, paragraph, choices);
        }
        else{
            paragraph.content.setText("You left the Hospital after finished scavenging the area.\n Then you found a what seems to be a man-made base.\n " +
                    "You knocked the door and greet politely...\nYou finally hear a response after searching for survivors for 6 months.\n" +
                    "After answering a set of questions, you were let in and there stands 4 survivors.\n" +
                    "They noticed your wounds and immediately asks you for cooperation.\n They seem to realize you are one of the immune.");

            // Change the text of buttons
            // Button 1
            UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
            choices.choiceBtn1.word.setText("Cooperate");
            choices.choiceBtn1.setOnMouseClicked(event -> {
                storyScene5West_Alt(window);
            });
            // Button 2
            choices.choiceBtn2.word.setText("Go Solo");
            choices.choiceBtn2.setOnMouseClicked(event -> {
                storyScene5West_Survivors(window, 1);
            });

            choices.choiceBtn3.word.setText("");
            choices.choiceBtn3.setOnMouseClicked(event -> {
                storyScene5West_Survivors(window, 0);
            });

            root.getChildren().addAll(bgImg, paragraph, choices);
        }
        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

    public void storyScene5West_Alt(Stage window){
        Scene scene;
        Pane root = new Pane();

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/survivors.jpg")));
        bgImg.imgView.setImage(img);

        paragraph.content.setText("You choose to Cooperate with them because they seem trustworthy.\n" +
                "Shortly after, you were informed by them that there are a military base for survivors if we keep going West.\n" +
                "Especially since we are immune, we will be given special privileges.\n" +
                "You nodded as you agree with their idea to keep going West.");
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Continue Journey");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            storyScene6West_Road(window);
        });
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            storyScene5West_Alt(window);
        });
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> {
            storyScene5West_Alt(window);
        });

        root.getChildren().addAll(bgImg, paragraph, choices);

        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

    //# ******************************************************************************
//                   Story Scene 8 - West
// ******************************************************************************
    public void storyScene6West_Road(Stage window){
        Scene scene;
        Pane root = new Pane();

        // Change the story Text
        paragraph.content.setText("After a journey walking toward the military base, you felt you've bonded with the survivors.\n" +
                "You've realize they are good people trying to survive like you.\n" +
                "In your journey with them, you scavenge and fight cannibals strategically as a team increasing your odds of survival.\n" +
                "Just a few more kilometers and you will reach the military base according to map.");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/road.jpg")));
        bgImg.imgView.setImage(img);

        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Continue Journey");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            storyScene7West_Mutated(window, 0);
        });
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            storyScene6West_Road(window);
        });
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> {
            storyScene6West_Road(window);
        });

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

    //# ******************************************************************************
//                   Story Scene 9 - West
// ******************************************************************************
    public void storyScene7West_Mutated(Stage window, int b){
        Scene scene;
        Pane root = new Pane();

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/mutated.jpg")));
        bgImg.imgView.setImage(img);

        if(b == 1){
            // Change the story Text
            paragraph.content.setText("After you tossed your molotov, the Mutated Infected seem to suffer thoroughly as it flee the scene.\n" +
                    "Fortunately there are no cannibal near you because the molotov attract attention.\n" +
                    "Your team seems okay and applaud you for your quick thinking & wits.\n" +
                    "You waste no time to continue your journey.");

            // Change the text of buttons
            // Button 1
            UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
            choices.choiceBtn1.word.setText("Continue Journey");
            choices.choiceBtn1.setOnMouseClicked(event -> {
                storyScene8West_End(window);
            });
            choices.choiceBtn2.word.setText("");
            choices.choiceBtn2.setOnMouseClicked(event -> {
                storyScene7West_Mutated(window, 1);
            });
            choices.choiceBtn3.word.setText("");
            choices.choiceBtn3.setOnMouseClicked(event -> {
                storyScene7West_Mutated(window, 1);
            });

            // Add all the elements into the scene
            root.getChildren().addAll(bgImg, paragraph, choices);
        }
        else{
            // Change the story Text
            paragraph.content.setText("After a while, you encounter a mutated type of Cannibal, it is big and more ferocious than other Cannibal.\n" +
                    "By the time you snap out of fear the other survivors froze in place except you.\n" +
                    "You decided to take matters into your own hand.");

            // Change the text of buttons
            // Button 1
            UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
            choices.choiceBtn1.word.setText("Encourage everyone to work as a team");
            choices.choiceBtn1.setOnMouseClicked(event -> {
                bad_end(window, 5);
            });
            // Button 2
            choices.choiceBtn2.word.setText("Use your Molotov to distract the Cannibal");
            choices.choiceBtn2.setOnMouseClicked(event -> {
                storyScene7West_Mutated(window, 1);
            });
            // Button 3
            choices.choiceBtn3.word.setText("Sacrifice Yourself");
            choices.choiceBtn3.setOnMouseClicked(event -> {
                bad_end(window, 6);
            });

            // Add all the elements into the scene
            root.getChildren().addAll(bgImg, paragraph, choices);
        }

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

    //# ******************************************************************************
//                   Story Scene 9 - West
// ******************************************************************************
    public void storyScene8West_End(Stage window){
        Scene scene;
        Pane root = new Pane();

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/base.jpg")));
        bgImg.imgView.setImage(img);

        // Change the story Text
        paragraph.content.setText("You finally arrived at the military base, it is filled with survivors and your team and you felt relieved.\n" +
                "After a long time of surviving you finally reach your destination, you are filled with determination.\n" +
                "You are greeted by the soldier and noticed despite your injuries you didn't get infected.\n" +
                "He immediately relocate you to the research facility and introduce you to the head Scientist.\n" +
                "The scientist was shocked because this is the first time he's seeing this.");

        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Finish Journey");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            good_end(window);
        });
        choices.choiceBtn2.word.setText("Finish Journey");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            good_end(window);
        });
        choices.choiceBtn3.word.setText("Finish Journey");
        choices.choiceBtn3.setOnMouseClicked(event -> {
            good_end(window);
        });

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

//----------------------------------------------------------------------------------------------------------------------

    // ******************************************************************************
//                        Story Scene 2 - North
// **********************************************************************************
    public void storyScene2North(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You found an abandoned school, it seems to be filled with cannibals inside");

        // Change the background image of the scene
        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/school.jpeg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.7);

        // Change the text of buttons

        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Risk it and Go in");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            bad_end(window, 2);
        });

        // Button 2
        choices.choiceBtn2.word.setText("Go Back");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            startingStory(window);
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
//                        Story Scene 2 - East
// ******************************************************************************
    public void storyScene2East_Bandit(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You encounter a group of bandits and outlaw.\n" +
                "You seem defenseless against a whole number of enemies without proper equipment to fight back.\n" +
                "They ask you to leave your supplies and they will spare your life.");

        // Change the background image of the scene
        Image img= new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/bandit.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.7);

        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Fight");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            bad_end(window, 7);
        });
        // Button 2
        choices.choiceBtn2.word.setText("Persuade to join them");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            storyScene3East_preGenocide(window);
        });
        // Button 3
        choices.choiceBtn3.word.setText("Leave your supplies and walk away");
        choices.choiceBtn3.setOnMouseClicked(event -> {
            bad_end(window, 8);
        });

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

    public void storyScene3East_preGenocide(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("You've successfully persuaded them and they agreed to let you join them.\n\n" +
                "After a while your mentality has become like them, ruthless, evil & arrogant as you follow their command.\n" +
                "There were no traces of the former you.\n");

        // Change the background image of the scene
        Image img= new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/banditGroup.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.7);

        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Continue");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            storyScene3East_Genocide(window);
        });
        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            storyScene3East_preGenocide(window);
        });
        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> {
            storyScene3East_preGenocide(window);
        });

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }
    public void storyScene3East_Genocide(Stage window){
        Scene scene;
        Pane root = new Pane();

        paragraph.content.setText("In a matter of time, you've climbed through the ranks and become a overlord to the bandit group.\n" +
                "Spreading genocide all around with your group and eventually you become mad with power.\n" +
                "You are respected by the bandit group, but at what cost?");

        // Change the background image of the scene
        Image img= new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/slaughter.jpg")));
        bgImg.imgView.setImage(img);
        bgImg.imgView.setOpacity(0.7);

        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Continue");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            worst_end(window);
        });
        // Button 2
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            storyScene3East_Genocide(window);
        });
        // Button 3
        choices.choiceBtn3.word.setText("");
        choices.choiceBtn3.setOnMouseClicked(event -> {
            storyScene3East_Genocide(window);
        });

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

    // Good Ending //
    public void good_end(Stage window){
        Scene scene;
        Pane root = new Pane();

        AudioClip audio = new AudioClip(getClass().getResource("audio/good_end.mp3").toExternalForm());
        audio.setCycleCount(AudioClip.INDEFINITE);
        audio.play();

        // Change the story Text
        paragraph.content.setText("Maybe there is hope after all for this god-forsaken world...");

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/good_end.jpg")));
        bgImg.imgView.setImage(img);

        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);

        choices.choiceBtn1.word.setText("");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            audio.stop();
            good_end(window);
        });
        choices.choiceBtn2.word.setText("");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            audio.stop();
            good_end(window);
        });
        choices.choiceBtn3.word.setText("The End");
        choices.choiceBtn3.setOnMouseClicked(event -> {
            audio.stop();
            Start_Screen start_screen = new Start_Screen();
            try {
                start_screen.start(window);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

    // Bad ending //
    public void bad_end(Stage window, int a){
        Scene scene;
        Pane root = new Pane();

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/died.gif")));
        bgImg.imgView.setImage(img);

        AudioClip audio = new AudioClip(getClass().getResource("audio/died.mp3").toExternalForm());

        if(a == 1){
            audio.play();
            paragraph.content.setText("Your Shout attracts other Cannibals in the area and you are immediately surrounded.\n" +
                    "Overpowered by numbers, you died by the hand of the cannibals.");
        }
        if(a == 2){
            audio.play();
            paragraph.content.setText("You're immediately surrounded by Cannibals with no hope of escaping.\n");
        }
        if(a == 3){
            audio.play();
            paragraph.content.setText("The molotov you thrown unexpectedly attract other near cannibals to your location.\n" +
                    "You are surrounded with no hope of surviving.");
        }
        if(a == 4){
            audio.play();
            paragraph.content.setText("You tried to rest again to recover your stamina to the maximum.\n" +
                    "You are woken up by a loud noise, it seems to be a march of cannibals headed your way.\n" +
                    "You tried to escape but it's too late...\n\n" +
                    "'Should've flee when I had the chance...'\n\n" +
                    "You thought to yourself.");
        }
        if(a == 5){
            audio.play();
            paragraph.content.setText("You choose to fight together but your team spirit has been broken and they're killed one by one " +
                    "by the overwhelming strength of the mutated cannibal.\n" +
                    "and eventually you're killed as well.");
        }
        if(a == 6){
            audio.play();
            paragraph.content.setText("You choose to sacrifice yourself to let the others run away, your sacrifice will always be remembered.\n" +
                    "The other escaped successfully thanks to your sacrifice.");
        }
        if(a == 7){
            audio.play();
            paragraph.content.setText("You decide to fight the bandit group since you don't want to become like him, better as well die fighting.\n" +
                    "You are overwhelmed by their numbers, but you don't have any regrets...");
        }
        if(a == 8){
            audio.play();
            paragraph.content.setText("You left all your supplies, and calmly walk away.\n" +
                    "You realize no supplies means death, but keep hoping you found some survivors to help you.\n" +
                    "You eventually died in the hand of the cannibal with no stamina, food, and equipment while you wander in the wasteland.");
        }

        // Try Again
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);
        choices.choiceBtn1.word.setText("Try Again?");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            Start_Screen start_screen = new Start_Screen();
            try {
                audio.stop();
                start_screen.start(window);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        choices.choiceBtn2.word.setText("Try Again?");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            Start_Screen start_screen = new Start_Screen();
            try {
                audio.stop();
                start_screen.start(window);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        choices.choiceBtn3.word.setText("Try Again?");
        choices.choiceBtn3.setOnMouseClicked(event -> {
            Start_Screen start_screen = new Start_Screen();
            try {
                audio.stop();
                start_screen.start(window);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        root.getChildren().addAll(bgImg, paragraph, choices);
        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }

    // Worst ending //
    public void worst_end(Stage window){
        Scene scene;
        Pane root = new Pane();

        AudioClip audio = new AudioClip(getClass().getResource("audio/genocide1.mp3").toExternalForm());
        audio.setCycleCount(AudioClip.INDEFINITE);
        audio.setVolume(0.3);
        audio.play();

        // Change the story Text
        paragraph.content.setText("You became mad with power and eventually killed by the military when you're doing your raids.");

        Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/genocide.jpg")));
        bgImg.imgView.setImage(img);

        // Change the text of buttons
        // Button 1
        UserInterface_4.ChoicesContainer choices = new UserInterface_4.ChoicesContainer(window);

        choices.choiceBtn1.word.setText("Try Again?");
        choices.choiceBtn1.setOnMouseClicked(event -> {
            Start_Screen start_screen = new Start_Screen();
            try {
                audio.stop();
                start_screen.start(window);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        choices.choiceBtn2.word.setText("Try Again?");
        choices.choiceBtn2.setOnMouseClicked(event -> {
            Start_Screen start_screen = new Start_Screen();
            try {
                audio.stop();
                start_screen.start(window);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        choices.choiceBtn3.word.setText("Try Again?");
        choices.choiceBtn3.setOnMouseClicked(event -> {
            Start_Screen start_screen = new Start_Screen();
            try {
                audio.stop();
                start_screen.start(window);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Add all the elements into the scene
        root.getChildren().addAll(bgImg, paragraph, choices);

        // Set up a new scene
        scene = new Scene(root, 1080,720);
        scene.setFill(Color.BLACK);

        window.setScene(scene);
        window.show();
    }
}

