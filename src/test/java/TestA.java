

public class TestA implements Runnable{

    //1.设置一个标志位
    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("线程1...."+i++);
        }
    }

    //2. 设置一个公开的方法停止线程，转换标志位
    public void stop(){
        this.flag = false;
    }

    public static void main(String[] args) {
        TestA testStop = new TestA();
        new Thread(testStop).start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main"+i);
            if (i==90){
                //调用stop方法来切换标志位，让线程停止
                testStop.stop();
                System.out.println("线程停止了");
            }
        }
    }
}
