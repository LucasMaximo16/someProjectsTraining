package com.example.codinglive;

import lombok.Getter;

import java.util.List;

@Getter
public class Player{
    private List<Integer> input;


    @Override
    public String toString() {
        return input.toString();
    }
}
