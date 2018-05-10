public class StartThread {
    public static void main(String[] args) {
        final ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        t1.start();
        t2.start();

        System.out.println("end of main");
    }
}
