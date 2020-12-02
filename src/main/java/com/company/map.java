package com.company;

import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.layout.mxIGraphLayout;
import com.mxgraph.util.mxCellRenderer;
//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class map {

    public int speedLimit;

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    private int distance;

    public map(int distance, int speedLimit){
        this.distance = distance;
        this.speedLimit = speedLimit;
    }

    public map() {

    }

    String location = "A";

    public void makeGraph(boolean randomize) {

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

        if(!randomize) {
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
            g2.setEdgeWeight(HI, 3);

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
            g2.setEdgeWeight(IH, 3);

        }else {
            DefaultWeightedEdge AB = g2.addEdge("A", "B");
            g2.setEdgeWeight(AB, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge AC = g2.addEdge("A", "C");
            g2.setEdgeWeight(AC, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge CD = g2.addEdge("C", "D");
            g2.setEdgeWeight(CD, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge BE = g2.addEdge("B", "E");
            g2.setEdgeWeight(BE, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge EJ = g2.addEdge("E", "J");
            g2.setEdgeWeight(EJ, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge DG = g2.addEdge("D", "G");
            g2.setEdgeWeight(DG, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge GH = g2.addEdge("G", "H");
            g2.setEdgeWeight(GH, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge HI = g2.addEdge("H", "I");
            g2.setEdgeWeight(HI, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge JK = g2.addEdge("J", "K");
            g2.setEdgeWeight(JK, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge KL = g2.addEdge("K", "L");
            g2.setEdgeWeight(KL, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge LM = g2.addEdge("L", "M");
            g2.setEdgeWeight(LM, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge FL = g2.addEdge("F", "L");
            g2.setEdgeWeight(FL, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge BF = g2.addEdge("B", "F");
            g2.setEdgeWeight(BF, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge IN = g2.addEdge("I", "N");
            g2.setEdgeWeight(IN, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge NO = g2.addEdge("N", "O");
            g2.setEdgeWeight(NO, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge MO = g2.addEdge("M", "O");
            g2.setEdgeWeight(MO, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge OP = g2.addEdge("O", "P");
            g2.setEdgeWeight(OP, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge DK = g2.addEdge("D", "K");
            g2.setEdgeWeight(DK, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge IL = g2.addEdge("I", "L");
            g2.setEdgeWeight(IL, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge LI = g2.addEdge("L", "I");
            g2.setEdgeWeight(LI, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge HN = g2.addEdge("H", "N");
            g2.setEdgeWeight(HN, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge NH = g2.addEdge("N", "H");
            g2.setEdgeWeight(NH, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge DE = g2.addEdge("D", "E");
            g2.setEdgeWeight(DE, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge ED = g2.addEdge("E", "D");
            g2.setEdgeWeight(ED, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge KI = g2.addEdge("K", "I");
            g2.setEdgeWeight(KI, (int) (Math.random() * 10) + 1);

            DefaultWeightedEdge IH = g2.addEdge("I", "H");
            g2.setEdgeWeight(IH, (int) (Math.random() * 10) + 1);

            //System.out.println(IH.toString());

            ArrayList<DefaultWeightedEdge> pairs = new ArrayList<>();
            //from stack v
            for (DefaultWeightedEdge e : g2.edgeSet()) {
                pairs.add(e);
            }

            //not from stack v
            for (DefaultWeightedEdge b : pairs) {
                for (DefaultWeightedEdge e : pairs) { //this checks for duplicates
                    if ((b.toString().substring(1, 2) + b.toString().substring(5,6)).equals(e.toString().substring(5, 6) + e.toString().substring(1, 2))) {
                       // System.out.println("pair found");
                        int randomNum = (int)(Math.random()*10)+1;
                        g2.setEdgeWeight(e, randomNum);
                        g2.setEdgeWeight(b, randomNum);
                    }

                }
            }
        }






        int counter = 0;
        Scanner userInput = new Scanner(System.in);
        boolean moving = true;

        while (moving) {
            System.out.println("You can move to ");
            int weight = 0;

            for (DefaultWeightedEdge e : g2.edgeSet()) {
                if (String.valueOf(g2.getEdgeSource(e)).equals(location)) {
                    weight = (int) g2.getEdgeWeight(e);
                    System.out.println(g2.getEdgeTarget(e) + ": " + weight);
                }


            }
            location = userInput.nextLine().toUpperCase();
            counter += weight;
            System.out.println("You are now located at " + location + " and have traveled " + counter + " units");
            if (location.equals("P")) {
                moving = false;
            }
        }
        System.out.println("The shortest path for this map was: ");
        path(g2);
        //givenAdaptedGraph_whenWriteBufferedImage_thenFileShouldExist(g2);


    }

    public static void path(Graph<String, DefaultWeightedEdge> g2) {
        DijkstraShortestPath<String, DefaultWeightedEdge> p = new DijkstraShortestPath<String, DefaultWeightedEdge>(g2);
        System.out.println(p.getPath("A", "P"));
        System.out.println("With a total weight traveled of: ");
        System.out.println((int)p.getPathWeight("A", "P"));

    }
}
/*
    public void givenAdaptedGraph_whenWriteBufferedImage_thenFileShouldExist(Graph g2) throws IOException {

        File imgFile = new File("src/test/resources/graph.png");
        imgFile.createNewFile();
        JGraphXAdapter<String, DefaultEdge> graphAdapter = new JGraphXAdapter<String, DefaultEdge>(g2);
        mxIGraphLayout layout = new mxCircleLayout(graphAdapter);
        layout.execute(graphAdapter.getDefaultParent());

        BufferedImage image =
                mxCellRenderer.createBufferedImage(graphAdapter, null, 2, Color.WHITE, true, null);
        ImageIO.write(image, "PNG", imgFile);

        //assertTrue(imgFile.exists());
    }

 */




