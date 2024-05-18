package com.tree.abb_strings;

import java.text.Collator;
import java.util.Locale;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public boolean isEmpty(){
        return root == null;
    }

    // The first insertion will be checked in the main program
    public Node insertNode(String info, Node node){
        Collator collator = Collator.getInstance(new Locale("es", "ES"));
        collator.setStrength(Collator.PRIMARY);

        if (node == null) node = new Node(info);
        else if (0 > collator.compare(info, node.getInfo())) node.setLeft(insertNode(info, node.getLeft()));
        else if (0 < collator.compare(info, node.getInfo())) node.setRight(insertNode(info, node.getRight()));
        else node.increment();
        return node;
    }
}
