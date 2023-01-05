public class WaitAndNotify {
    public static void main(String[] args) {
        MainClass mainClass = new MainClass();

        BlueThread blueThread = new BlueThread(mainClass);
        RedThread redThread = new RedThread(mainClass);
        GreenThread greenThread = new GreenThread(mainClass);

        blueThread.start();
        redThread.start();
        greenThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // current thread is not owner of the object's monitor, because it is not synchronized,
        // so it will throw IllegalMonitorStateException
        // to fix this, we can use synchronized block
        
        synchronized (mainClass) {
            mainClass.setSayColor("Red");
        }
        

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (mainClass) {
            mainClass.setSayColor("Green");
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while(blueThread.isAlive()) {
            synchronized (mainClass) {
                mainClass.setSayColor("Blue");
            }
        }

        while (redThread.isAlive()) {
            synchronized (mainClass) {
                mainClass.setSayColor("Red");
            }
        }

        while (greenThread.isAlive()) {
            synchronized (mainClass) {
                mainClass.setSayColor("Green");
            }
        }




        try {
            blueThread.join();
            redThread.join();
            greenThread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

 

        System.out.println("Done");
    }
}

class MainClass {
    int counter = 0;
    String sayColor = "Blue";

    void setSayColor(String sayColor) {
        this.sayColor = sayColor;
        notifyAll();
    }
    
    synchronized void sayBlue() {


        while (!sayColor.equals("Blue")) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Blue");
    }

    synchronized void sayRed() {

        while (!sayColor.equals("Red")) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Red");
    }

    synchronized void sayGreen() {

        while (!sayColor.equals("Green")) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Green");
    }
}

class BlueThread extends Thread {
    MainClass mainClass;

    BlueThread(MainClass mainClass) {
        this.mainClass = mainClass;
    }

    @Override
    public void run() {
        while(mainClass.counter < 40) {
            mainClass.sayBlue();
            mainClass.counter++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
        }
    }
}

class RedThread extends Thread {
    MainClass mainClass;

    RedThread(MainClass mainClass) {
        this.mainClass = mainClass;
    }

    @Override
    public void run() {
        while(mainClass.counter < 40) {
            mainClass.sayRed();
            mainClass.counter++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
        }
    }
}

class GreenThread extends Thread {
    MainClass mainClass;

    GreenThread(MainClass mainClass) {
        this.mainClass = mainClass;
    }

    @Override
    public void run() {
        while(mainClass.counter < 40) {
            mainClass.sayGreen();
            mainClass.counter++;    
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }       
        }
    }
}
