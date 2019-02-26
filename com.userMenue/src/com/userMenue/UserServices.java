package com.userMenue;

import com.restApi.comments.Comment;
import com.restApi.comments.MyCommentsService;
import com.restApi.posts.MyPostsService;
import com.restApi.posts.Post;

import java.util.Scanner;

public class UserServices {

 private  MyPostsService myPostsService=new MyPostsService();
 private MyCommentsService myCommentsService =new MyCommentsService();
 private Post getOnePost(int id){
     Post post=new Post();
      return myPostsService.getOnePost(id);
 }

    public void printPost(){
        System.out.println("Please enter a post id :");
        Scanner userInput = new Scanner(System.in);
        int postId = userInput.nextInt();
        Post post=getOnePost(postId);
        System.out.println( "post id is :"+post.getId()+"\n" +"userId who posted :"+post.getUserId()+"\n"+
                "post title is :"+post.getTitle()+"\n"+"post body is :"+post.getBody()+"\n"          ) ;
    }

    public void printAllComments(){

        for (Comment comment: myCommentsService.getAllComments() ) {
            System.out.println( "post id is :"+comment.getPostId()+"\n" +"comment id is :"+comment.getId()+"\n"+
                    "name :"+comment.getName()+"\n"+"mail :"+comment.getEmail()+"\n" + "comment body :"+comment.getBody()+"\n"         ) ;
        }

    }

    public void printAllPosts(){

        for (Post post: myPostsService.getAllPosts()   ) {
            System.out.println( "post id is :"+post.getId()+"\n" +"userId who posted :"+post.getUserId()+"\n"+
                    "post title is :"+post.getTitle()+"\n"+"post body is :"+post.getBody()+"\n"          ) ;
        }
    }
    public void printUserPosts(){
        System.out.println("Please enter an user id:");
        Scanner userInput = new Scanner(System.in);
        int userId = userInput.nextInt();
        for (Post post: myPostsService.getUserPosts(userId)   ) {
            System.out.println( "post id is :"+post.getId()+"\n" +"userId who posted :"+post.getUserId()+"\n"+
                    "post title is :"+post.getTitle()+"\n"+"post body is :"+post.getBody()+"\n"          ) ;
        }

    }
    public void printPostComments(){
        System.out.println("Please enter a post id:");
        Scanner userInput = new Scanner(System.in);
        int postId = userInput.nextInt();
        for (Comment comment: myCommentsService.getPostComments(postId)   ) {
            System.out.println( "post id is :"+comment.getPostId()+"\n" +"comment id is :"+comment.getId()+"\n"+
                    "name :"+comment.getName()+"\n"+"mail :"+comment.getEmail()+"\n" + "comment body :"+comment.getBody()+"\n"         ) ;
        }

    }

}
