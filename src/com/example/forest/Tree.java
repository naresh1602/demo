package com.example.forest;

public class Tree {
    public static void main(String[] args) {
        Forest forest = new Forest();
        System.out.println("Number of Trees in the Forest: " + forest.numberOfTrees);
        forest.exploreForest();
    }
}
