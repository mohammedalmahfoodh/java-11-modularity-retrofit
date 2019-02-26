module com.restApi.comments {
    requires okhttp3;
    requires retrofit2;
    requires converter.moshi;

     exports com.restApi.comments;
     opens com.restApi.comments;

}