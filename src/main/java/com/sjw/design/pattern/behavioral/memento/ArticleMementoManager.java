package com.sjw.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 4:23
 * @Description:
 **/
public class ArticleMementoManager {

    //栈的先进后出
    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento){
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
}
