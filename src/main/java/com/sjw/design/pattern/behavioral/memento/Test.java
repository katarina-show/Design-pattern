package com.sjw.design.pattern.behavioral.memento;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 4:40
 * @Description: 备忘录模式
 **/
public class Test {

    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article = new Article("设计模式A","内容A","图片A");

        //存档
        ArticleMemento articleMemento = article.saveToMemento();

        //放入栈
        articleMementoManager.addMemento(articleMemento);

        System.out.println("标题：" + article.getTitle() + ",内容：" + article.getContent() + ",图片：" + article.getImgs() + ",存档成功！");
        System.out.println("现在的信息" + article);

        System.out.println("准备修改文章。。。");
        article.setTitle("设计模式B");
        article.setContent("内容B");
        article.setImgs("图片B");
        System.out.println("修改完毕");
        System.out.println("修改完的信息" + article);

        //又一次做了暂存
        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        article.setTitle("设计模式C");
        article.setContent("内容C");
        article.setImgs("图片C");

        System.out.println("开始回退");
        System.out.println("第一次出栈");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("第二次出栈");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退结束");
        System.out.println("最后的信息：" + article);


    }
}
