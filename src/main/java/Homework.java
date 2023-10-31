public class Homework {

    public static void main(String[] args) {
        pause(5000);
        try {
            pause2(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        delimetr(15, 0);
        System.out.println(delimetr2(12, 0));
    }

    public static int delimetr(int a, int b) {// todo with try catch
        int res = 0;
        try {
            res = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return res;
    }

    public static int delimetr2(int a, int b) { // todo without any exception
        int res = 0;
        try {
            res = a / b;
        } catch (ArithmeticException e) {

            System.out.println(e.getStackTrace());
        }

        return res;
    }

    public static void pause(long mill) { // todo with try catch and with finally
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally");
        }
    }

    public static void pause2(long mill) throws InterruptedException { // todo with throws
        Thread.sleep(5000);
    }
}

