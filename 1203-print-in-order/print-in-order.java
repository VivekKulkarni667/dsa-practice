class Foo {

    private final Object lock = new Object();

    private int turn = 1;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        synchronized (lock) {

            printFirst.run();

            turn = 2;

            lock.notifyAll();

        }

    }

    public void second(Runnable printSecond) throws InterruptedException {

        synchronized (lock) {

            while (turn != 2) {

                lock.wait();

            }

            printSecond.run();

            turn = 3;

            lock.notifyAll();

        }

    }

    public void third(Runnable printThird) throws InterruptedException {

        synchronized (lock) {

            while (turn != 3) {

                lock.wait();

            }

            printThird.run();

        }

    }

}