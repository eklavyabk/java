
// extending Thread class
public class MyThread2 extends Thread{

    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Byeee....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

