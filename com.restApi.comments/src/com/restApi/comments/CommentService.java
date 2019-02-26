package com.restApi.comments;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface CommentService {


    @GET("/comments")
    public Call<List<Comment>> getAllComments();
    @GET("/comments")
    public Call<List<Comment>> getPostcomments(@Query("postId") int postId);



}
