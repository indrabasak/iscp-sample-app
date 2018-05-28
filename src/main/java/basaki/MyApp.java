package basaki;

public class MyApp {

    public static void sleep(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            // do nothing
        }
    }

    public void run() {
        MySampleClass clazz = new MySampleClass();

        while (true) {
            clazz.execute();
            sleep(2);
        }
    }

    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.run();
    }
}
