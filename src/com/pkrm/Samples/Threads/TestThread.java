class RunnableDemo implements Runnable {
   private Thread t;
   private String threadName; 
   RunnableDemo( String name){
       threadName = name;
       System.out.println("Creating " +  threadName );
   }
   public void run() {
      System.out.println("Running " +  threadName );
      
      System.out.println("*** Thread id in run method*** : "+Thread.currentThread().getId());
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
     } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
     }
     System.out.println("Thread " +  threadName + " exiting.");
   }   
   public void start ()
 {

		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
   }

public class TestThread {
   public static void main(String args[]) {   
      RunnableDemo R1 = new RunnableDemo( "Thread-1");
      System.out.println("*** Thread-1 id*** : "+Thread.currentThread().getId());
      R1.start();
      System.out.println("***Thread-1 id ***: "+Thread.currentThread().getId());
      //System.out.println("Class Name: "+R1.getClass());      
      RunnableDemo R2 = new RunnableDemo( "Thread-2");
      R2.start();
   }   
}