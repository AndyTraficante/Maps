package com.company;

import javafx.beans.property.ReadOnlySetProperty;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Multigraph;
import org.jgrapht.graph.SimpleGraph;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to randomize the edge weights?");



        boolean response = false;
        boolean completed = false;

        while(!completed) {
            String response1 = input.nextLine();
            if (response1.equalsIgnoreCase("yes") || (response1.equalsIgnoreCase("true"))) {
                response = true;
                completed = true;
            } else if (response1.equalsIgnoreCase("no") || response1.equalsIgnoreCase(("false"))) {
                completed = true;
            } else {
                System.out.println("That is not a valid response");
            }
        }

        System.out.println("Welcome to the map!" + "\n" + "You are located at West Palm Node A");
        System.out.println();
        map map1 = new map();
        map1.makeGraph(response);









    }

}
