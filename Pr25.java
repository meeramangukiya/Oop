class TablePrinter {
    synchronized void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class MyThread extends Thread {
    TablePrinter printer;
    int number;

    MyThread(TablePrinter printer, int number) {
        this.printer = printer;
        this.number = number;
    }

    public void run() {
        printer.printTable(number);
    }
}

public class SyncTableExample {
    public static void main(String[] args) {
        TablePrinter printer = new TablePrinter();

        MyThread t1 = new MyThread(printer, 5);
        MyThread t2 = new MyThread(printer, 7);

        t1.start();
        t2.start();
    }
}
/*
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50

7 x 1 = 7
7 x 2 = 14
...
7 x 10 = 70*/
