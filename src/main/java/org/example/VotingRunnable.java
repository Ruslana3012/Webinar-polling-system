package org.example;

public class VotingRunnable implements Runnable {
    Design design;
    protected boolean doStop = false;
    public VotingRunnable(Design design) {
        this.design = design;
    }

    @Override
    public void run() {
        while (!doStop) {
            System.out.println("Voting going on for design " + design.getName());
            design.getVotes().add(1L);

            Double randomNumber = Math.random() * 1000;

            try {
                Thread.sleep(randomNumber.longValue());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
