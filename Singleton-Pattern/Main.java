/**
 * Created by Jiazhang_Liu on 4/23/2015.
 */
public class Main {

    public static void main(String args[]) {
        Singleton singleton = Singleton.getInstance("Singleton Pattern");
        singleton.print(); // Output: Singleton Pattern!!!

        Singleton singleton1 = Singleton.getInstance("Singleton");
        singleton1.print(); // Output: Singleton Pattern!!! instead of Singleton!!!
    }
}
