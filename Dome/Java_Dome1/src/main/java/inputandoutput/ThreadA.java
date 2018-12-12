package inputandoutput;

import java.io.PipedInputStream;

/**
 * @ProjectName: Dome
 * @Package: inputandoutput
 * @ClassName: ThreadA
 * @Description: java类作用描述
 * @Author: 吕小平
 * @CreateDate: 18-12-12 下午11:34
 * @UpdateUser: 更新者
 * @UpdateDate: 18-12-12 下午11:34
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ThreadA extends  Thread {

    private ReadData readData;
    private PipedInputStream inputStream;

    public ThreadA(ReadData readData, PipedInputStream inputStream) {
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        super.run();
        readData.readMethod(inputStream);
    }
}
