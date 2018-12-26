package com.sjw.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Irelia
 * @Date: 2018/12/11 16:01
 * @Description 工厂类的容器单例
 **/
public class EmployeeFactory {
    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();

    //从Map中根据参数获得一个员工
    public static Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if(manager == null){
            manager = new Manager(department);
            System.out.print("创建部门经理:"+department);
            String reportContent = department+"部门汇报:此次报告的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告:"+reportContent);
            EMPLOYEE_MAP.put(department,manager);

        }
        return manager;
    }

}
