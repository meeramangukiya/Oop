class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                try {
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("First: " + i);
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                try {
                    for (int i = 11; i <= 20; i++) {
                        System.out.println("Second: " + i);
                        Thread.sleep(500);
                    }
                } catch (Exception e) {
                }
            }
        };

        t1.start();
        t2.start();
    }
}
/*
First: 1
Second: 11
Second: 12
First: 2
Second: 13
Second: 14
First: 3
...
Second: 20
First: 10
  */
