package com.sjw.design.pattern.behavioral.memento;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 4:27
 * @Description: 这是对Article的一个快照
 * 即1个做备份的类，属性和Article一样，不过不需要set方法，因为它只有当Article存在时它才会存在
 * 只通过构造器传入
 **/
public class ArticleMemento {

    //标题
    private String title;

    //内容
    private String content;

    //相关图片
    private String imgs;

    public ArticleMemento(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }


    public String getContent() {
        return content;
    }

    public String getImgs() {
        return imgs;
    }

}
