package com.zyf.quatrz.test;

import com.zyf.quatrz.job.HelloJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

public class SimpleExample {

    public void run() throws Exception{
        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sched = sf.getScheduler();
        Date runTime = DateBuilder.evenMinuteDate(new Date());
        JobDetail job = JobBuilder.newJob(HelloJob.class).withIdentity("job1", "group1").build();

        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1").startAt(runTime).build();
        sched.scheduleJob(job, trigger);
        sched.start();

        try
        {
            Thread.sleep(65000L);
        }
        catch (Exception e)
        {
        }

        sched.shutdown(true);
    }
    public static void main(String[] args) throws Exception{
        /*SimpleExample example = new SimpleExample();
        example.run();*/
        Date d1 = new Date();
        Date d2 = DateBuilder.nextGivenSecondDate(d1, 10);
        System.out.println(d1);
        System.out.println(d2);
    }
}
