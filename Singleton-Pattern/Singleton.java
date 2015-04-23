/**
 * Created by Jiazhang_Liu on 4/23/2015.
 */
public class Singleton {
    private static Singleton instance;
    private String str = "";

    private Singleton(){}

    private Singleton(String str){
        this.str = str;
    }

    public static Singleton getInstance(String str) {
        if(instance == null) {
            instance = new Singleton(str);
        }
        return instance;
    }

    public void print() {
        System.err.println(str + "!!!");
    }

}
