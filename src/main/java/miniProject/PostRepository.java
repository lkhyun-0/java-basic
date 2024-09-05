package miniProject;

// 창고 관리(Model) 데이터 창고임

import java.util.ArrayList;

public class PostRepository {

    private ArrayList<Post> posts = new ArrayList<>();


    //누군가에게 Post를 넘겨받아서 창고(ArrayList)에 저장해주는 기능
    public void save(Post post) { // PostRepository에
        posts.add(post);
    }

    //자신이 가지고 있는 창고(ArrayList)의 내용물은 다른 누군가에게 전달
    public ArrayList<Post> getPosts() {
        return posts;
    }

    // 창고에서 특정 물건을 제거함
    public void delete(Post post) {
        posts.remove(post);
    }

    //키워드가 포함된 Post만 선별해서 ArrayList로 담아 필요한 누군가에게 제공
    public ArrayList<Post> getPostsByKeyword(String keyword) {
        ArrayList<Post> searchedPostList = new ArrayList<>();

        for (Post post : posts) {
            if (post.getTitle().contains(keyword)) {
                searchedPostList.add(post);
            }
        }
        return searchedPostList;
    }

    public Post findPostById(int id) { // 찾기만 해주면 됨  수정은 넘겨주고 실행
        // 만약 내가 찾고자 하는 게시물이 없다면?
        for (Post post : posts) {
            if (post.getId() == id) {
                return post; // 값을 찾고 return을 만나면 메서드는 그 즉시 종료됨
            } // 찾으면 아래로 내려갈 일이 없겠지?
        } // > 반복문을 다 뒤졌어 근데 내가 원하는 값이 안나왔어 > 그러면 비어있다 (없다)라는 값을
        return null; // null은 없다는 의미

    }
}
