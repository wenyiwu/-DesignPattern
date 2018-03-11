import com.xiaoma.design.pattern.proxy.Person;
import com.xiaoma.design.pattern.proxy.cglib.CglibMeiPo;
import com.xiaoma.design.pattern.proxy.cglib.LiSi;
import com.xiaoma.design.pattern.proxy.jdk.JDKMeiPo;
import com.xiaoma.design.pattern.proxy.jdk.ZhangSan;
import com.xiaoma.design.pattern.proxy.staticed.Father;
import com.xiaoma.design.pattern.proxy.staticed.Son;
import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProxyTest {
    @Test
    public void StaticProxyTest() {
        Son son = new Son();
        Father father = new Father(son);
        father.findLove();
    }

    @Test
    public void JDKProxyTest() throws IOException {
        Person zhangSan = new ZhangSan();
        JDKMeiPo jdkMeiPo = new JDKMeiPo();
        Person person = (Person) jdkMeiPo.getInstance(zhangSan);
        person.findLove();

        //通过此方法，将JDK动态生成的类保存下来，反编译可以查看
//        ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{People.class});
//        FileOutputStream outputStream = new FileOutputStream("$Proxy.class");
        //outputStream.write();
        //通过反编译工具可以查看源代码
        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
        FileOutputStream os = new FileOutputStream("./$Proxy0.class");
        os.write(bytes);
        os.close();
    }

    @Test
    public void CglibProxyTest() throws IOException {

        LiSi obj = (LiSi) new CglibMeiPo().getInstance(LiSi.class);
        obj.findLove();
        obj.buy();
        System.out.println(obj.getClass());

    }

    @Test
    public void CgLibAndJDKEfficiencyTest() throws IOException {
        Person zhangSan = new ZhangSan();
        JDKMeiPo jdkMeiPo = new JDKMeiPo();
        Person person = (Person) jdkMeiPo.getInstance(zhangSan);

        FileOutputStream os = new FileOutputStream(new File("test.txt"));
        int end = (int) System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            person.findLove();
        }
        int start = (int) System.currentTimeMillis();
        System.out.println(start - end);
        String s = (start - end) + "\n";
        os.write(s.getBytes());
        os.flush();

        LiSi obj = (LiSi) new CglibMeiPo().getInstance(LiSi.class);
        end = (int) System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            obj.findLove();
        }
        start = (int) System.currentTimeMillis();
        System.out.println(start - end);
        s = (start - end) + "\n";
        os.write(s.getBytes());
        os.flush();

    }
}
