package demo.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class job2 {

    public void execute(){
        Date date=new Date();
        String dates= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        System.out.println("任务2开始....."+dates);
    }
}
