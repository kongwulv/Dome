package inputandoutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @ProjectName: Dome
 * @Package: inputandoutput
 * @ClassName: Run
 * @Description: java类作用描述
 * @Author: 吕小平
 * @CreateDate: 18-12-12 下午11:43
 * @UpdateUser: 更新者
 * @UpdateDate: 18-12-12 下午11:43
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Run {

    public static void main(String[] args){
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream();

            outputStream.connect(inputStream);

            ThreadA threadA = new ThreadA(readData,inputStream);
            ThreadB threadB = new ThreadB(outputStream,writeData);
            threadA.start();
            Thread.sleep(100);
            threadB.start();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
