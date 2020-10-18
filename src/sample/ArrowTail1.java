package sample;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;

public class ArrowTail1 extends Pane {

    private Polyline polyline;
    private Group group = new Group();

    public ArrowTail1(){

        polyline = new Polyline(390,260,400,250,410,260);
        polyline.setStroke(Color.BLACK);
        polyline.setStrokeWidth(2);
        getChildren().add(polyline);

        polyline = new Polyline(390,270,400,260,410,270);
        polyline.setStroke(Color.BLACK);
        polyline.setStrokeWidth(2);
        getChildren().add(polyline);

        polyline = new Polyline(400,250,400,270,410,280,400,300,390,280,400,270);
        polyline.setStroke(Color.BLACK);
        polyline.setStrokeWidth(2);
        getChildren().add(polyline);
    }

    public Group getGroup(){
        return group;
    }
}