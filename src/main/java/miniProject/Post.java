package miniProject;

public class Post { // 얘는 PostBoard랑 세트임
    private int id;
    private String title;
    private String body;
    String formattedNow;
    int num;
    String testTitle;

    public Post(int id, String title, String body, String formattedNow) {
        this.title = title;
        this.body = body;
        this.id = id;
        this.formattedNow = formattedNow;
    }
//    public TestData (int num, String testTitle){
//
//
//    }


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
    public String getFormattedNow() {
        return formattedNow;
    }
}

