package com.sjw.design.principle.demeter;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 22:57
 * @Description: 迪米特法则
 * 这里是BOSS让TeamLeader查询当前的课程数量的一个例子
 **/
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);

    }
}
