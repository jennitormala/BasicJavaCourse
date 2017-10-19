package com.omisoft.aatanasov.javacourse.introinjava.task6;

public class Test {
    public static void main(String[] args) {
        Summarizer summarizer = new Summarizer();
        String sum = summarizer.summarizeNumberStrings("1", "10999");
        System.out.println(sum);

    }
}
