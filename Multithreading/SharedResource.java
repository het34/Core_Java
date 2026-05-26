package Multithreading;

class SharedResource {

    synchronized void waitMethod() {

        try {

            System.out.println("Waiting...");

            wait();

            System.out.println("Resumed");

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    synchronized void notifyMethod() {

        System.out.println("Notifying...");

        notify();
    }
}

class ThreadA extends Thread {

    SharedResource sr;

    ThreadA(SharedResource sr) {

        this.sr = sr;
    }

    public void run() {

        sr.waitMethod();
    }
}

class ThreadB extends Thread {

    SharedResource sr;

    ThreadB(SharedResource sr) {

        this.sr = sr;
    }

    public void run() {

        try {

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println(e);
        }

        sr.notifyMethod();
    }
}

class InterThreadDemo {

    public static void main(String[] args) {

        SharedResource sr = new SharedResource();

        ThreadA t1 = new ThreadA(sr);

        ThreadB t2 = new ThreadB(sr);

        t1.start();

        t2.start();
    }
}