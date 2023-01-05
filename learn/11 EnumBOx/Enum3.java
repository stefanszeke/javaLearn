public class Enum3 {
    public static void main(String[] args) {
        TrafficLightSimulator simulator = new TrafficLightSimulator(TrafficLightColor.GREEN);
        Thread simulatorThread = new Thread(simulator);

        simulatorThread.start();


        for (int i = 0; i < 10; i++) {
            System.out.println(simulator.getColor());
            waitFor(100);
            simulator.waitForChange(); // this will wait until the color changes, then it will continue, the thread continue to run
            //
            //
            //
        }

        // start thread
        // sleep
        // after sleep, change color
        // set changed to true
        // notify
        // if change true, wait

        System.out.println();

        System.out.println(simulator.getColor());
        waitFor(50);
        System.out.println(simulator.getColor());

        System.out.println("change");
        simulator.waitForChange(); // the next line will not be executed until the color changes
        System.out.println(simulator.getColor());
        System.out.println(simulator.getColor());
        System.out.println(simulator.getColor());
        System.out.println(simulator.getColor());
        System.out.println(simulator.getColor());
        simulator.waitForChange();
        System.out.println(simulator.getColor());
        
        simulator.cancel();
    }

    public static void waitFor(int ms) {
        try { Thread.sleep(ms); }
        catch (InterruptedException e) { e.printStackTrace(); }
    }


}

class TrafficLightSimulator implements Runnable {
    private TrafficLightColor tlc;
    private boolean stop = false;
    private boolean changed = false;

    public TrafficLightSimulator(TrafficLightColor tlc) { this.tlc = tlc; }

    public TrafficLightSimulator() { tlc = TrafficLightColor.RED; }

    @Override
    public void run() { // sleep based on the current color; then change the color
        while(!stop) {
            try {
                switch (tlc) {
                    case GREEN:
                        Thread.sleep(1000);
                        tlc = TrafficLightColor.YELLOW;
                        break;
                    case YELLOW:
                        Thread.sleep(200);
                        tlc = TrafficLightColor.RED;
                        break;
                    case RED:
                        Thread.sleep(1200);
                        tlc = TrafficLightColor.GREEN;
                        break;
                }
            } catch (InterruptedException e) { System.out.println(e); }

            changed = true;
            // synchronize the context of the object
            synchronized (this) { notify(); }
            // changeColor();
        }
    }

    synchronized void changeColor() { // change the color and notify the waiting thread
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
        }
        changed = true;
        notify(); // can only be called from a synchronized block (context)
    }

    synchronized void waitForChange() { // wait for the color to change,
        try {
            // System.out.println("waiting");
            while(!changed) { wait(); } // can only be called from a synchronized block (context), call wait on the object that is being synchronized
            // wait will not stop the thread, it will just stop the execution of the code in the synchronized block

        
            // System.out.println("done waiting");
            changed = false;
        } catch (Exception e) { System.out.println(e); } // wait needs to be in a try/catch block5
    }

    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    synchronized void cancel() {
        stop = true;
    }

}

enum TrafficLightColor {
    RED, GREEN, YELLOW;
}