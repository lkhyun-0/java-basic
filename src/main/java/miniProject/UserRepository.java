package miniProject;

import java.util.ArrayList;

public class UserRepository {
    ArrayList<User> users = new ArrayList<>();

    public void save (User user) {
        users.add(user);
    }
    public ArrayList<User> getUsers() {
        return users;
    }


    public String  findUser(String id, String pw) { // 찾기만 해주면 됨  수정은 넘겨주고 실행
        // 만약 내가 찾고자 하는 게시물이 없다면?
        for (User user : users) {
            if (user.getId().equals(id) && user.getPw().equals(pw)) {
                user.getNickname();
                return user.getNickname();
            }
        }
        return null;

    }

}
