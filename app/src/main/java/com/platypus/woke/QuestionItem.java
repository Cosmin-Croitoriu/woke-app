package com.platypus.woke;

public class QuestionItem {
    private String question, answer1, answer2, answer3, correct, skip;

    public QuestionItem(String question, String answer1, String answer2, String answer3, String correct, String skip) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.correct = correct;
        this.skip = skip;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getCorrect() {
        return correct;
    }

    public String getSkip() {
        return skip;
    }
}

