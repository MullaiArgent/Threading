import javax.swing.*;

class MyThread extends Thread {
    @Override
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("from extended thread"+i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {

    MyThread thread1 = new MyThread();
    thread1.start();


    myframe thread2 = new myframe();
    Thread thread2runner = new Thread(thread2);
    thread2runner.start();

    thread1.join();

        for(int i = 0;i<5;i++){
            System.out.println("from main 1    "  + i);
            try {
                Thread.sleep(1000);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    Thread thread3 = new Thread(){
      @Override
      public void run(){
          for(int i = 0;i<5;i++){
              System.out.println("from Inline Class   "  + i);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  System.out.println("Error");
              }
          }
      }
    };
        thread3.run();

        Thread thread4  = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("from Inline Class   " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error");
                }
            }
        });
        thread4.run();

    }
}
