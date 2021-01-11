



public class StartThread implements Runnable {
    @Override
    public void run(){
        //线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我喜欢艾珂屹"+i+"天");
        }
    }

    public static void main(String[] args) {
        StartThread t = new StartThread();
        Thread thread = new Thread(t);
        thread.start();

        //主线程
        for (int i = 0; i < 200; i++) {
            System.out.println("艾珂屹喜欢我的第"+i+"天");
        }

    }
}
