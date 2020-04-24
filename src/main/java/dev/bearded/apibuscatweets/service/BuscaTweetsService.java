package dev.bearded.apibuscatweets.service;

import dev.bearded.apibuscatweets.model.Tweet;
import org.springframework.stereotype.Service;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuscaTweetsService {

    private Twitter twitter;
    private Query query;

    public BuscaTweetsService(Twitter twitter, Query query) {
        this.twitter = twitter;
        this.query = query;
    }

    public List<Tweet> obterTweetsPor(String queryBusca) throws TwitterException {

        QueryResult result = twitter.search(query.query(queryBusca));

        List<Tweet> tweetsList = result.getTweets().stream().map(status -> new Tweet(status.getUser().getName(), status.getUser().getScreenName(), status.getText(), status.getUser().getProfileImageURL())).collect(Collectors.toList());

        System.out.println("retornando " + tweetsList.size() + " resultados...");

        return tweetsList;

    }

}
