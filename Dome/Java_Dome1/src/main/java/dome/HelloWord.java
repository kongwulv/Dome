package dome;

/**
 * @ProjectName: Dome
 * @Package: Dome
 * @ClassName: HelloWord
 * @Description: java类作用描述
 * @Author: 吕小平
 * @CreateDate: 2018/11/14 10:15
 * @Version: 1.0
 */
public class HelloWord {

    public String sayHello() {
        return "helloword";
    }

    public static void main(String[] args) {
        HelloWord helloWord = new HelloWord();
        System.out.print(helloWord.sayHello());
    }
}
