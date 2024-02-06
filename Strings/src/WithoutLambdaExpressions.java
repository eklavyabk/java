
class TaskA implements Runnable {
    private StringBuilder sb;

    public TaskA(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            sb.append("A");
        }
    }
}

class TaskB implements Runnable {
    private StringBuilder sb;

    public TaskB(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            sb.append("B");
        }
    }
}

public class WithoutLambdaExpressions {
    public static void main(String[] args) {
        // 1. make a StringBuilder instance
        StringBuilder sb = new StringBuilder();

        // 2. Create two threads that modify the same StringBuilder instance
        Thread t1 = new Thread(new TaskA(sb));
        Thread t2 = new Thread(new TaskB(sb));

        // 3. Start the threads
        t1.start();
        t2.start();

        // 4. wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5.Print the Final result
        System.out.println("Result: " + sb.length());
    }
}