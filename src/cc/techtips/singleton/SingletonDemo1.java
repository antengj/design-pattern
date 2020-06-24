package cc.techtips.singleton;

/**
 * 单例 - 饿汉
 * 线程安全
 */
public class SingletonDemo1 {

    private SingletonDemo1() {

    }

    private static SingletonDemo1 instance = new SingletonDemo1();

    public static SingletonDemo1 getInstance() {
        return instance;
    }
}
