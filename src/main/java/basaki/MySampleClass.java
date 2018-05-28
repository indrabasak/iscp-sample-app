package basaki;

public class MySampleClass {

    private int count;

    public void execute() {
        System.out.println("MySampleClass transaction start.");
        doSomething();
        getCount();
        System.out.println("MySampleClass transaction end.");
    }

    private void doSomething() {
        System.out.println("doSomething - start");
        MyApp.sleep(1);
        System.out.println("doSomething - end");
    }

    private int getCount() {
        System.out.println("getCount - start");
        count++;
        MyApp.sleep(1);
        System.out.println("getCount - end");
        return count;
    }
}
