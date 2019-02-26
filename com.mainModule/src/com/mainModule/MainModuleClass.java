package com.mainModule;

import com.restApi.comments.Comment;
import com.restApi.comments.MyCommentsService;
import com.restApi.posts.MyPostsService;
import com.restApi.posts.Post;
import com.userMenue.UserMenue;

import java.util.logging.Logger;

public class MainModuleClass {



    public static void main(String[] args) {

        UserMenue userMenue=new UserMenue();
        userMenue.selectUserInput();

       MyPostsService myPostsService=new MyPostsService();
     /*   MyCommentsService myCommentsService =new MyCommentsService();
        System.out.println(myPostsService.getAmessage());
        for (Post p: myPostsService.getAllPosts()   ) {
            System.out.println(p.getTitle());
       }
        LOGGER.info("emails loading...");
        for (Comment comment: myCommentsService.getAllComments()   ) {
            System.out.println(comment.getEmail());
        }*/

        System.out.println(myPostsService.getOnePost(1).getTitle());
    }

}
