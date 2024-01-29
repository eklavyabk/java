
// There are 2 ways to create Thread
// 1--By implementing Runnable interface
// 2--By extending Thread class

public class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Hiiii....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
