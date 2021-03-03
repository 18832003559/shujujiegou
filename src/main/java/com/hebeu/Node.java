package com.hebeu;

public class Node {
    //节点内容
    int data;
    //下一个节点
    Node next;

    public Node(int data){
        this.data=data;
    }
    //为节点追回节点
    public void append(Node node){
       //当前节点
        Node currentNode=this;
        while(true){
            Node nextNode=currentNode.next;
            //如果下一个节点为null当前节点就是最后一个节点
            if (nextNode==null){
                break;
            }
            //赋给当前节点
            currentNode=nextNode;
        }
        //把需要的追回的节点追加为当前节点的下一个节点
        currentNode.next=node;
    }

    //获取下一个节点
    public Node next(){
        return this.next;
    }

    //获取节点的数据
    public int getData(){
        return this.data;
    }

    //判断节点是否为最后一个节点
    public boolean isLast(){
        if (this.next==null){
            return true;
        }
        return false;
    }

    //删除下一个节点
    public void removeNext(){
        //取出当前节点的下下一个节点
        Node newNext=this.next.next;
        //把下下一个节点设置为前一个节点的下一个节点
        this.next=newNext;
    }

    //展示所有节点
    public void show(){
        Node currentNode=this;
        while (true){
            System.out.print(currentNode.getData()+" ");
            currentNode=currentNode.next();
            if (currentNode==null){
                break;
            }
        }
        System.out.println();
    }

    //插入一个节点
    public void after(Node node){
        //将下一个节点作为下下个节点
        Node nextNext=next;
        //把插入的节点放到当前节点的下个节点
        this.next=node;
        //把下下个节点放到插入节点的下个节点
        this.next.next=nextNext;
    }
}
