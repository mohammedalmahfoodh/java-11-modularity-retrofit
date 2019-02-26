package com.restApi.posts;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface PostService {


    @GET("/posts")
    public Call<List<Post>> getPosts();

    @GET("/posts/{id}")
    public Call<Post> getOnePost(@Path("id") int id);

    @GET("/posts")
    public Call<List<Post>> getUserPosts(@Query("userId") int userId);



}
