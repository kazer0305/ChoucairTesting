package co.com.screenplay.project.utils;

public class Tiempo {

    private Tiempo(){}
    public static void waiting(int waiting) {
        try {
            Thread.sleep(waiting * 2500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
