//MUHAMMET YASÝN TUFAN-150116013
//VAROL KOÇOÐLU-150116045

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



public class Level3 extends Application {

	int eventh1 = 0 ,eventh2=0 , eventh3=0 , m=445 , m4=250 ;

	double arc1x1=700 , arc1y1=95 , arc1wei=28 , arc1hei=28, arc1rot=0 , arc1deg=180;//Creating arcs
	Arc arc1 = new Arc(arc1x1 , arc1y1 , arc1wei , arc1hei, arc1rot , arc1deg);

	double arc2x1=700 , arc2y1=165 , arc2wei=28 , arc2hei=28, arc2rot=270 , arc2deg=180;
	Arc arc2 = new Arc(arc2x1 , arc2y1 , arc2wei , arc2hei, arc2rot , arc2deg);

	double arcl14Ux1=700 , arcl14Uy1=95 , arcl14Uwei=28 , arcl14Uhei=28, arcl14Urot=0 , arcl14Udeg=180;
	Arc arcl14U = new Arc(arcl14Ux1 ,arcl14Uy1 , arcl14Uwei , arcl14Uhei,arcl14Urot , arcl14Udeg);

	double arcl12x1=726 , arcl12y1=95 , arcl12wei=28 , arcl12hei=28, arcl12rot=0 , arcl12deg=180;
	Arc arcl12 = new Arc(arcl12x1 ,arcl12y1 , arcl12wei , arcl12hei,arcl12rot , arcl12deg);

	double arcl15x1=700 , arcl15y1=165 ,arcl15wei=28 ,arcl15hei=28,arcl15rot=270 , arcl15deg=180;
	Arc arcl15 = new Arc(arcl15x1 , arcl15y1 , arcl15wei , arcl15hei, arc2rot , arcl15deg);

	double arcl14Dx1=700 ,arcl14Dy1=139 , arcl14Dwei=28 , arcl14Dhei=28, arcl14Drot=270 , arcl14Ddeg=180;
	Arc arcl14D = new Arc(arcl14Dx1 ,arcl14Dy1 , arcl14Dwei , arcl14Dhei, arcl14Drot , arcl14Ddeg);

	double c1x1=160 , c1y1=270 , c1r1=25; //Creating circle
	Circle circle1 = new Circle(c1x1 , c1y1 ,c1r1);

	double c2x1=260 , c2y1=325 , c2r1=25;
	Circle circle2 = new Circle(c2x1 , c2y1 ,c2r1);

	double c3x1=400 , c3y1=400 , c3r1=25;
	Circle circle3 = new Circle(c3x1 , c3y1 ,c3r1);

	double l1x1=185, l1y1=270 ,l1x2=700, l1y2=270;//Creating line
	Line line1 = new Line(l1x1, l1y1 ,l1x2, l1y2);

	double l2x1=260, l2y1=325 ,l2x2=500, l2y2=325;
	Line line2 = new Line(l2x1, l2y1 ,l2x2, l2y2);

	double l3x1=400, l3y1=375 ,l3x2=400, l3y2=95;
	Line line3 = new Line(l3x1, l3y1 ,l3x2, l3y2);

	double l4x1=500, l4y1=325 ,l4x2=500, l4y2=165;
	Line line4 = new Line(l4x1, l4y1 ,l4x2, l4y2);

	double l5x1=400, l5y1=95 ,l5x2=420, l5y2=95;
	Line line5 = new Line(l5x1, l5y1 ,l5x2, l5y2);

	double l6x1=500, l6y1=165 ,l6x2=520, l6y2=165;
	Line line6 = new Line(l6x1, l6y1 ,l6x2, l6y2);

	double l7x1=700, l7y1=270 ,l7x2=700, l7y2=250;
	Line line7 = new Line(l7x1, l7y1 ,l7x2, l7y2);

	double l8x1=683, l8y1=250 ,l8x2=717, l8y2=250;
	Line line8 = new Line(l8x1, l8y1 ,l8x2, l8y2);

	double l9x1=520, l9y1=148 ,l9x2=520, l9y2=182;
	Line line9 = new Line(l9x1, l9y1 ,l9x2, l9y2);

	double l10x1=420, l10y1=78 ,l10x2=420, l10y2=112;
	Line line10 = new Line(l10x1, l10y1 ,l10x2, l10y2);

	double l11x1=420, l11y1=95 ,l11x2=674, l11y2=95;
	Line line11 = new Line(l11x1, l11y1 ,l11x2, l11y2);

	double l12x1=726, l12y1=95 ,l12x2=765, l12y2=95;
	Line line12 = new Line(l12x1, l12y1 ,l12x2, l12y2);

	double l13x1=700, l13y1=250 ,l13x2=700, l13y2=191;
	Line line13 = new Line(l13x1, l13y1 ,l13x2, l13y2);

	double l14x1=700, l14y1=139 ,l14x2=700, l14y2=85;
	Line line14 = new Line(l14x1, l14y1 ,l14x2, l14y2);

	double l15x1=520, l15y1=165 ,l15x2=710, l15y2=165;
	Line line15 = new Line(l15x1, l15y1 ,l15x2, l15y2);


    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        Pane root = new Pane();

        //DRAW HORIZONTAL AND VERTICAL LINES

        line1.setStroke(Color.DIMGRAY);       //SET THE COLOR OF LINE
        line1.setStrokeWidth(3);              //SET THE WIDTH OF LINE

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
        line7.setStrokeWidth(3);

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

        line13.setStroke(Color.DIMGRAY);
        line13.setStrokeWidth(5);

        line14.setStroke(Color.DIMGRAY);
        line14.setStrokeWidth(5);

        line15.setStroke(Color.DIMGRAY);
        line15.setStrokeWidth(5);

        ///////////////////////////////

        //DRAWING FILLED CIRCLES
        Circle circle1 = new Circle(160,270,25);//SET THE CORDINATE AND RADIUS OF CIRCLE
        circle1.setFill(Color.GREY);           //SET THE COLOR OF CIRCLE

        Circle circle2 = new Circle(260,325,25);
        circle2.setFill(Color.GREY);

        Circle circle3 = new Circle(400,400,25);
        circle3.setFill(Color.GREY);


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

        arcl14U.setType(ArcType.OPEN);
        arcl14U.setStrokeWidth(5);
        arcl14U.setStroke(Color.RED);
        arcl14U.setStrokeType(StrokeType.INSIDE);
        arcl14U.setFill(null);
        arcl14U.setOpacity(0);

        arcl12.setType(ArcType.OPEN);
        arcl12.setStrokeWidth(5);
        arcl12.setStroke(Color.BLUE);
        arcl12.setStrokeType(StrokeType.INSIDE);
        arcl12.setFill(null);
        arcl12.setOpacity(0);

        arcl14D.setType(ArcType.OPEN);
        arcl14D.setStrokeWidth(5);
        arcl14D.setStroke(Color.BLUE);
        arcl14D.setStrokeType(StrokeType.INSIDE);
        arcl14D.setFill(null);
        arcl14D.setOpacity(0);

        arcl15.setType(ArcType.OPEN);
        arcl15.setStrokeWidth(5);
        arcl15.setStroke(Color.RED);
        arcl15.setStrokeType(StrokeType.INSIDE);
        arcl15.setFill(null);
        arcl15.setOpacity(0);

//****************************************************************************************************************************************************************************
//****************************************************************************************************************************************************************************
//****************************************************************************************************************************************************************************


//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
      circle1.addEventHandler(MouseEvent.MOUSE_PRESSED,
            new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me1) {

      if(eventh1==0) {
    	  eventh1++;

          Timeline animation1 =
            new Timeline(new KeyFrame(Duration.millis(3), e ->DoubleSideLineXIncL8Lv3() ));
             animation1.setCycleCount(17);
             animation1.play();

          Timeline animation2 =
             new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineYDecL5Lv3() ));
             animation2.setCycleCount(59);
             animation2.play();

          Timeline animation3 =
          new Timeline(new KeyFrame(Duration.millis(3), e ->moveLineYL14Lv3() ));
          animation3.setCycleCount(112);
          animation3.play();

          Timeline animation4 =
          new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineYDecL14Lv3() ));
          animation4.setCycleCount(159);
          animation4.play();


          Timeline animation5 =
          new Timeline(new KeyFrame(Duration.millis(3), e ->moveArc1L14() ));
          animation5.setCycleCount(1000);
          animation5.play();

          Timeline animation6 =
  				new Timeline(new KeyFrame(Duration.millis(3), e ->MoveArc2() ));
  				animation6.setCycleCount(195);
  				animation6.play();


  		Timeline animation12 =
		new Timeline(new KeyFrame(Duration.millis(3), e ->MoveArcl14D() ));
		animation12.setCycleCount(150);
		animation12.play();
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
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
                new FadeTransition(Duration.millis(1000), line7);
                ft3.setToValue(0);
                ft3.setAutoReverse(false);
                ft3.setCycleCount(1);
                ft3.setDelay(Duration.seconds(1));

            FadeTransition ft4 =
                new FadeTransition(Duration.millis(1000), line8);
                ft4.setToValue(0);
                ft4.setAutoReverse(false);
                ft4.setCycleCount(1);
                ft4.setDelay(Duration.seconds(1));

            FadeTransition ft5 =
                new FadeTransition(Duration.millis(1000), line13);
                ft5.setToValue(0);
                ft5.setAutoReverse(false);
                ft5.setCycleCount(1);
                ft5.setDelay(Duration.seconds(1));

            FadeTransition ft6 =
            new FadeTransition(Duration.millis(1000), arc2);
            ft6.setToValue(0);
            ft6.setAutoReverse(false);
            ft6.setCycleCount(1);
            ft6.setDelay(Duration.seconds(1));

        FadeTransition ft7 =
            new FadeTransition(Duration.millis(1000), line14);
            ft7.setToValue(0);
            ft7.setAutoReverse(false);
            ft7.setCycleCount(1);
            ft7.setDelay(Duration.seconds(1));
//---------------------------------------------------------------------------------------------------------------------------

            ParallelTransition pt = new ParallelTransition(ft1,ft2,ft3,ft4,ft5,ft6,ft7);
            pt.play();

          }
            }
          		});


//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------

      circle2.addEventHandler(MouseEvent.MOUSE_PRESSED,
              new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me2) {

              	  if(eventh2==0) {
              		  eventh2++;
              Timeline animation3 =
              	new Timeline(new KeyFrame(Duration.millis(3), e ->DoubleSideLineYIncL9Lv3() ));
             		 animation3.setCycleCount(17);
             		 animation3.play();

              Timeline animation4 =
              	new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineXDecL15Lv3() ));
             		 animation4.setCycleCount(190);
             		 animation4.play();



				Timeline animation6 =
				new Timeline(new KeyFrame(Duration.millis(3), e ->MoveArcl15() ));
				animation6.setCycleCount(195);
				animation6.play();


//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
              FadeTransition ft5=
                    new FadeTransition(Duration.millis(1000), circle2 );
                    ft5.setToValue(0);
                    ft5.setAutoReverse(false);
                    ft5.setCycleCount(1);
                    ft5.setDelay(Duration.seconds(1));
               FadeTransition ft6 =
                     new FadeTransition(Duration.millis(1000), line2);
               		ft6.setToValue(0);
                      ft6.setAutoReverse(false);
                      ft6.setCycleCount(1);
                      ft6.setDelay(Duration.seconds(1));
               FadeTransition ft7 =
                      new FadeTransition(Duration.millis(1000), line4);
               		ft7.setToValue(0);
               		ft7.setAutoReverse(false);
               		ft7.setCycleCount(1);
               		ft7.setDelay(Duration.seconds(1));
                FadeTransition ft8 =
                      new FadeTransition(Duration.millis(1000), line6);
                		ft8.setToValue(0);
                		ft8.setAutoReverse(false);
                		ft8.setCycleCount(1);
                		ft8.setDelay(Duration.seconds(1));

                FadeTransition ft9 =
                      new FadeTransition(Duration.millis(1000), line9);
                      ft9.setToValue(0);
                      ft9.setAutoReverse(false);
                      ft9.setCycleCount(1);
                      ft9.setDelay(Duration.seconds(1));

                 FadeTransition ft10 =
                      new FadeTransition(Duration.millis(1000), line15);
                      ft10.setToValue(0);
                      ft10.setAutoReverse(false);
                      ft10.setCycleCount(1);
                      ft10.setDelay(Duration.seconds(1));

//---------------------------------------------------------------------------------------------------------------------------

                	ParallelTransition pt = new ParallelTransition(ft5,ft6,ft7,ft8,ft9,ft10);
                      pt.play();

                }}


      });
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////
	 circle3.addEventHandler(MouseEvent.MOUSE_PRESSED,
              new EventHandler<MouseEvent>() {
              public void handle(MouseEvent me1) {

        if(eventh3==0) {
                   eventh3++;

            Timeline animation1 =
              new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineXDecL7Lv4() ));
               animation1.setCycleCount(254);
               animation1.play();

            Timeline animation2 =
               new Timeline(new KeyFrame(Duration.millis(3), e ->moveLineXLL8Lv4() ));
               animation2.setCycleCount(302);
               animation2.play();

               Timeline animation3 =
               new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineXDecL8Lv4() ));
               animation3.setCycleCount(300);
               animation3.play();



            Timeline animation5 =
            new Timeline(new KeyFrame(Duration.millis(3), e ->DoubleSideLineYIncL6Lv4() ));
            animation5.setCycleCount(17);
            animation5.play();

            Timeline animation6 =
                    new Timeline(new KeyFrame(Duration.millis(3), e ->MoveArc1()));
                    animation6.setCycleCount(335);
                    animation6.play();
             Timeline animation7 =
                      new Timeline(new KeyFrame(Duration.millis(3), e ->moveArcL12() ));
                      animation7.setCycleCount(1000);
                      animation7.play();
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
              FadeTransition ft1=
                  new FadeTransition(Duration.millis(1000), circle3 );
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
                  new FadeTransition(Duration.millis(1000), line5);
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

              FadeTransition ft5 =
                  new FadeTransition(Duration.millis(1000), line11);
                  ft5.setToValue(0);
                  ft5.setAutoReverse(false);
                  ft5.setCycleCount(1);
                  ft5.setDelay(Duration.seconds(1));

              FadeTransition ft6 =
              new FadeTransition(Duration.millis(1000), arc1);
              ft6.setToValue(0);
              ft6.setAutoReverse(false);
              ft6.setCycleCount(1);
              ft6.setDelay(Duration.seconds(1));

              FadeTransition ft7 =
              new FadeTransition(Duration.millis(1000), line12);
              ft7.setToValue(0);
              ft7.setAutoReverse(false);
              ft7.setCycleCount(1);
              ft7.setDelay(Duration.seconds(1));
//---------------------------------------------------------------------------------------------------------------------------

              ParallelTransition pt = new ParallelTransition(ft1,ft2,ft3,ft4,ft5,ft6,ft7);
              pt.play();

            }
              }
            		});



//****************************************************************************************************************************************************************************
//****************************************************************************************************************************************************************************
//****************************************************************************************************************************************************************************
	   Circle b = new Circle();
        root.getChildren().addAll(arc1 ,arc2 ,arcl12,arcl14U,arcl15,arcl14D, line15 ,line14 ,line13 ,line12 ,line11 ,
        		line10 ,line9 ,line8 ,line7 ,line6 ,line5 ,line4 ,line3 ,line2 ,line1 ,circle1 ,circle2 ,circle3 ,b);
        b.setCenterX(800);
      	 
		b.setCenterY(420);
		b.setRadius(30);
		b.setStroke(Color.BLACK);
		b.setFill(Color.DARKSLATEGREY);
		b.setOnMouseClicked(e -> {

  			
  				Level3 next = new Level3();
            	next.start(stage);
            	
		});
        //SET THE SCENE SIZE
        Scene scene = new Scene(root, 850, 450, Color.WHITESMOKE);

        stage.setTitle("LEVEL 3");
       // stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////
    public static void main(String[] args) {
        launch(args);
    }
    public void DoubleSideLineXIncL8Lv3() {collusion();
    	l8x1 -= 1;
    	l8x2 += 1;
    	line8.setStartX(l8x1);
    	line8.setEndX(l8x2);
    }

    public void OneSideLineYDecL5Lv3() {collusion();
 	   l13y2 += 1;
 	    line13.setEndY(l13y2);
 	    }

    public void moveLineYL14Lv3() {collusion();
    	l14y1 += 1;
       	l14y2 += 1;
       	line14.setStartY(l14y1);
    	line14.setEndY(l14y2);

        }

     public void OneSideLineYDecL14Lv3() {collusion();
        	if(l14y1>=250)
        	{l14y2 += 1;
        	line14.setEndY(l14y2);
        	}
        }

     public void MoveArc2() { collusion();


  	   if((arc2y1<275) && (arc2y1>=140)) {
  	   arc2y1 += 1;
  	   arc2.setCenterY(arc2y1);
  	   }

  	   if(arc2y1==m4) {

  		   m4+=1;
  		   arc2deg-=7;
  		   arc2.setLength(arc2deg);}


  	   }
     public void MoveArcl14D() {collusion();

	   if((arcl14Dy1<350) && (arcl14Dy1>=69)) {
		   arcl14Dy1 += 1;
		   arcl14D.setCenterY(arcl14Dy1);
	   }}


//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////
     public void OneSideLineXDecL15Lv3() {collusion();
 	 	l15x2 -= 1;
 		line15.setEndX(l15x2);
 		}
     public void DoubleSideLineYIncL9Lv3() {collusion();
  	   l9y1 -= 1;
  	   l9y2 += 1;

  		line9.setStartY(l9y1);
  		line9.setEndY(l9y2);
  		}


	   public void MoveArcl15() {
		   collusion();
	   if((arcl15y1<300) && (arcl15y1>=95)) {
		   arcl15y1 += 1;
		   arcl15.setCenterY(arcl15y1);
	   }
	   }

//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////
     public void OneSideLineXDecL7Lv4() {collusion();

  			l11x2 -= 1;
  			line11.setEndX(l11x2);

  }


     public void moveLineXLL8Lv4() {collusion();

    	 l12x1 -= 1;
	   	l12x2 -= 1;
	   	line12.setStartX(l12x2);
		line12.setEndX(l12x1);


}

//////////////////////////////////////////

public void OneSideLineXDecL8Lv4() {collusion();
	if(l12x2<=470) {
			l12x1 -= 1;
			line12.setStartX(l12x1);
			}
}

public void DoubleSideLineYIncL6Lv4() {collusion();
	   l10y1 -= 1;
	   l10y2 += 1;

		line10.setStartY(l10y1);
		line10.setEndY(l10y2);
		}

public void moveArcL12( ) {collusion();


if((arcl12x1<750) && (arcl12x1>=420)) {
	arcl12x1 -= 1;
	   arcl12.setCenterX(arcl12x1);

	   }

}
public void moveArc1L14( ) {collusion();


if((arcl14Ux1<750) && (arcl14Ux1>=30)) {
	arcl14Ux1 -= 1;
	arcl14U.setCenterX(arcl14Ux1);

	   }

}

public void MoveArc1() { collusion();

	   if((arc1x1<725) && (arc1x1>395)) {
		   arc1x1 -= 1;
		   arc1.setCenterX(arc1x1);

	   }

	   if(arc1x1==m) {

		   m-=1;
		   arc1deg-=4;
		   arc1.setLength(arc1deg);}

	   }
public void collusion() {
	if(arcl14D.getCenterY()==arcl15.getCenterY()) {
		System.exit(0);
	}

	if(arcl14U.getCenterX()==arcl12.getCenterX()) {
		System.exit(2);
	}
}
}