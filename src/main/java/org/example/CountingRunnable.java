package org.example;

public class CountingRunnable implements Runnable {
    Design design;
    protected boolean doStop = false;

    public CountingRunnable(Design design) {
        this.design = design;
    }

    @Override
    public void run() {
        while (!doStop) {
            System.out.println("Design " + design.getName() + " has " + design.getVotes().size() + " votes");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
