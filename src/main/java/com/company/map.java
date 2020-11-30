package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class map {
    int AB = 1;
    int AC = 1;
    int CD = 1;
    int BE = 2;
    int EJ = 6;
    int DG = 5;
    int GH = 7;
    int HI = 2;
    int JK = 1;
    int KL = 2;
    int LM = 1;
    int FL = 3;
    int BF = 6;
    int IN = 2;
    int NO = 2;
    int MO = 1;
    int OP = 1;

    String location = "A";

    public void makeGraph() {

        //DefaultDirectedGraph<String, DefaultEdge> g2 = new DefaultDirectedGraph<>(DefaultEdge.class);

        Graph<String, DefaultWeightedEdge> g2 = new WeightedPseudograph<>(DefaultWeightedEdge.class);

        g2.addVertex("A");
        g2.addVertex("B");
        g2.addVertex("C");
        g2.addVertex("D");
        g2.addVertex("E");
        g2.addVertex("F");
        g2.addVertex("G");
        g2.addVertex("H");
        g2.addVertex("I");
        g2.addVertex("J");
        g2.addVertex("K");
        g2.addVertex("L");
        g2.addVertex("M");
        g2.addVertex("N");
        g2.addVertex("O");
        g2.addVertex("P");

        DefaultWeightedEdge AB = g2.addEdge("A", "B");
        g2.setEdgeWeight(AB, 1);

        DefaultWeightedEdge AC = g2.addEdge("A", "C");
        g2.setEdgeWeight(AC, 1);

        DefaultWeightedEdge CD = g2.addEdge("C", "D");
        g2.setEdgeWeight(CD, 1);

        DefaultWeightedEdge BE = g2.addEdge("B", "E");
        g2.setEdgeWeight(BE, 2);

        DefaultWeightedEdge EJ = g2.addEdge("E", "J");
        g2.setEdgeWeight(EJ, 6);

        DefaultWeightedEdge DG = g2.addEdge("D", "G");
        g2.setEdgeWeight(DG, 5);

        DefaultWeightedEdge GH = g2.addEdge("G", "H");
        g2.setEdgeWeight(GH, 7);

        DefaultWeightedEdge HI = g2.addEdge("H", "I");
        g2.setEdgeWeight(HI, 2);

        DefaultWeightedEdge JK = g2.addEdge("J", "K");
        g2.setEdgeWeight(JK, 1);

        DefaultWeightedEdge KL = g2.addEdge("K", "L");
        g2.setEdgeWeight(KL, 2);

        DefaultWeightedEdge LM = g2.addEdge("L", "M");
        g2.setEdgeWeight(LM, 1);

        DefaultWeightedEdge FL = g2.addEdge("F", "L");
        g2.setEdgeWeight(FL, 3);

        DefaultWeightedEdge BF = g2.addEdge("B", "F");
        g2.setEdgeWeight(BF, 6);

        DefaultWeightedEdge IN = g2.addEdge("I", "N");
        g2.setEdgeWeight(IN, 2);

        DefaultWeightedEdge NO = g2.addEdge("N", "O");
        g2.setEdgeWeight(NO, 2);

        DefaultWeightedEdge MO = g2.addEdge("M", "O");
        g2.setEdgeWeight(MO, 1);

        DefaultWeightedEdge OP = g2.addEdge("O", "P");
        g2.setEdgeWeight(OP, 1);

        DefaultWeightedEdge DK = g2.addEdge("D", "K");
        g2.setEdgeWeight(DK, 5);

        DefaultWeightedEdge IL = g2.addEdge("I", "L");
        g2.setEdgeWeight(IL, 2);

        DefaultWeightedEdge LI = g2.addEdge("L", "I");
        g2.setEdgeWeight(LI, 2);

        DefaultWeightedEdge HN = g2.addEdge("H", "N");
        g2.setEdgeWeight(HN, 2);

        DefaultWeightedEdge NH = g2.addEdge("N", "H");
        g2.setEdgeWeight(NH, 2);

        DefaultWeightedEdge DE = g2.addEdge("D", "E");
        g2.setEdgeWeight(DE, 1);

        DefaultWeightedEdge ED = g2.addEdge("E", "D");
        g2.setEdgeWeight(ED, 1);

        DefaultWeightedEdge KI = g2.addEdge("K", "I");
        g2.setEdgeWeight(KI, 3);

        DefaultWeightedEdge IH = g2.addEdge("I", "H");
        g2.setEdgeWeight(IH, 4);



        int counter = 0;
        Scanner userInput = new Scanner(System.in);
        boolean moving = true;

        while(moving) {
            System.out.println("You can move to ");
            int weight = 0;

            for (DefaultWeightedEdge e : g2.edgeSet()) {
                if (String.valueOf(g2.getEdgeSource(e)).equals(location)) {
                    weight = (int) g2.getEdgeWeight(e);
                    System.out.println(g2.getEdgeTarget(e) + ": " + weight);
                }


            }
            location = userInput.nextLine();
            counter += weight;
            System.out.println("You are now located at " + location + " and have traveled " + counter + " units");
            if(location.equals("P")){
                moving = false;
            }
        }
        path(g2);




    }
    public static void path(Graph<String, DefaultWeightedEdge> g2){
        DijkstraShortestPath<String, DefaultWeightedEdge> p = new DijkstraShortestPath<String, DefaultWeightedEdge>(g2);
        System.out.println(p.getPath("A", "P"));
        System.out.println(p.getPathWeight("A", "P"));

    }
    }


