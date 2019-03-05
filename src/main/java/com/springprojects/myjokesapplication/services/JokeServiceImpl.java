package com.springprojects.myjokesapplication.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl  implements JokeService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;
//generate a constructor param

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

//spring does not know about the constructor , therefore it will be reused in that class and
    //not going to be created with every request


    //Refractoring
    /*public JokeServiceImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }*/


    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
