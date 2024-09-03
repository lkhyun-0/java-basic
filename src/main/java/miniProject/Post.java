package miniProject;

public class Post {
    private int id;
    private String title;
    private String detail;

    public Post(int id, String title, String detail) {
        this.title = title;
        this.detail = detail;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

