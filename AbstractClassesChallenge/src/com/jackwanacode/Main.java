package com.jackwanacode;

public class Main {

    public static void main(String[] args) {

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

	    String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

	    String[] data = stringData.split(" ");
	    for (String s: data) {
//            System.out.println("Add Node " + s + " to tree.");
            tree.addItem(new Node(s));
        }

	    tree.traverse(tree.getRoot());
    }
}
