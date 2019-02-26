package com.restApi.posts;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import retrofit2.converter.moshi.MoshiConverterFactory;

import java.io.IOException;
import java.util.List;

public class MyPostsService {
    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();


    public Retrofit getRetrofitInstance() {

        Retrofit myRetrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(MoshiConverterFactory.create())
                .client(httpClient.build())
                .build();

        return myRetrofit;
    }

    public List<Post> getPosts(Call<List<Post>> callAsync) {

        List<Post> posts = null;

        try {
            Response<List<Post>> response = callAsync.execute();
            posts = response.body();
        } catch (IOException e) {
            e.printStackTrace();       }


        return posts;
    }


    public List<Post> getAllPosts() {

        Retrofit myRetrofit = getRetrofitInstance();

        PostService postService = myRetrofit.create(PostService.class);
        Call<List<Post>> callAsync = postService.getPosts();

        return getPosts(callAsync);
    }

   public List<Post> getUserPosts(int userId) {

        Retrofit myUserRetrofit = getRetrofitInstance();

        PostService postService = myUserRetrofit.create(PostService.class);
        Call<List<Post>> callAsync = postService.getUserPosts(userId);

        return getPosts(callAsync);
    }

    public Post getOnePost(int id) {
        Post post = null;
        Retrofit postRetrofit = getRetrofitInstance();

        PostService postService = postRetrofit.create(PostService.class);
        Call<Post> callAsync = postService.getOnePost(id);

        try {

            Response<Post> response = callAsync.execute();
            post = response.body();
        } catch (IOException e) {
            System.out.println("something wrong went out..");
            e.printStackTrace();       }



        return post;
    }
}
