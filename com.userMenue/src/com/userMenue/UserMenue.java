package com.userMenue;

import java.util.Scanner;
import java.util.logging.Logger;

public class UserMenue {

    UserServices userServices=new UserServices();

    public void showInfo (String message){
        final Logger LOGGER = Logger.getLogger(UserMenue.class.getName());
        LOGGER.info(message);
    }

    private void useroptions(String message){
        showInfo(message);
      System.out.println("*********************************************\n" +
              "Please choose one of the following useroptions: ");
      String messageOptions="1- get a post by id \n" +
              "2- display all posts \n" +
              "3-display all comments\n" +"4-display posts for a specific user\n"+
              "5-display all comments for one post \n"+
              "6-exit\n" +
              "********************************************* \n";
        System.out.println(messageOptions);

    }


    public void selectUserInput(){
        useroptions("Running java 11 application (with modularity and consuming restFull api features)...");
      while (true){

          Scanner userInput = new Scanner(System.in);
          int optionChoosed = userInput.nextInt();

          switch (optionChoosed) {
              case 1: userServices.printPost();
                  break;
              case 2:userServices.printAllPosts();
                  break;
              case 3:userServices.printAllComments();
                  break;
              case 4:userServices.printUserPosts();
                  break;
              case 5:userServices.printPostComments();
                  break;
              case 6:System.exit(0);
                  break;
              default: System.exit(0);
                  break;
          }

          useroptions("Please choose again other wise enter 4 for exiting the app ......");
      }




    }





}
