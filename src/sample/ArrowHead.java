package sample;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class ArrowHead extends Pane {

    public ArrowHead() throws Exception{
        File file = new File("/home/whyee/IdeaProjects/Arrow/src/sample/ArrowCoordinates.txt");
        Scanner scanner = new Scanner(file);

        ArrayList<Point2D> thePoints = new ArrayList<>();
        while(scanner.hasNextLine()){
            Point2D p = new Point2D(scanner.nextDouble(), scanner.nextDouble());
            thePoints.add(p);
        }

        for(int i = 1; i < thePoints.size() ; i++){
            Point2D p1 = thePoints.get((i - 1));
            Point2D p2 = thePoints.get(i);
            Line line = new Line(p1.getX(), p1.getY(), p2.getX(), p2.getY());
            line.setStroke(Color.BLACK);
            line.setStrokeWidth(2);
            getChildren().add(line);
        }
    }
}