package com.sjw.design.pattern.structural.flyweight;

/**
 * @Author: Irelia
 * @Date: 2018/12/11 15:59
 * @Description:
 **/
public class Manager implements Employee {

    //title是内部状态，它不随外部变化而变化
    private String title = "部门经理";
    //department是外部状态
    private String department;
    private String reportContent;

    @Override
    public void report() {
        System.out.println(reportContent);
    }


    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }


}
