package cc.techtips.singleton;

/**
 * 单例 - 懒汉
 * 线程不安全
 */
public class SingletonDemo2 {

    private SingletonDemo2() {

    }

    private static SingletonDemo2 instance = null;

    public static SingletonDemo2 getInstance() {

        if (null == instance) {
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
