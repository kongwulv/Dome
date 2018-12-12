package inputandoutput;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @ProjectName: Dome
 * @Package: inputandoutput
 * @ClassName: WriteData
 * @Description: java类作用描述
 * @Author: 吕小平
 * @CreateDate: 18-12-12 下午11:23
 * @UpdateUser: 更新者
 * @UpdateDate: 18-12-12 下午11:23
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class WriteData {

    public void writeMethod(PipedOutputStream out){
        try {
            System.out.println("write :");
            for(int i=0;i<300;i++){
                String outData = ""+(i+1);
                out.write(outData.getBytes());
                //System.out.println(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
