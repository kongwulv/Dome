package inputandoutput;

import java.io.PipedOutputStream;

/**
 * @ProjectName: Dome
 * @Package: inputandoutput
 * @ClassName: ThreadB
 * @Description: java类作用描述
 * @Author: 吕小平
 * @CreateDate: 18-12-12 下午11:41
 * @UpdateUser: 更新者
 * @UpdateDate: 18-12-12 下午11:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ThreadB extends  Thread {
    private PipedOutputStream outputStream;
    private WriteData writeData;

    public ThreadB(PipedOutputStream outputStream, WriteData writeData) {
        this.outputStream = outputStream;
        this.writeData = writeData;
    }

    @Override
    public void run() {
        super.run();
        writeData.writeMethod(outputStream);
    }
}
