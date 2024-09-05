package miniProject;

 // 창고 관리(Model) 데이터 창고임

import java.util.ArrayList;

public class PostRepository {

    private ArrayList<Post> posts = new ArrayList<>();


    //누군가에게 Post를 넘겨받아서 창고(ArrayList)에 저장해주는 기능
    public void save(Post post) { // PostRepository에
        posts.add(post);
    }

    //자신이 가지고 있는 창고의 내용물은 다른 누군가에게 전달
    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void delete(Post post) {
        posts.remove(post);
    }



}
