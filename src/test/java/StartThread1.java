



public class StartThread1 extends Thread{
    @Override
    //线程入口点
    public void run(){
        //线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我喜欢艾珂屹"+i+"天");
        }
    }

    public static void main(String[] args) {
        //创建线程对象
        StartThread1 t = new StartThread1();
        t.start();

        //主线程
        for (int i = 0; i < 200; i++) {
            System.out.println("艾珂屹喜欢我的第"+i+"天");
        }
    }
}



