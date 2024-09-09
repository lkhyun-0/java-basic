package miniProject;

import java.util.ArrayList;
import java.util.Scanner;
// 출력 관련된 것들은 뷰의 역할을 한다
// 보여주는
public class PostView {


    public void printPostList(ArrayList<Post> targetList) {
        System.out.println("==================");
        for (Post post : targetList) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.println("작성자 : hong");
            System.out.println("==================");
        }
    }
    public void printPostDetail(Post post) {
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("내용 : %s\n", post.getBody());
        System.out.printf("등록날짜 : %s\n", post.getCreateDate());
        System.out.printf("조회수 : %d\n", post.getHit());
//        System.out.printf("작성자 : %s\n", post.getCreater());
    }
    public void printCommet(Post post){
        System.out.println("===========================");
        System.out.println("===========댓글=============");
        System.out.println("댓글내용 : " + post.getComment());
        System.out.printf("작성일 : %s\n", post.getCreateDate());
    }

}
