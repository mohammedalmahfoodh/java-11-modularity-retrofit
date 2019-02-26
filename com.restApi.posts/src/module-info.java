module com.restApi.posts {
    requires retrofit2;
    requires okhttp3;
    requires converter.moshi;

    opens com.restApi.posts;
    exports com.restApi.posts;


}