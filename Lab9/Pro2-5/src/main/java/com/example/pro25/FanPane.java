package com.example.pro25;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class FanPane extends StackPane {
    private double startAngle = 15;
    private Timeline fan;
    private Pane blades = getBlades();
    private ObservableList<Node> list = blades.getChildren();
    public FanPane(){
        getChildren().addAll(getCircle(),blades);
        fan = new Timeline(
                new KeyFrame(Duration.millis(50), e-> spinFan()));
        fan.setCycleCount(Timeline.INDEFINITE);
        fan.play();
    }
    protected void spinFan(){
        for(int i=0;i<list.size();i++){
            Arc a= (Arc)list.get(i);
            a.setStartAngle((a.getStartAngle()+startAngle));
            a.setCenterX(getWidth()/2);
            a.setCenterY(getHeight()/2);
        }
    }
    public void pause(){
        fan.pause();
    }
    public void play(){
        fan.play();
    }
    protected  void reverse(){
        startAngle *=-1;
    }
    private Pane getBlades(){
        Pane pane = new Pane();
        double angle =0;
        for(int i=0;i<4;i++){
            Arc arc = new Arc(125+25,115+20,90,90,angle+90,50);
            arc.setFill(Color.BLACK);
            arc.setType(ArcType.ROUND);
            pane.getChildren().add(arc);
            angle+=90;
        }
        return pane;
    }
    private Circle getCircle(){
        Circle c = new Circle();
        c.setRadius(100);
        c.setStroke(Color.BLACK);
        c.setFill(Color.WHITE);
        return c;
    }
}
