package ru.alex.exc05ОШИБКА;

public class NewThread implements Runnable {
    String name;
    Thread t;

    public NewThread(String threadName){
        name = threadName;
        t = new Thread(this,name);
        System.out.println("Новый поток: "+t);
    }

    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name+": "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name+" прерван.");
        }
        System.out.println(name+" завершен.");
    }

}
