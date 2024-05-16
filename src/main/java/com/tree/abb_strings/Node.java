package com.tree.abb_strings;

public class Node {
    private String info;
    private int frec;
    private Node left;
    private Node right;

    public Node(String info) {
        this.info = info;
        this.frec = 1;
        left = null;
        right = null;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getFrec() {
        return frec;
    }

    public void inorden(){
        if (left != null) left.inorden();
        //System.out.println(info + "\t" + frec);
        System.out.printf("%-10s %4d\n", info, frec);
        if (right != null) right.inorden();
    }

    public void setFrec(int frec) {
        this.frec = frec;
    }

    public void increment(){
        frec += 1;
    }
}
