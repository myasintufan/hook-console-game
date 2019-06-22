//Muhammet Yasin Tufan_150116013
//Varol Koçoðlu_150116045
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
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
import javafx.scene.shape.*;




public class Level4 extends Application {

	boolean collisionBoolean = false;
int eventh1 = 0, eventh2 =0,m=355;
double arc1x1=300 , arc1y1=260 , arc1wei=25 , arc1hei=25, arc1rot=0 , arc1deg=360; //creating arc
Arc arc1 = new Arc(arc1x1 , arc1y1 , arc1wei , arc1hei, arc1rot , arc1deg);

double arc2x1=700 , arc2y1=95 , arc2wei=28 , arc2hei=28, arc2rot=0 , arc2deg=180; 
Arc arc2 = new Arc(arc2x1 , arc2y1 , arc2wei , arc2hei, arc2rot , arc2deg);
double arcl12x1=700 , arcl12y1=95 , arcl12wei=28 , arcl12hei=28, arcl12rot=0 , arcl12deg=180; 
Arc arcl12 = new Arc(arcl12x1 , arcl12y1 ,arcl12wei , arcl12hei, arcl12rot , arcl12deg);
double arcl8x1=726 , arcl8y1=95 , arcl8wei=28 , arcl8hei=28, arcl8rot=0 , arcl8deg=180; 
Arc arcl8 = new Arc(arcl8x1 , arcl8y1 ,arcl8wei , arcl8hei, arcl8rot , arcl8deg);
double c1x1=185 , c1y1=260 , c1r1=25; 
Circle circle1 = new Circle(c1x1 , c1y1 ,c1r1);
 
double c2x1=300 , c2y1=350 , c2r1=25;  //creating circle
Circle circle2 = new Circle(c2x1 , c2y1 ,c2r1);
double c3x1=300 , c3y1=350 , c3r1=25; 
Circle circle3 = new Circle(c3x1 , c3y1 ,c3r1);
 
double l1x1=200, l1y1=260 ,l1x2=274, l1y2=260; //creating line
Line line1 = new Line(l1x1, l1y1 ,l1x2, l1y2);
double l2x1=300, l2y1=286 ,l2x2=300, l2y2=325;
Line line2 = new Line(l2x1, l2y1 ,l2x2, l2y2);
double l3x1=300, l3y1=237 ,l3x2=300, l3y2=284;
Line line3 = new Line(l3x1, l3y1 ,l3x2, l3y2);
double l4x1=300, l4y1=234 ,l4x2=300, l4y2=95;
Line line4 = new Line(l4x1, l4y1 ,l4x2, l4y2);
double l5x1=300, l5y1=95 ,l5x2=320, l5y2=95;
Line line5 = new Line(l5x1, l5y1 ,l5x2, l5y2);
double l6x1=320, l6y1=78 ,l6x2=320, l6y2=112;
Line line6 = new Line(l6x1, l6y1 ,l6x2, l6y2);

double l7x1=320, l7y1=95 ,l7x2=674, l7y2=95;
Line line7 = new Line(l7x1, l7y1 ,l7x2, l7y2);
double l8x1=726, l8y1=95 ,l8x2=750, l8y2=95;
Line line8 = new Line(l8x1, l8y1 ,l8x2, l8y2);
double l9x1=325, l9y1=260 ,l9x2=700, l9y2=260;
Line line9 = new Line(l9x1, l9y1 ,l9x2, l9y2);

double l10x1=700, l10y1=260 ,l10x2=700, l10y2=240;
Line line10 = new Line(l10x1, l10y1 ,l10x2, l10y2);
double l11x1=683, l11y1=240 ,l11x2=717, l11y2=240;
Line line11 = new Line(l11x1, l11y1 ,l11x2, l11y2);
double l12x1=700, l12y1=240 ,l12x2=700, l12y2=85;
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
        line6.setStrokeWidth(5);
        
        line7.setStroke(Color.DIMGRAY);
        line7.setStrokeWidth(5);
        
        line8.setStroke(Color.DIMGRAY);
        line8.setStrokeWidth(5);
        
        line9.setStroke(Color.DIMGRAY);
        line9.setStrokeWidth(3);
        
        line10.setStroke(Color.DIMGRAY);
        line10.setStrokeWidth(3);
        
        line11.setStroke(Color.DIMGRAY);
        line11.setStrokeWidth(5);
        
        line12.setStroke(Color.DIMGRAY);
        line12.setStrokeWidth(5);
         
        ///////////////////////////////
        
        //DRAWING FILLED CIRCLES
        Circle circle1 = new Circle(185,260,25);//SET THE CORDINATE AND RADIUS OF CIRCLE
        circle1.setFill(Color.GREY);
        
        Circle circle2 = new Circle(300,350,25);
        circle2.setFill(Color.GREY);
       
        ///////////////////////////////
        
        //DRAWING RING SHAPE
        arc1.setType(ArcType.OPEN);             //SETS THE VALUE OF THE PROPERTY TYPE
        arc1.setStrokeWidth(3);                 //SET THE WIDTH OF ARC
        arc1.setStroke(Color.DIMGRAY);          //SET THE COLOR OF ARC
        arc1.setStrokeType(StrokeType.INSIDE);  //RETURNS THE ENUM CINSTANT OF THIS TYPE WITH THE SPECIFIED NAME
        arc1.setFill(Color.WHITESMOKE);                     //SET THE FILLED TYPE OF ARC
        
        arc2.setType(ArcType.OPEN);
        arc2.setStrokeWidth(5);
        arc2.setStroke(Color.DIMGRAY);
        arc2.setStrokeType(StrokeType.INSIDE);
        arc2.setFill(null);
        
        arcl8.setType(ArcType.OPEN);
        arcl8.setStrokeWidth(5);
        arcl8.setStroke(Color.BLUE);
        arcl8.setStrokeType(StrokeType.INSIDE);
        arcl8.setFill(null);
        arcl8.setOpacity(0);
        
        arcl12.setType(ArcType.OPEN);
        arcl12.setStrokeWidth(5);
        arcl12.setStroke(Color.RED);
        arcl12.setStrokeType(StrokeType.INSIDE);
        arcl12.setFill(null);
        arcl12.setOpacity(0);

//**********************************************************     
//**********************************************************     
//**********************************************************     

        arc1.addEventHandler(MouseEvent.MOUSE_PRESSED, //add mouse pressed
                new EventHandler<MouseEvent>() {
                  public void handle(MouseEvent me2) {
                	  if(line3.getStartX() ==  line3.getEndX()){
                		    line3.setStartX(276);
                		    line3.setEndX(324);
                		    line3.setStartY(260);
                		    line3.setEndY(260);
                		    	collisionBoolean = true;
                		    	}
                	
                	  else if(line3.getStartY() ==  line3.getEndY()){
                		    
                		      line3.setStartX(300);
                		      line3.setEndX(300);
                		      line3.setStartY(236);
                		      line3.setEndY(284);
                		    collisionBoolean = false;
                		    	}
                
           }      
        });
        line3.addEventHandler(MouseEvent.MOUSE_PRESSED,//add mouse pressed
                new EventHandler<MouseEvent>() {
                  public void handle(MouseEvent me2) {
                	  if(line3.getStartX() ==  line3.getEndX()){
              		    line3.setStartX(276);
              		    line3.setEndX(324);
              		    line3.setStartY(260);
              		    line3.setEndY(260);
              		    	collisionBoolean = true;
              		    	}
              	
              	  else if(line3.getStartY() ==  line3.getEndY()){
              		    
              		      line3.setStartX(300);
              		      line3.setEndX(300);
              		      line3.setStartY(236);
              		      line3.setEndY(284);
              		    collisionBoolean = false;
              		    	}
                	  
                  }        
        });

//---------------------------------------------------------------------------------------------------------------------------                 
//---------------------------------------------------------------------------------------------------------------------------                    
        
        circle1.addEventHandler(MouseEvent.MOUSE_PRESSED,//add mouse pressed
                new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me1) {
                      
                     if(collisionBoolean){
              Timeline animation1 =
                new Timeline(new KeyFrame(Duration.millis(4), e ->DoubleSideLineXIncL11Lv4() ));
                 animation1.setCycleCount(17);
                 animation1.play();
                       
              Timeline animation2 =
                 new Timeline(new KeyFrame(Duration.millis(4), e ->OneSideLineYDecL12Lv4() ));
                 animation2.setCycleCount(155);
                 animation2.play();
                
                 Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(3), e ->moveArcL12() ));
                 animation3.setCycleCount(1000);
                 animation3.play();
               
              
                 FadeTransition ft1=
                    new FadeTransition(Duration.millis(1000), circle1 );
                    ft1.setToValue(0);
                    ft1.setAutoReverse(false);
                    ft1.setCycleCount(1);
                    ft1.setDelay(Duration.seconds(1));
                    
                FadeTransition ft2 = 
                    new FadeTransition(Duration.millis(1000), line1);
                    ft2.setToValue(0);
                    ft2.setAutoReverse(false);
                    ft2.setCycleCount(1);
                    ft2.setDelay(Duration.seconds(1));
                    
                FadeTransition ft3 = 
                    new FadeTransition(Duration.millis(1000), line9);
                    ft3.setToValue(0);
                    ft3.setAutoReverse(false);
                    ft3.setCycleCount(1);
                    ft3.setDelay(Duration.seconds(1));
                    
                FadeTransition ft4 = 
                    new FadeTransition(Duration.millis(1000), line10);
                    ft4.setToValue(0);
                    ft4.setAutoReverse(false);
                    ft4.setCycleCount(1);
                    ft4.setDelay(Duration.seconds(1));
                    
                FadeTransition ft5 =  //add fade transition to lines
                    new FadeTransition(Duration.millis(1000), line11);
                    ft5.setToValue(0);
                    ft5.setAutoReverse(false);
                    ft5.setCycleCount(1);
                    ft5.setDelay(Duration.seconds(1));
                
                FadeTransition ft6 = 
                new FadeTransition(Duration.millis(1000), line12);
                ft6.setToValue(0);
                ft6.setAutoReverse(false);
                ft6.setCycleCount(1);
                ft6.setDelay(Duration.seconds(1));
                
           
  //---------------------------------------------------------------------------------------------------------------------------                         
                                            
                ParallelTransition pt = new ParallelTransition(ft1,ft2,ft3,ft4,ft5,ft6);
                pt.play();              
                       
              
                }
                      } 
              });
        
        
 //////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////
circle2.addEventHandler(MouseEvent.MOUSE_PRESSED,//add mouse pressed
new EventHandler<MouseEvent>() {
public void handle(MouseEvent me1) {

if(!collisionBoolean){
Timeline animation1 =
new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineXDecL7Lv4() ));
animation1.setCycleCount(354);
animation1.play();

Timeline animation2 =
new Timeline(new KeyFrame(Duration.millis(3), e ->moveLineXLL8Lv4() ));
animation2.setCycleCount(406);
animation2.play();

Timeline animation3 =
new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineXDecL8Lv4() ));
animation3.setCycleCount(425);
animation3.play();

Timeline animation4 =
new Timeline(new KeyFrame(Duration.millis(3), e ->DoubleSideLineYIncL6Lv4() ));
animation4.setCycleCount(17);
animation4.play();

Timeline animation5 = 
new Timeline(new KeyFrame(Duration.millis(3), e ->MoveArc2() ));
animation5.setCycleCount(390);
animation5.play();
 

Timeline animation8 =
new Timeline(new KeyFrame(Duration.millis(3), e ->moveArcL8()));
animation8.setCycleCount(450);
animation8.play();




//----------------------------------------------------------------------------------------------------------                 
//---------------------------------------------------------------------------------------------------------------------------                    
FadeTransition ft1=
new FadeTransition(Duration.millis(1000), circle2 );
ft1.setToValue(0);
ft1.setAutoReverse(false);
ft1.setCycleCount(1);
ft1.setDelay(Duration.seconds(1));

FadeTransition ft2 = 
new FadeTransition(Duration.millis(1000), line2);
ft2.setToValue(0);
ft2.setAutoReverse(false);
ft2.setCycleCount(1);
ft2.setDelay(Duration.seconds(1));

FadeTransition ft3 = 
new FadeTransition(Duration.millis(1000), line4);
ft3.setToValue(0);
ft3.setAutoReverse(false);
ft3.setCycleCount(1);
ft3.setDelay(Duration.seconds(1));

FadeTransition ft4 = 
new FadeTransition(Duration.millis(1000), line5);
ft4.setToValue(0);
ft4.setAutoReverse(false);
ft4.setCycleCount(1);
ft4.setDelay(Duration.seconds(1));

FadeTransition ft5 = 
new FadeTransition(Duration.millis(1000), line6);
ft5.setToValue(0);
ft5.setAutoReverse(false);
ft5.setCycleCount(1);
ft5.setDelay(Duration.seconds(1));

FadeTransition ft6 = 
new FadeTransition(Duration.millis(1000), line7);
ft6.setToValue(0);
ft6.setAutoReverse(false);
ft6.setCycleCount(1);
ft6.setDelay(Duration.seconds(1));

FadeTransition ft7 = 
new FadeTransition(Duration.millis(1000), arc2);
ft7.setToValue(0);
ft7.setAutoReverse(false);
ft7.setCycleCount(1);
ft7.setDelay(Duration.seconds(1));

FadeTransition ft8 = 
new FadeTransition(Duration.millis(1000), line8);
ft8.setToValue(0);
ft8.setAutoReverse(false);
ft8.setCycleCount(1);
ft8.setDelay(Duration.seconds(1));

FadeTransition ft9=
new FadeTransition(Duration.millis(1000), arc1 );
ft9.setToValue(0);
ft9.setAutoReverse(false);
ft9.setCycleCount(1);
ft9.setDelay(Duration.seconds(1));

FadeTransition ft10=
new FadeTransition(Duration.millis(1000), line3 );
ft10.setToValue(0);
ft10.setAutoReverse(false);
ft10.setCycleCount(1);
ft10.setDelay(Duration.seconds(1));
//---------------------------------------------------------------------------------------------------------------------------                         

ParallelTransition pt = new ParallelTransition(ft1,ft2,ft3,ft4,ft5,ft6,ft7,ft8,ft9,ft10);
pt.play();              

}
} 
});



//**********************************************************     
//**********************************************************     
//**********************************************************     

        

  //**********************************************************     
  //**********************************************************     
  //**********************************************************
          

        

//**********************************************************     
//**********************************************************     
//***********************************

        root.getChildren().addAll(arc1 ,arc2 ,arcl8,arcl12,line12 ,line11 ,line10 ,line9 ,
        line8 ,line7 ,line6 ,line5 ,line4 ,line3 ,line2 ,line1 ,circle1 ,circle2  );

        //SET THE SCENE SIZE
        Scene scene = new Scene(root, 850, 450, Color.WHITESMOKE);

        stage.setTitle("LEVEL 4");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
   
    
    /////////////////////////////////////////////
    /////////////////////////////////////
    public void DoubleSideLineXIncL11Lv4() {collusion4();
     
    l11x1 -= 1;
       l11x2 += 1;
    line11.setStartX(l11x1);
    line11.setEndX(l11x2);
   
   
   
   
    
    }
    public void OneSideLineYDecL12Lv4() { collusion4();
   
    l12y2 += 1;
     line12.setEndY(l12y2);
      
    }
    

    public void moveArcL12( ) {collusion4();
  

   if((arcl12x1<=700) && (arcl12x1>=180)) {    
   arcl12x1 -= 1;
   arcl12.setCenterX(arcl12x1);}
   }
/////////////////////////////////
/////////////////////////////////
    public void OneSideLineXDecL7Lv4() {collusion4();
      
l7x2 -= 1;
line7.setEndX(l7x2); 
}
 
 
 public void moveLineXLL8Lv4() {collusion4();
l8x1 -= 1;
    l8x2 -= 1;
    line8.setStartX(l8x1);
line8.setEndX(l8x2);
}

//////////////////////////////////////////

public void OneSideLineXDecL8Lv4() {collusion4();
  if( l8x1<=321) {
l8x2 -= 1;
line8.setEndX(l8x2); 
}
}

public void DoubleSideLineYIncL6Lv4() {collusion4();
   l6y1 -= 1;
   l6y2 += 1;
   
line6.setStartY(l6y1);
line6.setEndY(l6y2);
}


public void MoveArc2() { collusion4();
   
   if((arc2x1<=700) && (arc2x1>=295)) {    
   arc2x1 -= 1;
   arc2.setCenterX(arc2x1);
   }
   
   if(arc2x1==m) {
  
   m-=1;
   arc2deg-=4;;
   arc2.setLength(arc2deg);}
   
   }


public void moveArcL8( ) {collusion4();
   
   
   if((arcl8x1<=726) && (arcl8x1>=250)) {    
  arcl8x1 -= 1;
arcl8.setCenterX(arcl8x1);
   }    
   
}
public void collusion4() {
if(arcl12.getCenterX() == arcl8.getCenterX()) {
System.exit(1);
}
}
}