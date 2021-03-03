package com.hebeu;

import java.util.Stack;

public class MyStack {
  //栈的底层使用数组来存储数据
    int [] elements;
    public MyStack() {
        elements=new int[0];
    }

    //压入元素操作
    public  void  push(int element){
        //创建一个数组
        int [] newArr=new int[elements.length+1];
        //把原数组中的元素复制到新数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i]=elements[i];
        }
        //把添加的元素放入新数组中
        newArr[elements.length]=element;
        elements=newArr;
    }

    //取出栈顶的元素
    public int pop(){
        if (elements.length==0){
            throw new RuntimeException("栈是空的");
        }
        //即取出数组的最后一个元素
        int element=elements[elements.length-1];
        //创建一个新数组
        int[] newArr=new int[elements.length-1];
        //原数组中除了最后一个元素其他的全部放入新数组中
        for (int i = 0; i < elements.length-1; i++) {
            newArr[i]=elements[i];
        }
        elements=newArr;
        return element;
    }

    //取出栈顶元素
     public int peek(){
        return elements[elements.length-1];
     }
}
