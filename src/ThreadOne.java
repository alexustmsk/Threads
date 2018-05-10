public class ThreadOne extends Thread {

        @Override
        public void run()
        {
            for (int i = 0; i < 30; i++) {
                System.out.println("Name = " + Thread.currentThread().getName() + ", i = " + i);
            }
        }
}
