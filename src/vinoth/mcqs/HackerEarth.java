package vinoth.mcqs;

class HackerEarth {
    int val = 10;

    final int num = 10;
    public void display()
    {
        int num =12;
        Runnable r = new Runnable(){
            final int num = 15;
            public void run(){
                int num = 20;
                System.out.println(this.num);
            }
        };
        r.run();
    }
    public static void main(String[] args) {
        HackerEarth obj = new HackerEarth();
        System.out.println(obj.val);
        obj.display();
        int i = 5;
        System.out.println(i++ + ++i);
    }
}
