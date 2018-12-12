package threadDome;

/**
 * @ProjectName: Dome
 * @Package: threadDome
 * @ClassName: CountOperate
 * @Description: java类作用描述
 * @Author: 吕小平
 * @CreateDate: 18-12-6 下午10:39
 * @UpdateUser: 更新者
 * @UpdateDate: 18-12-6 下午10:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("CountOperate Begin...");
        System.out.println("Thread.currentThread().getName()="
                + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("CountOperate End...");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run Begin...");
        System.out.println("Thread.currentThread().getName()="
                + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("run End...");
    }

    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        /*Thread t1 = new Thread(c);
        t1.setName("A");
        t1.start();*/

        c.setName("A");
        c.start();


    }

}
