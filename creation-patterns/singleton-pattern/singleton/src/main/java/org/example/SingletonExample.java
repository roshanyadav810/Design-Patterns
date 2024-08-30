package org.example;

import java.util.Objects;

public class SingletonExample {
    private static volatile SingletonExample singletonExample;

    private SingletonExample(){}

    /*
    This is not good as there is lot of overhead of synchronize
    * */
//    public synchronized SingletonExample getInstance(){
//        if(Objects.isNull(singletonExample)){
//            singletonExample =  new SingletonExample();
//        }
//        return singletonExample;
//    }


    public SingletonExample getInstance(){
        if(Objects.isNull(singletonExample)){
            synchronized (this) {
                singletonExample = new SingletonExample();
            }
        }
        return singletonExample;
    }

}
