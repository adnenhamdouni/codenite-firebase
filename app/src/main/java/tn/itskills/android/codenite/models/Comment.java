package tn.itskills.android.codenite.models;

/**
 * Created by adnenhamdouni on 26/05/2016.
 */
public class Comment {

    public String uid;
    public String author;
    public String text;

    public Comment() {
    }

    public Comment(String uid, String author, String text) {
        this.uid = uid;
        this.author = author;
        this.text = text;
    }

}
