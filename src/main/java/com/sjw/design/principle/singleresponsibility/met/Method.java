package com.sjw.design.principle.singleresponsibility.met;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 19:23
 * @Description: 单一职责原则--方法的单一职责
 **/
public class Method {
    private void updateUserInfo(String userName,String address){
        //伪代码
        userName = "Irelia";
        address = "nanjing";
    }

    //此方法职责不单一了
    private void updateUserInfo(String userName,String... properties){
        userName = "Irelia";
//        address = "nanjing";
    }

    //只更新名字，方法单一职责
    private void updateUsername(String userName){
        userName = "Irelia";
    }

    //只更新地址，方法单一职责
    private void updateUserAddress(String address){
        address = "nanjing";
    }

    //此方法建议拆开，也不符合单一职责
    //实际写代码中，我们有很多都不符合单一职责原则，因为涉及到个人水平，项目截止日期等等
    //建议在接口和方法上可以使用该原则，如果在类上也使用，可能会造成类的爆炸多。。。
    private void updateUserInfo(String userName,String address,boolean bool){
        if(bool){
            //todo something1
        }else{
            //todo something2
        }
        userName = "Irelia";
        address = "nanjing";
    }


}
