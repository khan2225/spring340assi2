package com.assignment2.assi2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/joke")

public class Controller {
    @GetMapping("/joke")
    public Joke getJoke() {
        String url = "https://official-joke-api.appspot.com/random_joke";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Joke.class);
    }
}
