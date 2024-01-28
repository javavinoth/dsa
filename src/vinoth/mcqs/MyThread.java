package vinoth.mcqs;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread " + i);
        }
    }
}

