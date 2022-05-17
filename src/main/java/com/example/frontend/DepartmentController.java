package com.example.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/myapp")
public class DepartmentController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/countries")
    public String getCountries(Model model){
        String url = "https://jsonplaceholder.typicode.com/posts";
        Post[] post = restTemplate.getForObject(url, Post[].class);

        System.out.println(post);
        List <String> titlar = Arrays.stream(post).map(Post::getTitle).toList();
        System.out.println(titlar);

        String giveMeText = titlar.get(0);

        model.addAttribute("title", giveMeText);
        return "index";
    }
}
