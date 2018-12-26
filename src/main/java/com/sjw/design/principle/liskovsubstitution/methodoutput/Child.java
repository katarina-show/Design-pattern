package com.sjw.design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 12:50
 * @Description:
 **/
public class Child extends Base {

    //实现父类时，父类要求返回Map，我们这里返回HashMap，比Map更严格，这是OK的，符合里氏替换原则
    //如果返回值采用比父类更宽松的（比如把下面的HashMap返回值改成Object），编译检查就会直接报错了，实际开发中我们应该是没法犯这个错误的
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message","子类method被执行");
        return hashMap;
    }
}
