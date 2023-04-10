package com.example.socialmedia.controllers;

import com.example.socialmedia.entities.Post;
import com.example.socialmedia.requests.PostCreateRequest;
import com.example.socialmedia.requests.PostUpdateRequest;
import com.example.socialmedia.services.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping  // bu yapı eğer /userId eki ile gelirse sadece o usera ait tüm postları, eğer gelmezse tüm postları döner.
    public List<Post> getAllPosts(@RequestParam Optional<Long> userId) {  //@requestparam yapısı getmapping ile gelen kısmı parse edip eğer varsa optional olan kısma atar.
        return postService.getAllPosts(userId);
    }

    @GetMapping("/{postId}")
    public Post getOnePost(@PathVariable Long postId) {
        return postService.getOnePost(postId);
    }

    @PostMapping
    public Post createOnePost(@RequestBody PostCreateRequest newPostRequest) {
        return postService.createOnePost(newPostRequest);
    }

    @PutMapping("/{postId}")
    public Post updateOnePost(@PathVariable Long postId, @RequestBody PostUpdateRequest updatePost) {
        return postService.updateOnePostById(postId, updatePost);
    }

    @DeleteMapping("/{postId}")
    public void deleteOnePost(@PathVariable Long postId) {
        postService.deleteOnePostById(postId);
    }


}
