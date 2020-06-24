package cc.techtips.singleton;

/**
 * 单例 - 懒汉
 * 线程安全
 */
public class SingletonDemo3 {

    private SingletonDemo3() {

    }

    private static SingletonDemo3 instance = null;

    public static synchronized SingletonDemo3 getInstance() {

        if (null == instance) {
            instance = new SingletonDemo3();
        }
        return instance;
    }
}
