package sample;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;

public class ArrowTail2 extends Pane {

    private Polyline polyline;
    private Group group = new Group();

    public ArrowTail2(){

        polyline = new Polyline(400,250,390,260,390,290,400,280,410,290,410,260,400,250,400,280);
        polyline.setStroke(Color.BLACK);
        polyline.setStrokeWidth(2);
        getChildren().add(polyline);

        polyline = new Polyline(410,270,400,260,390,270,390,280,400,270,410,280);
        polyline.setStroke(Color.BLACK);
        polyline.setStrokeWidth(2);
        getChildren().add(polyline);
    }

    public Group getGroup(){
        return group;
    }

}