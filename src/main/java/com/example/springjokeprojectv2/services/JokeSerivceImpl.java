package com.example.springjokeprojectv2.services;

import com.example.springjokeprojectv2.models.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeSerivceImpl implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeSerivceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    //Generating a joke from a class predefine into our program
    @Override
    public Joke getJoke() {
        return new Joke(this.chuckNorrisQuotes.getRandomQuote());
    }
}
