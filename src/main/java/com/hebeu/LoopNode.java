package com.hebeu;

public class LoopNode {

    //节点内容
    int data;
    //下一个节点
    LoopNode next= this;

    public LoopNode(int data){
        this.data=data;
    }


    //获取节点的数据
    public int getData(){
        return this.data;
    }


    //删除下一个节点
    public void removeNext(){
        //取出当前节点的下下一个节点
        LoopNode newNext=this.next.next;
        //把下下一个节点设置为前一个节点的下一个节点
        this.next=newNext;
    }


    //插入一个节点
    public void after(LoopNode node){
        //将下一个节点作为下下个节点
        LoopNode nextNext=next;
        //把插入的节点放到当前节点的下个节点
        this.next=node;
        //把下下个节点放到插入节点的下个节点
        this.next.next=nextNext;
    }
}
