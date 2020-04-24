package dev.bearded.apibuscatweets.controller;

import dev.bearded.apibuscatweets.model.Tweet;
import dev.bearded.apibuscatweets.service.BuscaTweetsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import twitter4j.TwitterException;

import java.util.List;

@RestController
public class BuscaTweetController {

    private BuscaTweetsService tweetsService;

    public BuscaTweetController(BuscaTweetsService tweetsService) {
        this.tweetsService = tweetsService;
    }

    @CrossOrigin
    @GetMapping("/buscaTweets/{busca}")
    public List<Tweet> busca(@PathVariable("busca") String busca) throws TwitterException {
        if (busca == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "parametro nao informado");
        }
        return tweetsService.obterTweetsPor(busca);
    }
}
