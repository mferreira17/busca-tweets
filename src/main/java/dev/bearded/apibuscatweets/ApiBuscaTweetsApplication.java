package dev.bearded.apibuscatweets;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import twitter4j.Query;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

@SpringBootApplication
public class ApiBuscaTweetsApplication {

    @Value("${twitter.consumerKey}")
    private String CONSUMER_KEY;

    @Value("${twitter.consumerSecret}")
    private String CONSUMER_SECRET;

    @Value("${twitter.accessToken}")
    private String ACCESS_TOKEN;

    @Value("${twitter.tokenSecret}")
    private String TOKEN_SECRET;

    public static void main(String[] args) {
        SpringApplication.run(ApiBuscaTweetsApplication.class, args);
    }

    private Configuration configurationBuilder() {
        ConfigurationBuilder builder = new ConfigurationBuilder();
        builder.setOAuthConsumerKey(CONSUMER_KEY);
        builder.setOAuthConsumerSecret(CONSUMER_SECRET);
        builder.setOAuthAccessToken(ACCESS_TOKEN);
        builder.setOAuthAccessTokenSecret(TOKEN_SECRET);
        return builder.build();
    }

    @Bean
    public Twitter twitterInstance() {
        TwitterFactory factory = new TwitterFactory(configurationBuilder());
        return factory.getInstance();
    }

    @Bean
    public Query queryInstance() {
        Query query = new Query();
        query.lang("pt");
        query.count(100);
        return query;
    }

}
