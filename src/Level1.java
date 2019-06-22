
//MUHAMMET YASÝN TUFAN-150116013
//VAROL KOÇOÐLU-150116045

import java.awt.Button;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.*;


public class Level1 extends Application {

	private Timeline animation;
	int eventh1=0 , eventh2=0 ;
	double m =225 , v=180;

	double arc1x1=500 , arc1y1=100 , arc1wei=28 , arc1hei=28, arc1rot=0 , arc1deg=180; //Creating arcs
	Arc arc1 = new Arc(arc1x1 , arc1y1 , arc1wei , arc1hei, arc1rot , arc1deg);

	double arc2x1=500 , arc2y1=100 , arc2wei=28 , arc2hei=28, arc2rot=0 , arc2deg=180;
	Arc arc2 = new Arc(arc2x1 , arc2y1 , arc2wei , arc2hei, arc2rot , arc2deg);

	double arc3x1=526 , arc3y1=100 , arc3wei=28 , arc3hei=28, arc3rot=0 , arc3deg=180;
	Arc arc3 = new Arc(arc3x1 , arc3y1 , arc3wei , arc3hei, arc3rot , arc3deg);

	double c1x1=625 , c1y1=275 , c1r1=25; 			//Creating circles
	Circle circle1 = new Circle(c1x1 , c1y1 ,c1r1);

	double c2x1=500 , c2y1=350 , c2r1=25;
	Circle circle2 = new Circle(c2x1 , c2y1 ,c2r1);

	double l1x1=180, l1y1=275 ,l1x2=625, l1y2=275;		//Creating lines
	Line line1 = new Line(l1x1, l1y1 ,l1x2, l1y2);

	double l2x1=180, l2y1=100 ,l2x2=180, l2y2=275;
	Line line2 = new Line(l2x1, l2y1 ,l2x2, l2y2);

	double l3x1=500, l3y1=325 ,l3x2=500, l3y2=243;
	Line line3 = new Line(l3x1, l3y1 ,l3x2, l3y2);

	double l4x1=483, l4y1=240 ,l4x2=517, l4y2=240;
	Line line4 = new Line(l4x1, l4y1 ,l4x2, l4y2);

	double l5x1=500, l5y1=240 ,l5x2=500, l5y2=95;
	Line line5 = new Line(l5x1, l5y1 ,l5x2, l5y2);

	double l6x1=200, l6y1=100 ,l6x2=180, l6y2=100;
	Line line6 = new Line(l6x1, l6y1 ,l6x2, l6y2);

	double l7x1=200, l7y1=83 ,l7x2=200, l7y2=117;
	Line line7 = new Line(l7x1, l7y1 ,l7x2, l7y2);

	double l8x1=474, l8y1=100 ,l8x2=200, l8y2=100;
	Line line8 = new Line(l8x1, l8y1 ,l8x2, l8y2);

	double l9x1=526, l9y1=100 ,l9x2=600, l9y2=100;
	Line line9 = new Line(l9x1, l9y1 ,l9x2, l9y2);





    @Override
    public void start(Stage stage) {







        initUI(stage);

    }

    private void initUI(Stage stage) {

        Pane root = new Pane();

        line1.setStroke(Color.DIMGRAY);           			//SET THE COLOR OF LINE
        line1.setStrokeWidth(3);                 				 //SET THE WIDTH OF LINE

        line2.setStroke(Color.DIMGRAY);
        line2.setStrokeWidth(3);

        line3.setStroke(Color.DIMGRAY);
        line3.setStrokeWidth(3);

        line4.setStroke(Color.DIMGRAY);
        line4.setStrokeWidth(5);

        line5.setStroke(Color.DIMGRAY);
        line5.setStrokeWidth(5);

        line6.setStroke(Color.DIMGRAY);
        line6.setStrokeWidth(3);

        line7.setStroke(Color.DIMGRAY);
        line7.setStrokeWidth(5);

        line8.setStroke(Color.DIMGRAY);
        line8.setStrokeWidth(5);

        line9.setStroke(Color.DIMGRAY);
        line9.setStrokeWidth(5);

        circle1.setFill(Color.GREY);		//DRAWING FILLED CIRCLES

        circle2.setFill(Color.GREY);

        											//DRWING SEMICIRCLES
        arc1.setType(ArcType.OPEN);                 //SETS THE VALUE OF THE PROPERTY TYPE
        arc1.setStrokeWidth(5);                    //SET THE WIDTH OF ARC
        arc1.setStroke(Color.DIMGRAY);              //SET THE COLOR OF ARC
        arc1.setStrokeType(StrokeType.INSIDE);      //RETURNS THE ENUM CINSTANT OF THIS TYPE WITH THE SPECIFIED NAME
        arc1.setFill(null);

        arc2.setType(ArcType.OPEN);                 //SETS THE VALUE OF THE PROPERTY TYPE
        arc2.setStrokeWidth(5);                    //SET THE WIDTH OF ARC
        arc2.setStroke(Color.RED);              //SET THE COLOR OF ARC
        arc2.setStrokeType(StrokeType.INSIDE);      //RETURNS THE ENUM CINSTANT OF THIS TYPE WITH THE SPECIFIED NAME
        arc2.setFill(null);
        arc2.setOpacity(0);

        arc3.setType(ArcType.OPEN);                 //SETS THE VALUE OF THE PROPERTY TYPE
        arc3.setStrokeWidth(5);                    //SET THE WIDTH OF ARC
        arc3.setStroke(Color.BLUE);              //SET THE COLOR OF ARC
        arc3.setStrokeType(StrokeType.INSIDE);      //RETURNS THE ENUM CINSTANT OF THIS TYPE WITH THE SPECIFIED NAME
        arc3.setFill(null);
        arc3.setOpacity(0);


//****************************************************************************************************************************************************************************
//****************************************************************************************************************************************************************************
//****************************************************************************************************************************************************************************



//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------

        circle1.addEventHandler(MouseEvent.MOUSE_PRESSED,	//Creating mouse press button with circle
                new EventHandler<MouseEvent>() {


                  public void handle(MouseEvent me2) {


                	  if(eventh1==0) {
                		  eventh1++;
                Timeline animation3 =
                	new Timeline(new KeyFrame(Duration.millis(3), e ->DoubleSideLineYIncL1() ));//Creating timing for moving methods
               		 animation3.setCycleCount(17);
               		 animation3.play();

                Timeline animation4 =
                	new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineXDecL1() ));
               		 animation4.setCycleCount(274);
               		 animation4.play();

               	Timeline animation5 =
               		new Timeline(new KeyFrame(Duration.millis(3), e ->MoveArcL1() ));
              		 animation5.setCycleCount(1000);
              		 animation5.play();

              	Timeline animation6 =
              		new Timeline(new KeyFrame(Duration.millis(3), e ->moveLineXLL1() ));
             		 animation6.setCycleCount(326);
             		 animation6.play();

             	Timeline animation7 =
                      new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineXDec2L1() ));
                      animation7.setCycleCount(372);
                      animation7.play();






                Timeline animation8 =
                      new Timeline(new KeyFrame(Duration.millis(3), e ->moveArc3L1()));
                      animation8.setCycleCount(335);
                      animation8.play();


                FadeTransition ft5=
                      new FadeTransition(Duration.millis(1000), circle1 );//Creating timing for fading
                      ft5.setToValue(0);
                      ft5.setAutoReverse(false);
                      ft5.setCycleCount(1);
                      ft5.setDelay(Duration.seconds(1));
                 FadeTransition ft6 =
                       new FadeTransition(Duration.millis(1000), line6);
                 		ft6.setToValue(0);
                        ft6.setAutoReverse(false);
                        ft6.setCycleCount(1);
                        ft6.setDelay(Duration.seconds(1));
                 FadeTransition ft7 =
                        new FadeTransition(Duration.millis(1000), line7);
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

                  FadeTransition ft9 =
                        new FadeTransition(Duration.millis(1000), arc1);//Creating fade transition
                        ft9.setToValue(0);
                        ft9.setAutoReverse(false);
                        ft9.setCycleCount(1);
                        ft9.setDelay(Duration.seconds(1));

                   FadeTransition ft10 =
                        new FadeTransition(Duration.millis(1000), line9);
                        ft10.setToValue(0);
                        ft10.setAutoReverse(false);
                        ft10.setCycleCount(1);
                        ft10.setDelay(Duration.seconds(1));
                   FadeTransition ft11 =
                        new FadeTransition(Duration.millis(1000), line2);
                   		ft11.setToValue(0);
                   		ft11.setAutoReverse(false);
                   		ft11.setCycleCount(1);
                   		ft11.setDelay(Duration.seconds(1));
                   FadeTransition ft12 =
                        new FadeTransition(Duration.millis(1000), line1);
                   		ft12.setToValue(0);
                        ft12.setAutoReverse(false);
                       	ft12.setCycleCount(1);
                        ft12.setDelay(Duration.seconds(1));

 //---------------------------------------------------------------------------------------------------------------------------

                  	ParallelTransition pt = new ParallelTransition(ft5,ft6,ft7,ft8,ft9,ft10,ft11,ft12);
                        pt.play();

                  }}


        });

//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------

        circle2.addEventHandler(MouseEvent.MOUSE_PRESSED,//Creating mouse clicked
                new EventHandler<MouseEvent>() {
                  public void handle(MouseEvent me2) {
                	  if(eventh2==0) {
                		  eventh2++;


                  Timeline animation1 = new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineYDecL1() ));
                	   	 animation1.setCycleCount(145);
                	   	 animation1.play();

                  Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(3), e ->DoubleSideLineXIncL1() ));
                  		 animation2.setCycleCount(17);
                  		 animation2.play();

                  Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(3), e ->moveArc2L1() ));
               	   	     animation3.setCycleCount(1000);
               	   	     animation3.play();

//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
                  FadeTransition ft1=
                       new FadeTransition(Duration.millis(1000), circle2 );
                    	 ft1.setToValue(0);
                    	 ft1.setAutoReverse(false);
                    	 ft1.setCycleCount(1);
                    	 ft1.setDelay(Duration.seconds(1));
                  FadeTransition ft2 =
                         new FadeTransition(Duration.millis(1000), line3);
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

//---------------------------------------------------------------------------------------------------------------------------

                   ParallelTransition pt = new ParallelTransition(ft1,ft2,ft3,ft4);
                   		 pt.play();
                  }}
                });

//****************************************************************************************************************************************************************************
//****************************************************************************************************************************************************************************
//****************************************************************************************************************************************************************************

        Circle b = new Circle();

        root.getChildren().addAll(arc1 ,arc2 ,arc3,line9 ,line8 ,line7 ,line6 ,line5 ,line4 ,line3 ,line2 ,line1 ,circle1 ,circle2,b);

   	   b.setCenterX(800);

		b.setCenterY(420);
		b.setRadius(30);
		b.setStroke(Color.BLACK);
		b.setFill(Color.DARKSLATEGREY);
		b.setOnMouseClicked(e -> {



		});
        //SET THE SCENE SIZE
        Scene scene = new Scene(root, 850, 450, Color.WHITESMOKE);

        stage.setTitle("LEVEL 1");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

   public static void main(String[] args) {
        launch(args);
    }

//****************************************************************************************************************************************************************************
//****************************************************************************************************************************************************************************
//******************************************************************************************************************************************************************************
   public void MoveArcL1() {//moving methods
	   CollusionL1();
	   if((arc1x1<501) && (arc1x1>=180)) {	 CollusionL1();
		   arc1x1 -= 1;
		   arc1.setCenterX(arc1x1);
	   }

	   if(arc1x1==m) {

		   m-=1;
		   arc1deg-=4;CollusionL1();
		   arc1.setLength(arc1deg);}

	   }

//////////////////////////////////////////

   public void OneSideLineYDecL1() {//moving methods
	   l5y2 += 1;
	    line5.setEndY(l5y2);CollusionL1();
	    }

//////////////////////////////////////////

   public void DoubleSideLineXIncL1() {
	  	l4x1 -= 1;
	   	l4x2 += 1;
		line4.setStartX(l4x1);CollusionL1();
		line4.setEndX(l4x2);
		}

//////////////////////////////////////////

   public void DoubleSideLineYIncL1() {//moving methods
	   l7y1 -= 1;
	   l7y2 += 1;

		line7.setStartY(l7y1);CollusionL1();
		line7.setEndY(l7y2);
		}

//////////////////////////////////////////

   public void OneSideLineXDecL1() {
	 	l8x1 -= 1;
		line8.setStartX(l8x1);CollusionL1();
		}

//////////////////////////////////////////

   public void moveLineXLL1() {CollusionL1();
		l9x1 -= 1;
	   	l9x2 -= 1;
	   	line9.setStartX(l9x1);
		line9.setEndX(l9x2);
		CollusionL1();
   }

//////////////////////////////////////////

   public void OneSideLineXDec2L1() {CollusionL1();//moving methods
	   if( l9x1<=225) {
			l9x2 -= 1;
			line9.setEndX(l9x2);
			}
   }

//////////////////////////////////////////

      public void moveArc2L1( ) {CollusionL1();//moving methods


	   if((arc2x1<501) && (arc2x1>=180)) {
		   arc2x1 -= 1;
		   arc2.setCenterX(arc2x1);}
		 //  System.out.println(arc2.getCenterY());
		   }

//////////////////////////////////////////

	   public void moveArc3L1( ) {CollusionL1();//moving methods


		   if((arc3x1<600) && (arc3x1>=180)) {
			   arc3x1 -= 1;
			   arc3.setCenterX(arc3x1);
			 //  System.out.println(arc2.getCenterY());
			   }
}

//////////////////////////////////////////

  public void CollusionL1() {
	   if(arc2.getCenterX() == arc3.getCenterX()) {
		 System.exit(1);
	   }
   }

//////////////////////////////////////////

}