package sample;

import javafx.scene.Group;

public class CompleteArrow {
    private ArrowHead arrowHead;
    private ArrowTail1 arrowTail1;
    private Group group = new Group();
    private ArrowTail2 arrowTail2;
    int arrowversion;
    public CompleteArrow(int arrowversion) throws Exception {
        this.arrowHead = new ArrowHead();
        this.arrowversion = arrowversion;
        group.getChildren().add(arrowHead);
        if (arrowversion == 1){
            this.arrowTail1 = new ArrowTail1();
            group.getChildren().add(arrowTail1);
        }
        else if (arrowversion == 2){
            this.arrowTail2 = new ArrowTail2();
            group.getChildren().add(arrowTail2);
        }

        //this.arrowTail2 = new ArrowTail2();
    }
    public Group getGroup(){
        return group;
    }
}
