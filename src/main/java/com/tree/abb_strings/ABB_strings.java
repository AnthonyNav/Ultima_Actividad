/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tree.abb_strings;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author antho
 */
public class ABB_strings {

    public static void main(String[] args) {
        Tree tree = new Tree();
        System.out.println("Hello World!");

        Scanner scan = new Scanner(System.in);
        System.out.print("Dame la frase: ");
        String phase = scan.nextLine();
        String aux;
        StringTokenizer st = new StringTokenizer(phase);
        while (st.hasMoreElements()){

            if (!tree.isEmpty()){
                aux = st.nextToken().replaceAll(",","");
                tree.insertNode(aux, tree.getRoot());
            } else tree.setRoot(new Node(st.nextToken().replaceAll(",","")));
        }
        System.out.println("Palabra\t Frecuencia");
        tree.getRoot().inorden();
    }
}
