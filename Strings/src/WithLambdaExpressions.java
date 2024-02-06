
/*
    whats the difference between StringBuilder and StringBuffer?
  -- StringBuilder is a non-thread-safe class i.e its not synchronized
     It is faster than StringBuffer.
     whereas StringBuffer is a thread-safe class i.e its synchronized.

    Prove me that StringBuilder is not synchronized and StringBuffer is synchronized?

 */

public class WithLambdaExpressions {
    public static void main(String[] args) {

        // here's the answer.

        // 1. make a StringBuilder instance
        StringBuilder sb = new StringBuilder();

        // 2. Create two threads that modify the same StringBuilder instance
        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                sb.append("A");
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                sb.append("B");
            }
        });

        // 3. Start the threads
        t1.start();
        t2.start();

        // 4. wait for both threads to finish
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        // 5.Print the Final result
        System.out.println("Result: "+sb.length());

        /*
            Ideally the length should be 2000 but we are not getting that.
            it means there's something wrong. its not thread safe.
         */

        //But if i keep all of the above code same , just change 1 thing i.e instead of StringBuilder
        // i'll use StringBuffer. then the output will be 2000. means its thread safe.


    }
}
