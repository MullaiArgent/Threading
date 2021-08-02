import javax.swing.*;
class myframe extends JFrame implements Runnable{

        @Override
        public void run() {
            for(int i = 0;i<5;i++){
                System.out.println("from Runnable" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error");
            }
        }
    }
}
