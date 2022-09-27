package repository;

import lombok.*;
import model.User;
import rest.Response;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserRepository {
    public List<User> userList = new ArrayList<>();

    public void create(User user) {
        userList.add(user);
        new Response(true, "User successfully created!");
    }

    public boolean existsByEmail(String email) {
        return userList.stream().anyMatch(user -> user.getEmail().equalsIgnoreCase(email));
    }
}
