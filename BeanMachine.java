//u10416021 張馨容
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.event.EventHandler;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import java.security.SecureRandom;

public class BeanMachine extends Application {
  //create a pane 
  Pane pane = new Pane();
  public void run(Circle ball,Circle ball1,Circle ball2,Circle ball3,Circle ball4,Circle ball5,Circle ball6,Circle ball7,Circle bottom){
	//create the timeline
  	Timeline animation = new Timeline(
  		new KeyFrame(Duration.millis(0),new KeyValue(ball.centerYProperty(),50)),
  		new KeyFrame(Duration.millis(100),new KeyValue(ball.centerYProperty(),ball1.getCenterY()-20)),
  		new KeyFrame(Duration.millis(200),new KeyValue(ball.centerXProperty(),ball2.getCenterX())),
  		new KeyFrame(Duration.millis(200),new KeyValue(ball.centerYProperty(),ball2.getCenterY()-20)),
  		new KeyFrame(Duration.millis(300),new KeyValue(ball.centerXProperty(),ball3.getCenterX())),
  		new KeyFrame(Duration.millis(300),new KeyValue(ball.centerYProperty(),ball3.getCenterY()-20)),
  		new KeyFrame(Duration.millis(400),new KeyValue(ball.centerXProperty(),ball4.getCenterX())),
		new KeyFrame(Duration.millis(400),new KeyValue(ball.centerYProperty(),ball4.getCenterY()-20)),
  		new KeyFrame(Duration.millis(500),new KeyValue(ball.centerXProperty(),ball5.getCenterX())),
  		new KeyFrame(Duration.millis(500),new KeyValue(ball.centerYProperty(),ball5.getCenterY()-20)),
  		new KeyFrame(Duration.millis(600),new KeyValue(ball.centerXProperty(),ball6.getCenterX())),
  		new KeyFrame(Duration.millis(600),new KeyValue(ball.centerYProperty(),ball6.getCenterY()-20)),
  		new KeyFrame(Duration.millis(700),new KeyValue(ball.centerXProperty(),ball7.getCenterX())),
  		new KeyFrame(Duration.millis(700),new KeyValue(ball.centerYProperty(),ball7.getCenterY()-20)),
  		new KeyFrame(Duration.millis(800),new KeyValue(ball.centerYProperty(),bottom.getCenterY())),
  		new KeyFrame(Duration.millis(800),new KeyValue(ball.centerXProperty(),bottom.getCenterX())));
    	//To plat animation
    	animation.play();
  	}
  
   
  @Override 
  public void start(Stage primaryStage) {   
    // Create a polyline
    Polyline polyline = new Polyline();
    //set the color
    polyline.setFill(Color.WHITE);polyline.setStroke(Color.BLACK);
    //Creates a polyline, defined by the array of the segment points.
    ObservableList<Double> list = polyline.getPoints();
    //Add points to polyline
    polyline.getPoints().addAll(new Double[]{
    185.0, 40.0 ,185.0, 70.0 ,80.0 , 300.0,80.0 , 360.0,320.0, 360.0,320.0, 300.0,215.0, 70.0 ,215.0, 40.0 
    });
    
    //layer1 includes one circle, set its coodinate and radius
    Circle circle1 = new Circle();
	circle1.setCenterX(200.0);circle1.setCenterY(80.0);circle1.setRadius(5.0);
	//layer2 includes two circle, set its coodinate and radius
	Circle circle2 = new Circle();
	circle2.setCenterX(185.0);circle2.setCenterY(115.0);circle2.setRadius(5.0);
    Circle circle3 = new Circle();
	circle3.setCenterX(215.0);circle3.setCenterY(115.0);circle3.setRadius(5.0);
   	//layer3 includes three circle, set its coodinate and radius
    Circle circle4 = new Circle();
	circle4.setCenterX(170.0);circle4.setCenterY(150.0);circle4.setRadius(5.0);
    Circle circle5 = new Circle();
	circle5.setCenterX(200.0);circle5.setCenterY(150.0);circle5.setRadius(5.0);
    Circle circle6 = new Circle();
	circle6.setCenterX(230.0);circle6.setCenterY(150.0);circle6.setRadius(5.0);
	//layer4 includes four circle, set its coodinate and radius
	Circle circle7 = new Circle();
	circle7.setCenterX(155.0);circle7.setCenterY(185.0);circle7.setRadius(5.0);
	Circle circle8 = new Circle();
	circle8.setCenterX(185.0);circle8.setCenterY(185.0);circle8.setRadius(5.0);
	Circle circle9 = new Circle();
	circle9.setCenterX(215.0);circle9.setCenterY(185.0);circle9.setRadius(5.0);
	Circle circle10 = new Circle();
	circle10.setCenterX(245.0);circle10.setCenterY(185.0);circle10.setRadius(5.0);
	//layer5 includes five circle, set its coodinate and radius
	Circle circle11 = new Circle();
	circle11.setCenterX(140.0);circle11.setCenterY(220.0);circle11.setRadius(5.0);
	Circle circle12 = new Circle();
	circle12.setCenterX(170.0);circle12.setCenterY(220.0);circle12.setRadius(5.0);
	Circle circle13 = new Circle();
	circle13.setCenterX(200.0);circle13.setCenterY(220.0);circle13.setRadius(5.0);
	Circle circle14 = new Circle();
	circle14.setCenterX(230.0);circle14.setCenterY(220.0);circle14.setRadius(5.0);
	Circle circle15 = new Circle();
	circle15.setCenterX(260.0);circle15.setCenterY(220.0);circle15.setRadius(5.0);
	//layer6 includes six circle, set its coodinate and radius
	Circle circle16 = new Circle();
	circle16.setCenterX(125.0);circle16.setCenterY(255.0);circle16.setRadius(5.0);
	Circle circle17 = new Circle();
	circle17.setCenterX(155.0);circle17.setCenterY(255.0);circle17.setRadius(5.0);
	Circle circle18 = new Circle();
	circle18.setCenterX(185.0);circle18.setCenterY(255.0);circle18.setRadius(5.0);
	Circle circle19 = new Circle();
	circle19.setCenterX(215.0);circle19.setCenterY(255.0);circle19.setRadius(5.0);
	Circle circle20 = new Circle();
	circle20.setCenterX(245.0);circle20.setCenterY(255.0);circle20.setRadius(5.0);
	Circle circle21 = new Circle();
	circle21.setCenterX(275.0);circle21.setCenterY(255.0);circle21.setRadius(5.0);
	//layer7 includes seven circle, set its coodinate and radius
	Circle circle22 = new Circle();
	circle22.setCenterX(110.0);circle22.setCenterY(290.0);circle22.setRadius(5.0);
	Circle circle23 = new Circle();
	circle23.setCenterX(140.0);circle23.setCenterY(290.0);circle23.setRadius(5.0);
	Circle circle24 = new Circle();
	circle24.setCenterX(170.0);circle24.setCenterY(290.0);circle24.setRadius(5.0);
	Circle circle25 = new Circle();
	circle25.setCenterX(200.0);circle25.setCenterY(290.0);circle25.setRadius(5.0);
	Circle circle26 = new Circle();
	circle26.setCenterX(230.0);circle26.setCenterY(290.0);circle26.setRadius(5.0);
	Circle circle27 = new Circle();
	circle27.setCenterX(260.0);circle27.setCenterY(290.0);circle27.setRadius(5.0);
	Circle circle28 = new Circle();
	circle28.setCenterX(290.0);circle28.setCenterY(290.0);circle28.setRadius(5.0);
	//last layer,be the destination of the ball
	Circle bottom1 = new Circle();
	bottom1.setCenterX(95.0);bottom1.setCenterY(350.0);bottom1.setRadius(3.0);bottom1.setFill(Color.WHITE);
	Circle bottom2 = new Circle();
	bottom2.setCenterX(125.0);bottom2.setCenterY(350.0);bottom2.setRadius(3.0);bottom2.setFill(Color.WHITE);
	Circle bottom3 = new Circle();
	bottom3.setCenterX(155.0);bottom3.setCenterY(350.0);bottom3.setRadius(3.0);bottom3.setFill(Color.WHITE);
	Circle bottom4 = new Circle();
	bottom4.setCenterX(185.0);bottom4.setCenterY(350.0);bottom4.setRadius(3.0);bottom4.setFill(Color.WHITE);
	Circle bottom5 = new Circle();
	bottom5.setCenterX(215.0);bottom5.setCenterY(350.0);bottom5.setRadius(3.0);bottom5.setFill(Color.WHITE);
	Circle bottom6 = new Circle();
	bottom6.setCenterX(245.0);bottom6.setCenterY(350.0);bottom6.setRadius(3.0);bottom6.setFill(Color.WHITE);
	Circle bottom7 = new Circle();
	bottom7.setCenterX(275.0);bottom7.setCenterY(350.0);bottom7.setRadius(3.0);bottom7.setFill(Color.WHITE);
	Circle bottom8 = new Circle();
	bottom8.setCenterX(305.0);bottom8.setCenterY(350.0);bottom8.setRadius(3.0);bottom8.setFill(Color.WHITE);
	//line1 -> Forming first slot.
	Line line1 = new Line();
	line1.setStartX(110.0);line1.setStartY(290.0);line1.setEndX(110.0);line1.setEndY(360.0);
    //line2 -> Forming second slot.
	Line line2 = new Line();
	line2.setStartX(140.0);line2.setStartY(290.0);line2.setEndX(140.0);line2.setEndY(360.0);
	//line3 -> Forming third slot.
	Line line3 = new Line();
	line3.setStartX(170.0);line3.setStartY(290.0);line3.setEndX(170.0);line3.setEndY(360.0);
	//line4 -> Forming fourth slot.
	Line line4 = new Line();
	line4.setStartX(200.0);line4.setStartY(290.0);line4.setEndX(200.0);line4.setEndY(360.0);
	//line5 -> Forming fifth slot.
	Line line5 = new Line();
	line5.setStartX(230.0);line5.setStartY(290.0);line5.setEndX(230.0);line5.setEndY(360.0);
	//line6 -> Forming sixth slot.
	Line line6 = new Line();
	line6.setStartX(260.0);line6.setStartY(290.0);line6.setEndX(260.0);line6.setEndY(360.0);
	//line7 -> Forming seventh slot.
	Line line7 = new Line();
	line7.setStartX(290.0);line7.setStartY(290.0);line7.setEndX(290.0);line7.setEndY(360.0);

    //remove all items from the collection
    pane.getChildren().clear();
    //add components to the pane
    pane.getChildren().add(polyline); 
	pane.getChildren().addAll(circle1,circle2,circle3,circle4,circle5,circle6,circle7,circle8,circle9,circle10,circle11,circle12,circle13,
	circle14,circle15,circle16,circle17,circle18,circle19,circle20,circle21,circle22,circle23,circle24,circle25,circle26,circle27,circle28);	
	pane.getChildren().addAll(bottom1,bottom2,bottom3,bottom4,bottom5,bottom6,bottom7,bottom8,line1,line2,line3,line4,line5,line6,line7);

	//create a scene
	Scene scene = new Scene(pane, 400, 400);
	double X = 0, Y = 0;
	//EventHandler
	scene.setOnKeyPressed( e -> {
		//create a circle
        Circle ball = new Circle();
        //set it location and radius
        ball.setCenterX(200);ball.setCenterY(50);ball.setRadius(3);ball.setFill(Color.RED);
        //add this ball to the pane
        pane.getChildren().add(ball);
        //create random
        SecureRandom random = new SecureRandom();
        //use random to get the integer
		int way = random.nextInt(128)+1;
        //show all the possible routine
    	switch(way){
        	case 1:run(ball,circle1,circle2,circle4,circle7,circle11,circle16,circle22,bottom1);break;
        	case 2:run(ball,circle1,circle2,circle4,circle7,circle11,circle16,circle22,bottom2);break;
        	case 3:run(ball,circle1,circle2,circle4,circle7,circle11,circle16,circle23,bottom2);break;
        	case 4:run(ball,circle1,circle2,circle4,circle7,circle11,circle17,circle23,bottom2);break;
        	case 5:run(ball,circle1,circle2,circle4,circle7,circle12,circle17,circle23,bottom2);break;
    		case 6:run(ball,circle1,circle2,circle4,circle8,circle12,circle17,circle23,bottom2);break;
    		case 7:run(ball,circle1,circle2,circle5,circle8,circle12,circle17,circle23,bottom2);break;
    		case 8:run(ball,circle1,circle3,circle5,circle8,circle12,circle17,circle23,bottom2);break;
    		case 9:run(ball,circle1,circle2,circle4,circle7,circle11,circle16,circle23,bottom3);break;
    		case 10:run(ball,circle1,circle2,circle4,circle7,circle11,circle17,circle23,bottom3);break;
    		case 11:run(ball,circle1,circle2,circle4,circle7,circle11,circle17,circle24,bottom3);break;
    		case 12:run(ball,circle1,circle2,circle4,circle7,circle12,circle17,circle23,bottom3);break;
    		case 13:run(ball,circle1,circle2,circle4,circle7,circle12,circle17,circle24,bottom3);break;
    		case 14:run(ball,circle1,circle2,circle4,circle7,circle12,circle18,circle24,bottom3);break;
    		case 15:run(ball,circle1,circle2,circle4,circle8,circle12,circle17,circle23,bottom3);break;
    		case 16:run(ball,circle1,circle2,circle4,circle8,circle12,circle17,circle24,bottom3);break;
    		case 17:run(ball,circle1,circle2,circle4,circle8,circle12,circle18,circle24,bottom3);break;
    		case 18:run(ball,circle1,circle2,circle4,circle8,circle13,circle18,circle24,bottom3);break;
    		case 19:run(ball,circle1,circle2,circle5,circle8,circle12,circle17,circle23,bottom3);break;
    		case 20:run(ball,circle1,circle2,circle5,circle8,circle12,circle17,circle24,bottom3);break;
    		case 21:run(ball,circle1,circle2,circle5,circle8,circle12,circle18,circle24,bottom3);break;
    		case 22:run(ball,circle1,circle2,circle5,circle8,circle13,circle18,circle24,bottom3);break;
    		case 23:run(ball,circle1,circle2,circle5,circle9,circle13,circle18,circle24,bottom3);break;
    		case 24:run(ball,circle1,circle3,circle5,circle8,circle12,circle17,circle23,bottom3);break;
    		case 25:run(ball,circle1,circle3,circle5,circle8,circle12,circle17,circle24,bottom3);break;
    		case 26:run(ball,circle1,circle3,circle5,circle8,circle12,circle18,circle24,bottom3);break;
    		case 27:run(ball,circle1,circle3,circle5,circle8,circle13,circle18,circle24,bottom3);break;
    		case 28:run(ball,circle1,circle3,circle5,circle9,circle13,circle18,circle24,bottom3);break;
    		case 29:run(ball,circle1,circle3,circle6,circle9,circle13,circle18,circle24,bottom3);break;
    		case 30:run(ball,circle1,circle2,circle4,circle7,circle11,circle17,circle24,bottom4);break;
    		case 31:run(ball,circle1,circle2,circle4,circle7,circle12,circle17,circle24,bottom4);break;
    		case 32:run(ball,circle1,circle2,circle4,circle7,circle12,circle18,circle24,bottom4);break;
    		case 33:run(ball,circle1,circle2,circle4,circle7,circle12,circle18,circle25,bottom4);break;
    		case 34:run(ball,circle1,circle2,circle4,circle8,circle12,circle17,circle24,bottom4);break;
			case 35:run(ball,circle1,circle2,circle4,circle8,circle12,circle18,circle24,bottom4);break; 
    		case 36:run(ball,circle1,circle2,circle4,circle8,circle12,circle18,circle25,bottom4);break;
			case 37:run(ball,circle1,circle2,circle4,circle8,circle13,circle18,circle24,bottom4);break;
			case 38:run(ball,circle1,circle2,circle4,circle8,circle13,circle18,circle25,bottom4);break;
			case 39:run(ball,circle1,circle2,circle4,circle8,circle13,circle19,circle25,bottom4);break;
			case 40:run(ball,circle1,circle2,circle5,circle8,circle12,circle17,circle24,bottom4);break;
			case 41:run(ball,circle1,circle2,circle5,circle8,circle12,circle18,circle24,bottom4);break;
			case 42:run(ball,circle1,circle2,circle5,circle8,circle12,circle18,circle25,bottom4);break;
			case 43:run(ball,circle1,circle2,circle5,circle8,circle13,circle18,circle24,bottom4);break;
			case 44:run(ball,circle1,circle2,circle5,circle8,circle13,circle18,circle25,bottom4);break;
			case 45:run(ball,circle1,circle2,circle5,circle8,circle13,circle19,circle25,bottom4);break;
			case 46:run(ball,circle1,circle2,circle5,circle9,circle13,circle18,circle24,bottom4);break;
			case 47:run(ball,circle1,circle2,circle5,circle9,circle13,circle18,circle25,bottom4);break;
			case 48:run(ball,circle1,circle2,circle5,circle9,circle13,circle19,circle25,bottom4);break;
			case 49:run(ball,circle1,circle2,circle5,circle9,circle14,circle19,circle25,bottom4);break;
			case 50:run(ball,circle1,circle3,circle5,circle8,circle12,circle17,circle24,bottom4);break;
			case 51:run(ball,circle1,circle3,circle5,circle8,circle12,circle18,circle24,bottom4);break;
			case 52:run(ball,circle1,circle3,circle5,circle8,circle12,circle18,circle25,bottom4);break;
			case 53:run(ball,circle1,circle3,circle5,circle8,circle13,circle18,circle24,bottom4);break;
			case 54:run(ball,circle1,circle3,circle5,circle8,circle13,circle18,circle25,bottom4);break;
			case 55:run(ball,circle1,circle3,circle5,circle8,circle13,circle19,circle25,bottom4);break;
			case 56:run(ball,circle1,circle3,circle5,circle9,circle13,circle18,circle24,bottom4);break;
			case 57:run(ball,circle1,circle3,circle5,circle9,circle13,circle18,circle25,bottom4);break;
			case 58:run(ball,circle1,circle3,circle5,circle9,circle13,circle19,circle25,bottom4);break;
			case 59:run(ball,circle1,circle3,circle5,circle9,circle14,circle19,circle25,bottom4);break;
			case 60:run(ball,circle1,circle3,circle6,circle9,circle13,circle18,circle24,bottom4);break;
			case 61:run(ball,circle1,circle3,circle6,circle9,circle13,circle18,circle25,bottom4);break;
			case 62:run(ball,circle1,circle3,circle6,circle9,circle13,circle19,circle25,bottom4);break;
			case 63:run(ball,circle1,circle3,circle6,circle9,circle14,circle19,circle25,bottom4);break;
			case 64:run(ball,circle1,circle3,circle6,circle10,circle14,circle19,circle25,bottom4);break;
			case 65:run(ball,circle1,circle2,circle4,circle7,circle12,circle18,circle25,bottom5);break;
			case 66:run(ball,circle1,circle2,circle4,circle8,circle12,circle18,circle25,bottom5);break;
			case 67:run(ball,circle1,circle2,circle4,circle8,circle13,circle18,circle25,bottom5);break;
			case 68:run(ball,circle1,circle2,circle4,circle8,circle13,circle19,circle25,bottom5);break;
			case 69:run(ball,circle1,circle2,circle4,circle8,circle13,circle19,circle26,bottom5);break;
			case 70:run(ball,circle1,circle2,circle5,circle8,circle12,circle18,circle25,bottom5);break;
			case 71:run(ball,circle1,circle2,circle5,circle8,circle13,circle18,circle25,bottom5);break;
			case 72:run(ball,circle1,circle2,circle5,circle8,circle13,circle19,circle25,bottom5);break;
			case 73:run(ball,circle1,circle2,circle5,circle8,circle13,circle19,circle26,bottom5);break;
			case 74:run(ball,circle1,circle2,circle5,circle9,circle13,circle18,circle25,bottom5);break;
			case 75:run(ball,circle1,circle2,circle5,circle9,circle13,circle19,circle25,bottom5);break;
			case 76:run(ball,circle1,circle2,circle5,circle9,circle13,circle19,circle26,bottom5);break;
			case 77:run(ball,circle1,circle2,circle5,circle9,circle14,circle19,circle25,bottom5);break;
			case 78:run(ball,circle1,circle2,circle5,circle9,circle14,circle19,circle26,bottom5);break;
			case 79:run(ball,circle1,circle2,circle5,circle9,circle14,circle20,circle26,bottom5);break;
			case 80:run(ball,circle1,circle3,circle5,circle8,circle12,circle18,circle25,bottom5);break;
			case 81:run(ball,circle1,circle3,circle5,circle8,circle13,circle18,circle25,bottom5);break;
			case 82:run(ball,circle1,circle3,circle5,circle8,circle13,circle19,circle25,bottom5);break;
			case 83:run(ball,circle1,circle3,circle5,circle8,circle13,circle19,circle26,bottom5);break;
			case 84:run(ball,circle1,circle3,circle5,circle9,circle13,circle18,circle25,bottom5);break;
			case 85:run(ball,circle1,circle3,circle5,circle9,circle13,circle19,circle25,bottom5);break;
			case 86:run(ball,circle1,circle3,circle5,circle9,circle13,circle19,circle26,bottom5);break;
			case 87:run(ball,circle1,circle3,circle5,circle9,circle14,circle19,circle25,bottom5);break;
			case 88:run(ball,circle1,circle3,circle5,circle9,circle14,circle19,circle26,bottom5);break;
			case 89:run(ball,circle1,circle3,circle5,circle9,circle14,circle20,circle26,bottom5);break;
			case 90:run(ball,circle1,circle3,circle6,circle9,circle13,circle18,circle25,bottom5);break;
			case 91:run(ball,circle1,circle3,circle6,circle9,circle13,circle19,circle25,bottom5);break;
			case 92:run(ball,circle1,circle3,circle6,circle9,circle13,circle19,circle26,bottom5);break;
			case 93:run(ball,circle1,circle3,circle6,circle9,circle14,circle19,circle25,bottom5);break;
			case 94:run(ball,circle1,circle3,circle6,circle9,circle14,circle19,circle26,bottom5);break;
			case 95:run(ball,circle1,circle3,circle6,circle9,circle14,circle20,circle26,bottom5);break;
			case 96:run(ball,circle1,circle3,circle6,circle10,circle14,circle19,circle25,bottom5);break;
			case 97:run(ball,circle1,circle3,circle6,circle10,circle14,circle19,circle26,bottom5);break;
			case 98:run(ball,circle1,circle3,circle6,circle10,circle14,circle20,circle26,bottom5);break;
			case 99:run(ball,circle1,circle3,circle6,circle10,circle15,circle20,circle26,bottom5);break;
			case 100:run(ball,circle1,circle2,circle4,circle8,circle13,circle19,circle26,bottom6);break;
			case 101:run(ball,circle1,circle2,circle5,circle8,circle13,circle19,circle26,bottom6);break;
			case 102:run(ball,circle1,circle2,circle5,circle9,circle13,circle19,circle26,bottom6);break;
			case 103:run(ball,circle1,circle2,circle5,circle9,circle14,circle19,circle26,bottom6);break;
			case 104:run(ball,circle1,circle2,circle5,circle9,circle14,circle20,circle26,bottom6);break;
			case 105:run(ball,circle1,circle2,circle5,circle9,circle14,circle20,circle27,bottom6);break;
			case 106:run(ball,circle1,circle3,circle5,circle8,circle13,circle19,circle26,bottom6);break;
			case 107:run(ball,circle1,circle3,circle5,circle9,circle13,circle19,circle26,bottom6);break;
			case 108:run(ball,circle1,circle3,circle5,circle9,circle14,circle19,circle26,bottom6);break;
			case 109:run(ball,circle1,circle3,circle5,circle9,circle14,circle20,circle26,bottom6);break;
			case 110:run(ball,circle1,circle3,circle5,circle9,circle14,circle20,circle27,bottom6);break;
			case 111:run(ball,circle1,circle3,circle6,circle9,circle13,circle19,circle26,bottom6);break;
			case 112:run(ball,circle1,circle3,circle6,circle9,circle14,circle19,circle26,bottom6);break;
			case 113:run(ball,circle1,circle3,circle6,circle9,circle14,circle20,circle26,bottom6);break;
			case 114:run(ball,circle1,circle3,circle6,circle9,circle14,circle20,circle27,bottom6);break;
			case 115:run(ball,circle1,circle3,circle6,circle10,circle14,circle19,circle26,bottom6);break;
			case 116:run(ball,circle1,circle3,circle6,circle10,circle14,circle20,circle26,bottom6);break;
			case 117:run(ball,circle1,circle3,circle6,circle10,circle14,circle20,circle27,bottom6);break;
			case 118:run(ball,circle1,circle3,circle6,circle10,circle15,circle20,circle26,bottom6);break;
			case 119:run(ball,circle1,circle3,circle6,circle10,circle15,circle20,circle27,bottom6);break;
			case 120:run(ball,circle1,circle3,circle6,circle10,circle15,circle21,circle27,bottom6);break;
			case 121:run(ball,circle1,circle2,circle5,circle9,circle14,circle20,circle27,bottom7);break;
			case 122:run(ball,circle1,circle3,circle5,circle9,circle14,circle20,circle27,bottom7);break;
			case 123:run(ball,circle1,circle3,circle6,circle9,circle14,circle20,circle27,bottom7);break;
			case 124:run(ball,circle1,circle3,circle6,circle10,circle14,circle20,circle27,bottom7);break;
			case 125:run(ball,circle1,circle3,circle6,circle10,circle15,circle20,circle27,bottom7);break;
			case 126:run(ball,circle1,circle3,circle6,circle10,circle15,circle21,circle27,bottom7);break;
			case 127:run(ball,circle1,circle3,circle6,circle10,circle15,circle21,circle28,bottom7);break;
			case 128:run(ball,circle1,circle3,circle6,circle10,circle15,circle21,circle28,bottom8);break;    	
    	}
    }); 
	
    // Set the stage title
    primaryStage.setTitle("BeanMachine"); 
    //Place the scene in the stage
    primaryStage.setScene(scene);
    // Display the stage
    primaryStage.show();
    //create eventhandle 
  }
}