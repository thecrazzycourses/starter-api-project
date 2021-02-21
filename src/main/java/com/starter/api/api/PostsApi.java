package com.starter.api.api;

import com.starter.api.entity.Post;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/v1/posts")
public class PostsApi {

    @GetMapping
    public List<Post> getAll() {

        List<Post> posts = new ArrayList<>();

        posts.add(Post.builder().userId(1).id(1).title("sunt aut facere repellat provident occaecati excepturi optio reprehenderit").body("quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto").build());
        posts.add(Post.builder().userId(1).id(2).title("qui est esse").body("est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla").build());
        posts.add(Post.builder().userId(1).id(3).title("ea molestias quasi exercitationem repellat qui ipsa sit aut").body("et iusto sed quo iure\\nvoluptatem occaecati omnis eligendi aut ad\\nvoluptatem doloribus vel accusantium quis pariatur\\nmolestiae porro eius odio et labore et velit aut").build());
        posts.add(Post.builder().userId(1).id(4).title("eum et est occaecati").body("ullam et saepe reiciendis voluptatem adipisci\\nsit amet autem assumenda provident rerum culpa\\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\\nquis sunt voluptatem rerum illo velit").build());
        posts.add(Post.builder().userId(1).id(5).title("nesciunt quas odio").body("repudiandae veniam quaerat sunt sed\\nalias aut fugiat sit autem sed est\\nvoluptatem omnis possimus esse voluptatibus quis\\nest aut tenetur dolor neque").build());

        return posts;
    }
}
