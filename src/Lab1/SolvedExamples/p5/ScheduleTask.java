package Lab1.SolvedExamples.p5;/*
 * ScheduleTask.java
 */

import java.util.Timer;
import java.util.TimerTask;

/**
 * Programul exemplicfica utilizarea clasei Timer. Aceasat clasa permite planificarea
 * taskurilor pentru executie. Taskurile pot fi periodice. Pentru a putea fi planificat
 * pentru executie un task trebuie sa fie construit avand la baza clasa TimerTask.
 * <p>
 * 1. Testati modul de functionare al programului
 */
public class ScheduleTask {

    Timer timer = new Timer();

    public ScheduleTask() {

        timer.schedule(new RemindTask(),
                0,        //initial delay
                1000);  //subsequent rate

        timer.schedule(new SingleExecution(), 2000);
    }

    static class RemindTask extends TimerTask {
        int numWarningBeeps = 3;

        public void run() {
            if (numWarningBeeps > 0) {

                System.out.println("Beep!");
                numWarningBeeps--;
            } else {

                System.out.println("Time's up!");

                System.exit(0);
            }

        }
    }


    static class SingleExecution extends TimerTask {
        public void run() {
            System.out.println("Task executed.");
        }
    }

    public static void main(String[] args) {
        new ScheduleTask();
    }
}