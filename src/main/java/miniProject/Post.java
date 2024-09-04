package miniProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post { // 얘는 PostBoard랑 세트임
    private int id;
    private String title;
    private String body;
    private String createDate;
    private int hit;
    private  String comment;




    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Post(int id, String title, String body, String createDate, int hit, String comment) {
        this.title = title;
        this.body = body;
        this.id = id;
        this.createDate = createDate ;
        this.hit = hit;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void increaseHit() { // 조회수가 1씩 증가하게 해주는 메서드
        this.hit++;
    }
    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
}

