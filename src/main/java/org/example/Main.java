package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Design design1 = new Design(1, "Design1");

        VotingRunnable design1Voting = new VotingRunnable(design1);
        CountingRunnable design1Counting = new CountingRunnable(design1);

        Thread design1VotingThread = new Thread(design1Voting);
        Thread design1CountingThread = new Thread(design1Counting);

        design1VotingThread.start();
        design1CountingThread.start();

        Design design2 = new Design(2, "Design2");

        VotingRunnable design2Voting = new VotingRunnable(design2);
        CountingRunnable design2Counting = new CountingRunnable(design2);
        Thread design2VotingThread = new Thread(design2Voting);
        Thread design2CountingThread = new Thread(design2Counting);

        design2VotingThread.start();
        design2CountingThread.start();

        Design design3 = new Design(3, "Design3");

        VotingRunnable design3Voting = new VotingRunnable(design3);
        CountingRunnable design3Counting = new CountingRunnable(design3);

        Thread design3VotingThread = new Thread(design3Voting);
        Thread design3CountingThread = new Thread(design3Counting);

        design3VotingThread.start();
        design3CountingThread.start();

        Thread.sleep(30000);

        design1Voting.doStop = true;
        design1Counting.doStop = true;

        design2Voting.doStop = true;
        design2Counting.doStop = true;

        design3Voting.doStop = true;
        design3Counting.doStop = true;

        System.out.println("Voting has stopped for design " + design1.getName());
        System.out.println("Total votes for " + design1.getName() + ": " + design1.getVotes().size());
        System.out.println("Voting has stopped for design " + design2.getName());
        System.out.println("Total votes for " + design2.getName() + ": " + design2.getVotes().size());
        System.out.println("Voting has stopped for design " + design3.getName());
        System.out.println("Total votes for " + design3.getName() + ": " + design3.getVotes().size());
    }
}