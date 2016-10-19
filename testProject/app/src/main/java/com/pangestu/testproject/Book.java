package com.pangestu.testproject;

/**
 * Created by ubuntu on 10/19/16.
 */
public class Book {

    String title;
    String edition;

    public Book ()
    {
        Log.d("test", "test");
    }

    public Book (String title, String edition)
    {
        this.title = title;
        this.edition = edition;
    }
}
