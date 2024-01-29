


public class Main{
    public static void main(String[] args) throws InterruptedException {

         /*
             so we have created our MyThread object t1 but to start the thread we have to use start()
             and this start() is present in java.lang.Thread class.
             so in order to use this start() we have to create an object of Thread class.
         */


//        MyThread obj = new MyThread();
//        Thread t1 = new Thread(obj);
//        t1.start();



        /*
             t1.join();
             java.lang.Thread class provides the join() method
             which allows one thread to wait until another thread completes its execution
         */



//        MyThread2 t2 = new MyThread2();
//        t2.start();



        /*
            Here we havent used Thread helper class to start the MyThread2 instead we directly use the
            MyThread2 reference variable.start()
            because it already extends Thread class
            which means its parent class ie Thread class has a start()

            Note: in case of MyThread where it implements Runnable interface - it doesnt have start()
                   thats the reason we used Thread class  to use start()
         */


 //-------------------------------------------------------------------------------------------------

        /*

           Now we know that MyThread implements Runnable interface
           and its a FunctionalInterface--which means only one abstract method

           and MyThread class only purpose is to implement Runnable interface

           so what can we do here is instead of creating MyThread class ,I can use anonymous class

           ie u can create an object of interface directly with the anonymous class
           now we dont need the MyThread class

         */

//        Runnable r1 = new Runnable(){
//            public void run() {
//                for(int i=0;i<5;i++) {
//                    System.out.println("Hiiii....");
//                }
//            }
//        };
//        Thread thread =new Thread(r1);
//        thread.start();

        /*
            we can also use lambda expressions since its a Functional interface to simplify it even more
         */

//        Runnable r1 =()->{
//                for(int i=0;i<5;i++) {
//                    System.out.println("Hiiii....");
//                }
//        };
//        Thread thread =new Thread(r1);
//        thread.start();




    }
}


//https://youtu.be/tHgCt6TRrWA?si=qYSQY5Z4QgOSeeN3   explanation

// we can also use synchronized keyword indicating only one thread can access the methods
// its like, if t1 working with method t2 has to wait and vice versa
// eg: public synchronized void increment(){ }
//https://youtu.be/RH7G-N2pa8M?si=-03PYDALNH-WBsnN  synchronized explaination