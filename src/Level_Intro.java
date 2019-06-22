//MUHAMMET YASÝN TUFAN-150116013
//VAROL KOÇOÐLU-150116045
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.*;;



public class Level_Intro extends Application {
	

	double arc1x1=495 , arc1y1=150 , arc1wei=50 , arc1hei=50, arc1rot=180 , arc1deg=180;	//Creating arcs
	
	Arc arc1 = new Arc(arc1x1 , arc1y1 , arc1wei , arc1hei, arc1rot , arc1deg);
	
	double arc2x1=400 , arc2y1=150 , arc2wei=50 , arc2hei=50, arc2rot=0 , arc2deg=180; 
	Arc arc2 = new Arc(arc2x1 , arc2y1 , arc2wei , arc2hei, arc2rot , arc2deg);
	
	
	double c1x1=425 , c1y1=350 , c1r1=25; 
	Circle circle1 = new Circle(c1x1 , c1y1 ,c1r1);	//Creating circles

 
	double l1x1=450, l1y1=350 ,l1x2=700, l1y2=350;	//Creating lines
	Line line1 = new Line(l1x1, l1y1 ,l1x2, l1y2);
	
	double l2x1=400, l2y1=350 ,l2x2=150, l2y2=350;
	Line line2 = new Line(l2x1, l2y1 ,l2x2, l2y2);
	
	double l3x1=150, l3y1=350 ,l3x2=150, l3y2=150;
	Line line3 = new Line(l3x1, l3y1 ,l3x2, l3y2);
	
	double l4x1=700, l4y1=350 ,l4x2=700, l4y2=150;
	Line line4 = new Line(l4x1, l4y1 ,l4x2, l4y2);
	
	double l5x1=700, l5y1=150 ,l5x2=625, l5y2=150;
	Line line5 = new Line(l5x1, l5y1 ,l5x2, l5y2);
	
	double l6x1=150, l6y1=150 ,l6x2=225, l6y2=150;
	Line line6 = new Line(l6x1, l6y1 ,l6x2, l6y2);

	double l7x1=225, l7y1=75 ,l7x2=225, l7y2=225;
	Line line7 = new Line(l7x1, l7y1 ,l7x2, l7y2);
	
	double l8x1=225, l8y1=150 ,l8x2=270, l8y2=150;
	Line line8 = new Line(l8x1, l8y1 ,l8x2, l8y2);
	
	double l9x1=270, l9y1=75 ,l9x2=270, l9y2=225;
	Line line9 = new Line(l9x1, l9y1 ,l9x2, l9y2);

	double l10x1=625, l10y1=150 ,l10x2=665, l10y2=75;
	Line line10 = new Line(l10x1, l10y1 ,l10x2, l10y2);
	
	double l11x1=625, l11y1=150 ,l11x2=665, l11y2=225;
	Line line11 = new Line(l11x1, l11y1 ,l11x2, l11y2);
	
	double l12x1=625, l12y1=75 ,l12x2=625, l12y2=225;
	Line line12 = new Line(l12x1, l12y1 ,l12x2, l12y2);
	
	

	
    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        Pane root = new Pane();
        
        //DRAW HORIZONTAL AND VERTICAL LINES
        line1.setStroke(Color.DIMGRAY);        //SET THE COLOR OF LINE
        line1.setStrokeWidth(3);               //SET THE WIDTH OF LINE
        
        line2.setStroke(Color.DIMGRAY);
        line2.setStrokeWidth(3);
        
        line3.setStroke(Color.DIMGRAY);
        line3.setStrokeWidth(3);
     
        line4.setStroke(Color.DIMGRAY);
        line4.setStrokeWidth(3);
     
        line5.setStroke(Color.DIMGRAY);
        line5.setStrokeWidth(3);
     
        line6.setStroke(Color.DIMGRAY);
        line6.setStrokeWidth(3);
       
        line7.setStroke(Color.DIMGRAY);
        line7.setStrokeWidth(5);
       
        line8.setStroke(Color.DIMGRAY);
        line8.setStrokeWidth(5);
      
        line9.setStroke(Color.DIMGRAY);
        line9.setStrokeWidth(5);
       
        line10.setStroke(Color.DIMGRAY);
        line10.setStrokeWidth(5);
       
        line11.setStroke(Color.DIMGRAY);
        line11.setStrokeWidth(5);
       
        line12.setStroke(Color.DIMGRAY);
        line12.setStrokeWidth(5);
      
        ///////////////////////////////
        
        //DRAWING FILLED CIRCLES
        
        circle1.setFill(Color.GREY);             //SET THE COLOR OF CIRCLE
      
       
        ///////////////////////////////
        
        //DRWING SEMICIRCLES
        arc1.setType(ArcType.OPEN);               //SETS THE VALUE OF THE PROPERTY TYPE
        arc1.setStrokeWidth(5);                  //SET THE WIDTH OF ARC
        arc1.setStroke(Color.DIMGRAY);            //SET THE COLOR OF ARC
        arc1.setStrokeType(StrokeType.INSIDE);    //RETURNS THE ENUM CINSTANT OF THIS TYPE WITH THE SPECIFIED NAME
        arc1.setFill(null);                       //SET THE FILLED TYPE OF ARC
        
        arc2.setType(ArcType.OPEN);
        arc2.setStrokeWidth(5);
        arc2.setStroke(Color.DIMGRAY);
        arc2.setStrokeType(StrokeType.INSIDE);
        arc2.setFill(null);
        
        
    	circle1.addEventHandler(MouseEvent.MOUSE_PRESSED, //Creating mouse press button with circle
                new EventHandler<MouseEvent>() {
                  public void handle(MouseEvent me2) {
                Timeline animation =
                	new Timeline(new KeyFrame(Duration.millis(4), e ->ArcCompletor() )); //Creating timing for completor
               		 animation.setCycleCount(180);
               		 animation.play();
               		 
               FadeTransition ft1=
                      new FadeTransition(Duration.millis(1000), arc1 );	//Creating timing for fading arcs 
                      ft1.setToValue(0);
                      ft1.setAutoReverse(false);
                      ft1.setCycleCount(1);
                      ft1.setDelay(Duration.seconds(1));
                      
               FadeTransition ft2=
                      new FadeTransition(Duration.millis(1000), arc2 );
                      ft2.setToValue(0);
                      ft2.setAutoReverse(false);
                      ft2.setCycleCount(1);
                      ft2.setDelay(Duration.seconds(1));
                      
                      FadeTransition ft3=
                      new FadeTransition(Duration.millis(1000), line12 );//Creating timing for  fading lines
                        ft3.setToValue(0);
                        ft3.setAutoReverse(false);
                        ft3.setCycleCount(1);
                        ft3.setDelay(Duration.seconds(1));
                FadeTransition ft4=
                		new FadeTransition(Duration.millis(1000), line11 );
                		ft4.setToValue(0);
                		ft4.setAutoReverse(false);
                		ft4.setCycleCount(1);
                		ft4.setDelay(Duration.seconds(1));

               FadeTransition ft5=
            		   new FadeTransition(Duration.millis(1000), line10 );
               			ft5.setToValue(0);
               			ft5.setAutoReverse(false);
               			ft5.setCycleCount(1);
               			ft5.setDelay(Duration.seconds(1));

               FadeTransition ft6=
            		   	new FadeTransition(Duration.millis(1000), line9 );
               			ft6.setToValue(0);
               			ft6.setAutoReverse(false);
               			ft6.setCycleCount(1);
               			ft6.setDelay(Duration.seconds(1));

               FadeTransition ft7=
            		   new FadeTransition(Duration.millis(1000), line8 );
               			ft7.setToValue(0);
               			ft7.setAutoReverse(false);
               			ft7.setCycleCount(1);
               			ft7.setDelay(Duration.seconds(1));

               	FadeTransition ft8=
               			new FadeTransition(Duration.millis(1000), line7 );
               			ft8.setToValue(0);
               			ft8.setAutoReverse(false);
               			ft8.setCycleCount(1);
               			ft8.setDelay(Duration.seconds(1));

               	FadeTransition ft9=
               			new FadeTransition(Duration.millis(1000), line6 );
               			ft9.setToValue(0);
               			ft9.setAutoReverse(false);
               			ft9.setCycleCount(1);
               			ft9.setDelay(Duration.seconds(1));

               	FadeTransition ft10=
               			new FadeTransition(Duration.millis(1000), line5 );
               			ft10.setToValue(0);
               			ft10.setAutoReverse(false);
               			ft10.setCycleCount(1);
               			ft10.setDelay(Duration.seconds(1));

               	FadeTransition ft11=
               			new FadeTransition(Duration.millis(1000), line4 );
               			ft11.setToValue(0);
               			ft11.setAutoReverse(false);
               			ft11.setCycleCount(1);
               			ft11.setDelay(Duration.seconds(1));

               	FadeTransition ft12=
               			new FadeTransition(Duration.millis(1000), line3 );
               			ft12.setToValue(0);
               			ft12.setAutoReverse(false);
               			ft12.setCycleCount(1);
               			ft12.setDelay(Duration.seconds(1));

               	FadeTransition ft13=
               			new FadeTransition(Duration.millis(1000), line2 );
               			ft13.setToValue(0);
               			ft13.setAutoReverse(false);
               			ft13.setCycleCount(1);
               			ft13.setDelay(Duration.seconds(1));

               	FadeTransition ft14=
               			new FadeTransition(Duration.millis(1000), line1 );
               			ft14.setToValue(0);
               			ft14.setAutoReverse(false);
               			ft14.setCycleCount(1);
               			ft14.setDelay(Duration.seconds(1));

               	FadeTransition ft15=
               			new FadeTransition(Duration.millis(1000), circle1 );//Creating timing for fading circle
               			ft15.setToValue(0);
               			ft15.setAutoReverse(false);
               			ft15.setCycleCount(1);
               			ft15.setDelay(Duration.seconds(1));

                              
               			ParallelTransition pt = new ParallelTransition(ft1,ft2,ft3,ft4,ft5,ft6,ft7,ft8,ft9,ft10,ft11,ft12,ft13,ft14,ft15); //Creating object for play
                  		 pt.play();      
                      
                  		 
                  		
                  }
                  
    	
    	});
                
        root.getChildren().addAll(arc1 ,arc2 ,line12 ,line11 ,line10 ,
        		line9 ,line8 ,line7 ,line6 ,line5 ,line4 ,line3 ,line2 ,line1 ,circle1 );//print shape to scene 

        //SET THE SCENE SIZE
        Scene scene = new Scene(root, 850, 450, Color.WHITESMOKE);

        stage.setTitle("LEVEL 2");//create title
        stage.setResizable(false);//block to changing size of scene
        stage.setScene(scene);//open scene
        stage.show();
       // System.out.println(line3.getOpacity());
        
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
    public void ArcCompletor() { //creating completor method
    	arc1deg += 1;
    	arc2deg += 1;
    	arc1.setLength(arc1deg);
    	arc2.setLength(arc2deg);
		}
}