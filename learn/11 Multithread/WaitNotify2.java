

public class WaitNotify2 {
    public static void main(String[] args) {
        TheNumber num = new TheNumber();

        OneInc one = new OneInc(num);
        TenInc ten = new TenInc(num);
        HundredInc hundred = new HundredInc(num);

        
        try {
            one.thrd.join();
            ten.thrd.join();
            hundred.thrd.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }




    }
}

class TheNumber {
    int value = 0;
    String incrementer = "OneInc";

    void setIncrementer(String inc) {
        incrementer = inc;
    }


    void addOne() {
        while(incrementer != "OneInc") {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        value++;
        notify();
        showValue();
    }

    void addTen() {
        while(incrementer != "TenInc") {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        value += 10;
        notify();
        showValue();
    }

    void addHundred() {
        while(incrementer != "HundredInc") {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        value += 100;
        notify();
        showValue();
    }

    void addOneSync() {
        synchronized (this) {
            value++;
            showValue();
        }
    }

    void addTenSync() {
        synchronized (this) {
            value += 10;
            showValue();
        }
    }

    void addHundredSync() {
        synchronized (this) {
            value += 100;
            showValue();
        }
    }


    void showValue() {
        System.out.println(value + " from thread " + Thread.currentThread().getName());
    }
}

class OneInc implements Runnable {
    Thread thrd;
    TheNumber num;

    OneInc(TheNumber num) {
        this.num = num;
        thrd = new Thread(this, "OneInc");
        thrd.start();
    }

    @Override
    public void run() {
        while (num.value < 1000) {
            num.addOne();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

class TenInc implements Runnable {
    Thread thrd;
    TheNumber num;

    TenInc(TheNumber num) {
        this.num = num;
        thrd = new Thread(this, "TenInc");
        thrd.start();
    }

    @Override
    public void run() {
        while (num.value < 1000) {
            num.addTen();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

class HundredInc implements Runnable {
    Thread thrd;
    TheNumber num;

    HundredInc(TheNumber num) {
        this.num = num;
        thrd = new Thread(this, "HundredInc");
        thrd.start();
    }

    @Override
    public void run() {
        while (num.value < 1000) {
            num.addHundred();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}