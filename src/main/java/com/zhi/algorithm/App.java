package com.zhi.algorithm;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        prop.setProperty("mail.host", "smtp.163.com");
        prop.setProperty("mail.transport.protocol", "smtp");
        prop.setProperty("mail.smtp.auth", "true");
        //使用JavaMail发送邮件的5个步骤
        //1、创建session
        Session session = Session.getInstance(prop);
        //开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
        session.setDebug(true);
        //2、通过session得到transport对象
        Transport ts = session.getTransport();
        //3、使用邮箱的用户名和密码连上邮件服务器，发送邮件时，发件人需要提交邮箱的用户名和密码给smtp服务器，用户名和密码都通过验证之后才能够正常发送邮件给收件人。
        ts.connect("smtp.163.com", "18600823501@163.com", ".WANGYI2018.");
        //4、创建邮件
        Message message = createSimpleMail(session);
        //5、发送邮件
        ts.sendMessage(message, message.getAllRecipients());
        ts.close();
    }
    private static MimeMessage createSimpleMail(Session session)
            throws Exception {
        //创建邮件对象
        MimeMessage message = new MimeMessage(session);
        //指明邮件的发件人
        message.setFrom(new InternetAddress("18600823501@163.com"));
        //指明邮件的收件人，现在发件人和收件人是一样的，那就是自己给自己发
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("18600823501@163.com"));
        //邮件的标题
        message.setSubject("只包含文本的简单邮件");
        //邮件的文本内容
        message.setContent("你好啊！", "text/html;charset=UTF-8");
        //返回创建好的邮件对象
        return message;
    }

    /**
     * 快排
     * @param a
     */
    private static void quickSort(int[] a) {
        sort(a,0,a.length-1);
    }

    private static void sort(int[] a,int lo, int hi){
        if (hi <= lo) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private static int partition(int[] a, int lo, int hi) {
        int i = lo,j=hi+1;
        int v = a[lo];
        while (true) {
            while (a[++i] < v) {
                if (i == hi) {
                    break;
                }
            }

            while (v < a[--j]) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }

            a[j] = a[i] + a[j] - (a[i] = a[j]);
        }
        a[lo] = a[lo] + a[j] - (a[j] = a[lo]);
        return j;
    }

    /**
     * 插入排序
     *
     * @param a 要排序的数组a
     */
    private static void insertion_sort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) { //从第二个数开始排序
            int temp = a[i]; //当前的数
            int j = i;
            for (; j > 0 && a[j - 1] > temp; j--) { //当前的数往前面有序部分插入，直到移动到合适位置
                a[j] = a[j - 1];//数组元素后移
            }
            a[j] = temp;
        }
    }

    /**
     * 希尔排序，一种分组排序算法
     *
     * @param a
     */
    private static void shell_sort(int[] a) {
        int n = a.length;
        for (int i = n / 2; i > 0; i /= 2) {
            for (int j = i; j < n; j++) {
                int temp = a[j];
                int k = j;
                for (; k >= i && a[k - i] > temp; k -= i) {
                    a[k] = a[k - i];
                }
                a[k] = temp;
            }
        }
    }

}
