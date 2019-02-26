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


    }

}
