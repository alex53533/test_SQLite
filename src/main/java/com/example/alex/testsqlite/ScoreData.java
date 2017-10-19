package com.example.alex.testsqlite;

import java.util.Date;

/**
 * Created by alex on 19/10/17.
 */

public class ScoreData {

    private int idScore;
    private String name;
    private int score;
    private Date when;


    public ScoreData(int idScore, String name, int score, Date when ) {
        this.setIdScore (idScore);
        this.setName (name);
        this.setScore (score);
        this.setWhen (when);
    }

    public int getIdScore() {
        return idScore;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Date getWhen() {
        return when;
    }

    public void setIdScore(int idScore) {
        this.idScore = idScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setWhen(Date when) {
        this.when = when;
    }
}
