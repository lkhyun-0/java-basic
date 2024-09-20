package miniProject;

public class Post { // 기본 게시물 정보용
    private int id;
    private String title;
    private String body;
    private String createDate;
    private int hit;
    private String comment;
    private String creater;
    // 게시물에서 보여줘야 하는 정보
    // 번호, 제목, 내용, 댓글 있으면 댓글, 작성일, 조회수, 작성자 - 기능 15 기준
    // 로그인 닉네임과 add작성자가 같으면 수정 및 삭제 가능 기능 구현

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }



    public  Post(int id, String title, String body,String createDate ,String comment , int hit, String creater) {
        this.id = id;
        this.creater = creater;
        this.comment = comment;
        this.hit = hit;
        this.createDate = createDate;
        this.body = body;
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
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

