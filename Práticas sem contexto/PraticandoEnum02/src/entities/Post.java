package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static application.Main.dtf;

public class Post {

    private LocalDateTime date;
    private String title;
    private String content;
    private Integer likes;

    ArrayList<Comment> comments = new ArrayList<>();

    public Post(LocalDateTime date, String title, String content, Integer likes) {
        this.date = date;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes + "Likes ");
        sb.append(dtf.format(date) + "\n");
        sb.append(content + "\n");
        for (Comment comment : comments) {
            sb.append(comment.getText() + "\n");
        }
        return sb.toString();
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

}
