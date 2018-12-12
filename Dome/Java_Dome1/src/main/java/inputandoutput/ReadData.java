package inputandoutput;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @ProjectName: Dome
 * @Package: inputandoutput
 * @ClassName: ReadData
 * @Description: java类作用描述
 * @Author: 吕小平
 * @CreateDate: 18-12-12 下午11:28
 * @UpdateUser: 更新者
 * @UpdateDate: 18-12-12 下午11:28
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ReadData {

    public void readMethod(PipedInputStream input){
        try{
            System.out.println("read :");
            byte[] bytes = new byte[20];
            int readLength  = input.read(bytes);
            while(readLength!=-1){
                String newData = new String(bytes,0,readLength);
                System.out.println(newData);
                readLength=input.read(bytes);
            }
            System.out.println();
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
