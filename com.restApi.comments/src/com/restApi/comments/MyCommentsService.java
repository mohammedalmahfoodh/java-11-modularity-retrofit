package com.restApi.comments;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

import java.io.IOException;
import java.util.List;

public class MyCommentsService {

    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();


    private Retrofit getRetrofitInstance() {

        Retrofit myRetrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(MoshiConverterFactory.create())
                .client(httpClient.build())
                .build();

        return myRetrofit;
    }

    private List<Comment> getComments(Call<List<Comment>> callAsync) {

        List<Comment> comments = null;

        try {
            Response<List<Comment>> response = callAsync.execute();
            comments = response.body();
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return comments;
    }

    public List<Comment> getAllComments() {

        Retrofit myRetrofit = getRetrofitInstance();

        CommentService commentService = myRetrofit.create(CommentService.class);
        Call<List<Comment>> callAsync = commentService.getAllComments();

        return getComments(callAsync);
    }
    public List<Comment> getPostComments(int postId) {

        Retrofit myRetrofit = getRetrofitInstance();

        CommentService commentService = myRetrofit.create(CommentService.class);
        Call<List<Comment>> callAsync = commentService.getPostcomments( postId);

        return getComments(callAsync);
    }

}
