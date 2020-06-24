package cc.techtips.singleton;

/**
 * 单例 - 枚举
 * 线程安全
 * 推荐使用
 */
public class SingletonDemo5 {

    private SingletonDemo5() {

    }

    public static SingletonDemo5 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    public enum Singleton {
        INSTANCE;

        private SingletonDemo5 instance;

        /**
         * JVM保证此方法只会被调用一次
         *
         * @return SingletonDemo5
         */
        Singleton() {
            instance = new SingletonDemo5();
        }

        public SingletonDemo5 getInstance() {
            return instance;
        }
    }
}
