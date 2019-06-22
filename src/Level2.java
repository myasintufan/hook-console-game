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
import javafx.scene.shape.*;




public class Level2 extends Application {
	int eventh1 =0,eventh2 =0,eventh3 =0,eventh4 =0;
	int m1=250, m2=250,m3=250,m4=250,m5=250,m6=250,m7=620;
	
	double arc1x1=400 , arc1y1=200 , arc1wei=28 , arc1hei=28, arc1rot=0 , arc1deg=180;  //Creating arcs
	Arc arc1 = new Arc(arc1x1 , arc1y1 , arc1wei , arc1hei, arc1rot , arc1deg);
	
	double arc2x1=300 , arc2y1=200 , arc2wei=28 , arc2hei=28, arc2rot=90 , arc2deg=180; 
	Arc arc2 = new Arc(arc2x1 , arc2y1 , arc2wei , arc2hei, arc2rot , arc2deg);
	
	double arc3x1=300 , arc3y1=95 , arc3wei=28 , arc3hei=28, arc3rot=270 , arc3deg=180; 
	Arc arc3 = new Arc(arc3x1 , arc3y1 , arc3wei , arc3hei, arc3rot , arc3deg);
	
	double arcl9x1=300 , arcl9y1=95 , arcl9wei=28 , arcl9hei=28, arcl9rot=270 , arcl9deg=180; 
	Arc arcl9 = new Arc(arcl9x1 , arcl9y1 , arcl9wei , arcl9hei, arcl9rot , arcl9deg);
	
	double arcl17x1=300 , arcl17y1=69 , arcl17wei=28 , arcl17hei=28, arcl17rot=270 , arcl17deg=180; 
	Arc arcl17 = new Arc(arcl17x1 , arcl17y1 , arcl17wei , arcl17hei, arcl17rot , arcl17deg);
	
	double arcl13Lx1=300 , arcl13Ly1=200 ,arcl13Lwei=28 , arcl13Lhei=28, arcl13Lrot=90 , arcl13Ldeg=180; 
	Arc arcl13L = new Arc(arcl13Lx1 , arcl13Ly1 , arcl13Lwei , arcl13Lhei, arcl13Lrot , arcl13Ldeg);
	
	double arcl16x1=300 , arcl16y1=174 , arcl16wei=28 , arcl16hei=28, arcl16rot=90 , arcl16deg=180; 
	Arc arcl16 = new Arc(arcl16x1 , arcl16y1 , arcl16wei , arcl16hei, arcl16rot , arcl16deg);
	
	double arcl14x1=400 , arcl14y1=200 ,arcl14wei=28 , arcl14hei=28, arcl14rot=0 , arcl14deg=180; 
	Arc arcl14 = new Arc(arcl14x1 , arcl14y1 , arcl14wei ,arcl14hei,arcl14rot , arcl14deg);
	
	double arcl13Rx1=374 ,arcl13Ry1=200 ,arcl13Rwei=28 ,arcl13Rhei=28, arcl13Rrot=0 , arcl13Rdeg=180; 
	Arc arcl13R = new Arc(arcl13Rx1 , arcl13Ry1 , arcl13Rwei ,arcl13Rhei,arcl13Rrot , arcl13Rdeg);
	
	double c1x1=165 , c1y1=365 , c1r1=25; 
	Circle circle1 = new Circle(c1x1 , c1y1 ,c1r1);
 
	double c2x1=300 , c2y1=365 , c2r1=25; 
	Circle circle2 = new Circle(c2x1 , c2y1 ,c2r1);
	
	double c3x1=400 , c3y1=365 , c3r1=25; 
	Circle circle3 = new Circle(c3x1 , c3y1 ,c3r1);
	
	double c4x1=665 , c4y1=365 , c4r1=25; 
	Circle circle4 = new Circle(c4x1 , c4y1 ,c4r1);
 
	double l1x1=165, l1y1=340 ,l1x2=165, l1y2=95;
	Line line1 = new Line(l1x1, l1y1 ,l1x2, l1y2);
	
	double l2x1=300, l2y1=275 ,l2x2=300, l2y2=340;
	Line line2 = new Line(l2x1, l2y1 ,l2x2, l2y2);
	
	double l3x1=400, l3y1=275 ,l3x2=400, l3y2=340;
	Line line3 = new Line(l3x1, l3y1 ,l3x2, l3y2);
	
	double l4x1=283, l4y1=275 ,l4x2=317, l4y2=275;
	Line line4 = new Line(l4x1, l4y1 ,l4x2, l4y2);
	
	double l5x1=383, l5y1=275 ,l5x2=417, l5y2=275;
	Line line5 = new Line(l5x1, l5y1 ,l5x2, l5y2);
	
	double l6x1=665, l6y1=340 ,l6x2=665, l6y2=200;
	Line line6 = new Line(l6x1, l6y1 ,l6x2, l6y2);

	double l7x1=165, l7y1=95 ,l7x2=185, l7y2=95;
	Line line7 = new Line(l7x1, l7y1 ,l7x2, l7y2);
	
	double l8x1=185, l8y1=78 ,l8x2=185, l8y2=112;
	Line line8 = new Line(l8x1, l8y1 ,l8x2, l8y2);
	
	double l9x1=185, l9y1=95 ,l9x2=307, l9y2=95;
	Line line9 = new Line(l9x1, l9y1 ,l9x2, l9y2);

	double l10x1=645, l10y1=200 ,l10x2=665, l10y2=200;
	Line line10 = new Line(l10x1, l10y1 ,l10x2, l10y2);
	
	double l11x1=645, l11y1=183 ,l11x2=645, l11y2=217;
	Line line11 = new Line(l11x1, l11y1 ,l11x2, l11y2);
	
	double l12x1=426, l12y1=200 ,l12x2=645, l12y2=200;
	Line line12 = new Line(l12x1, l12y1 ,l12x2, l12y2);
	
	double l13x1=374, l13y1=200 ,l13x2=290, l13y2=200;
	Line line13 = new Line(l13x1, l13y1 ,l13x2, l13y2);
	
	double l14x1=400, l14y1=275 ,l14x2=400, l14y2=190;
	Line line14 = new Line(l14x1, l14y1 ,l14x2, l14y2);
	
	double l15x1=300, l15y1=226 ,l15x2=300, l15y2=275;
	Line line15 = new Line(l15x1, l15y1 ,l15x2, l15y2);
	
	double l16x1=300, l16y1=121 ,l16x2=300, l16y2=174;
	Line line16 = new Line(l16x1, l16y1 ,l16x2, l16y2);
	
	double l17x1=300, l17y1=69 ,l17x2=300, l17y2=50;
	Line line17 = new Line(l17x1, l17y1 ,l17x2, l17y2);
	
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
        line4.setStrokeWidth(5);
     
        line5.setStroke(Color.DIMGRAY);
        line5.setStrokeWidth(5);
     
        line6.setStroke(Color.DIMGRAY);
        line6.setStrokeWidth(3);
       
        line7.setStroke(Color.DIMGRAY);
        line7.setStrokeWidth(3);
       
        line8.setStroke(Color.DIMGRAY);
        line8.setStrokeWidth(5);
      
        line9.setStroke(Color.DIMGRAY);
        line9.setStrokeWidth(5);
       
        line10.setStroke(Color.DIMGRAY);
        line10.setStrokeWidth(3);
       
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
        
        line16.setStroke(Color.DIMGRAY);
        line16.setStrokeWidth(5);
        
        line17.setStroke(Color.DIMGRAY);
        line17.setStrokeWidth(5);
        
        ///////////////////////////////
        
        //DRAWING FILLED CIRCLES
        
        circle1.setFill(Color.GREY);             //SET THE COLOR OF CIRCLE
      
        circle2.setFill(Color.GREY);
        
        circle3.setFill(Color.GREY);
        
        circle4.setFill(Color.GREY);
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
        
        arc3.setType(ArcType.OPEN);
        arc3.setStrokeWidth(5);
        arc3.setStroke(Color.DIMGRAY);
        arc3.setStrokeType(StrokeType.INSIDE);
        arc3.setFill(null);

        arcl9.setType(ArcType.OPEN);
        arcl9.setStrokeWidth(5);
        arcl9.setStroke(Color.RED);
        arcl9.setStrokeType(StrokeType.INSIDE);
        arcl9.setFill(null);
        arcl9.setOpacity(0);
        
        arcl17.setType(ArcType.OPEN);
        arcl17.setStrokeWidth(5);
        arcl17.setStroke(Color.BLUE);
        arcl17.setStrokeType(StrokeType.INSIDE);
        arcl17.setFill(null);
        arcl17.setOpacity(0);
        
        arcl13L.setType(ArcType.OPEN);
        arcl13L.setStrokeWidth(5);
        arcl13L.setStroke(Color.RED);
        arcl13L.setStrokeType(StrokeType.INSIDE);
        arcl13L.setFill(null);
        arcl13L.setOpacity(0);
        
        arcl16.setType(ArcType.OPEN);
        arcl16.setStrokeWidth(5);
        arcl16.setStroke(Color.BLUE);
        arcl16.setStrokeType(StrokeType.INSIDE);
        arcl16.setFill(null);
        arcl16.setOpacity(0);
        
        
        arcl14.setType(ArcType.OPEN);
        arcl14.setStrokeWidth(5);
        arcl14.setStroke(Color.RED);
        arcl14.setStrokeType(StrokeType.INSIDE);
        arcl14.setFill(null);
        arcl14.setOpacity(0);
        
        arcl13R.setType(ArcType.OPEN);
        arcl13R.setStrokeWidth(5);
        arcl13R.setStroke(Color.BLUE);
        arcl13R.setStrokeType(StrokeType.INSIDE);
        arcl13R.setFill(null);
        arcl13R.setOpacity(0);
        
//****************************************************************************************************************************************************************************     
//****************************************************************************************************************************************************************************     
//****************************************************************************************************************************************************************************     

                   
                    
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
          circle1.addEventHandler(MouseEvent.MOUSE_PRESSED,//Creating click
                new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me1) {
                      	  
          if(eventh1==0) {
                     eventh1++;
                     
              Timeline animation1 =
                new Timeline(new KeyFrame(Duration.millis(3), e ->DoubleSideLineYIncL8Lv2() ));
                 animation1.setCycleCount(17);
                 animation1.play();
                     		 
              Timeline animation2 =
                 new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineXDecL9Lv3() ));
                 animation2.setCycleCount(122);
                 animation2.play();

                 Timeline animation11 =
 						new Timeline(new KeyFrame(Duration.millis(3), e ->MoveArcl9LLv2() ));
 						animation11.setCycleCount(195);
 						animation11.play();      		 
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
                    new FadeTransition(Duration.millis(1000), line9);
                    ft5.setToValue(0);
                    ft5.setAutoReverse(false);
                    ft5.setCycleCount(1);
                    ft5.setDelay(Duration.seconds(1));
                		          		
//---------------------------------------------------------------------------------------------------------------------------                         
                                            
                ParallelTransition pt = new ParallelTransition(ft1,ft2,ft3,ft4,ft5);
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
                      Timeline animation1 =
                        new Timeline(new KeyFrame(Duration.millis(3), e ->DoubleSideLineXIncL4Lv2() ));
                         animation1.setCycleCount(17);
                         animation1.play();
                             		 
                      Timeline animation2 =
                         new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineYDecL15Lv2() ));
                         animation2.setCycleCount(49);
                         animation2.play();

					  Timeline animation3 =
					  	 new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineYDecL16Lv2() ));
						 animation3.setCycleCount(108);
						 animation3.play();
						 
						Timeline animation4 =
						new Timeline(new KeyFrame(Duration.millis(3), e ->moveLineYL16Lv2() ));
						animation4.setCycleCount(101);
						animation4.play();
						
											
						Timeline animation5 =
						new Timeline(new KeyFrame(Duration.millis(3), e ->moveLineYL17Lv2() ));
						animation5.setCycleCount(206);
						animation5.play();
					
						Timeline animation6 =
						new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineYDecL17Lv2() ));
						animation6.setCycleCount(195);
						animation6.play();
						
						
						Timeline animation7 =
						new Timeline(new KeyFrame(Duration.millis(3), e ->MoveArc2Lv2() ));
						animation7.setCycleCount(195);
						animation7.play();
						
						
						
						
						Timeline animation9 =
						new Timeline(new KeyFrame(Duration.millis(3), e ->MoveArcl16Lv2() ));
						animation9.setCycleCount(100);
						animation9.play();
						
						
						Timeline animation10 =
						new Timeline(new KeyFrame(Duration.millis(3), e ->MoveArc3Lv2() ));
						animation10.setCycleCount(195);
						animation10.play();
						
						
						
						
						Timeline animation12 =
						new Timeline(new KeyFrame(Duration.millis(3), e ->MoveArcl17Lv2() ));
						animation12.setCycleCount(200);
						animation12.play();
                             		 
//---------------------------------------------------------------------------------------------------------------------------                 
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
                            new FadeTransition(Duration.millis(1000), line15);
                            ft4.setToValue(0);
                            ft4.setAutoReverse(false);
                            ft4.setCycleCount(1);
                            ft4.setDelay(Duration.seconds(1));
                            
                        FadeTransition ft5 = 
                            new FadeTransition(Duration.millis(1000), arc2);
                            ft5.setToValue(0);
                            ft5.setAutoReverse(false);
                            ft5.setCycleCount(1);
                            ft5.setDelay(Duration.seconds(1));
                            
                        FadeTransition ft6 = 
                            new FadeTransition(Duration.millis(1000), line16);
                            ft6.setToValue(0);
                            ft6.setAutoReverse(false);
                            ft6.setCycleCount(1);
                            ft6.setDelay(Duration.seconds(1));
 
 						FadeTransition ft7 = 
 							new FadeTransition(Duration.millis(1000), arc3);
 							ft7.setToValue(0);
 							ft7.setAutoReverse(false);
 							ft7.setCycleCount(1);
 							ft7.setDelay(Duration.seconds(1));
 
 						FadeTransition ft8 = 
 							new FadeTransition(Duration.millis(1000), line17);
 							ft8.setToValue(0);
 							ft8.setAutoReverse(false);
 							ft8.setCycleCount(1);
 							ft8.setDelay(Duration.seconds(1));

//---------------------------------------------------------------------------------------------------------------------------                         
                                                    
                        ParallelTransition pt = new ParallelTransition(ft1,ft2,ft3,ft4,ft5,ft6,ft7,ft8);
                        pt.play();             	
                             		 
                      }
                        } 
                      		});
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
                  circle3.addEventHandler(MouseEvent.MOUSE_PRESSED,
                       new EventHandler<MouseEvent>() {
                       public void handle(MouseEvent me1) {
                                      	  
                          if(eventh3==0) {
                                     eventh3++;
                                     
                       Timeline animation1 =
                       new Timeline(new KeyFrame(Duration.millis(3), e ->OneSideLineYDecL14Lv2() ));
                       animation1.setCycleCount(85);
                       animation1.play();
                                     		 
                       Timeline animation2 =
                       new Timeline(new KeyFrame(Duration.millis(3), e ->DoubleSideLineXIncL5Lv2() ));
                       animation2.setCycleCount(17);
                       animation2.play();
                       
                       
                       Timeline animation6 =
                       new Timeline(new KeyFrame(Duration.millis(4), e ->moveArcL14() ));
                       animation6.setCycleCount(325);
                       animation6.play();
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
                         new FadeTransition(Duration.millis(1000), line14);
                         ft4.setToValue(0);
                         ft4.setAutoReverse(false);
                         ft4.setCycleCount(1);
                         ft4.setDelay(Duration.seconds(1));
                                    
                               
                                		          		
//---------------------------------------------------------------------------------------------------------------------------                         
                                                            
                                ParallelTransition pt = new ParallelTransition(ft1,ft2,ft3,ft4);
                                pt.play();             	
                                     		 
                              }
                                } 
                              		});

//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
        circle4.addEventHandler(MouseEvent.MOUSE_PRESSED,
              new EventHandler<MouseEvent>() {
              public void handle(MouseEvent me1) {
                    	  
        if(eventh4==0) {
                   eventh4++;
                   
            Timeline animation1 =
              new Timeline(new KeyFrame(Duration.millis(4), e ->DoubleSideLineYIncL11Lv3() ));
               animation1.setCycleCount(17);
               animation1.play();
                   		 
            Timeline animation2 =
               new Timeline(new KeyFrame(Duration.millis(4), e ->OneSideLineXDecL12Lv2() ));
               animation2.setCycleCount(218);
               animation2.play();
            
            Timeline animation3 =
            new Timeline(new KeyFrame(Duration.millis(4), e ->moveLineXL13Lv2() ));
            animation3.setCycleCount(271);
            animation3.play();
            
            Timeline animation4 =
            new Timeline(new KeyFrame(Duration.millis(4), e ->OneSideLineXDecL13Lv2() ));
            animation4.setCycleCount(325);
            animation4.play();
            
            Timeline animation5 =
            new Timeline(new KeyFrame(Duration.millis(4), e ->MoveArcR1() ));
            animation5.setCycleCount(260);
            animation5.play();
           
            
            Timeline animation7 =
            new Timeline(new KeyFrame(Duration.millis(4), e ->moveArcL13R() ));
            animation7.setCycleCount(325);
            animation7.play();
            
            Timeline animation8 =
					new Timeline(new KeyFrame(Duration.millis(3), e ->MoveArcl13LLv2() ));
					animation8.setCycleCount(195);
					animation8.play();
                   		 
//---------------------------------------------------------------------------------------------------------------------------                 
//---------------------------------------------------------------------------------------------------------------------------                    
              FadeTransition ft1=
                  new FadeTransition(Duration.millis(1000), circle4 );
                  ft1.setToValue(0);
                  ft1.setAutoReverse(false);
                  ft1.setCycleCount(1);
                  ft1.setDelay(Duration.seconds(1));
                  
              FadeTransition ft2 = 
                  new FadeTransition(Duration.millis(1000), line6);
                  ft2.setToValue(0);
                  ft2.setAutoReverse(false);
                  ft2.setCycleCount(1);
                  ft2.setDelay(Duration.seconds(1));
                  
              FadeTransition ft3 = 
                  new FadeTransition(Duration.millis(1000), line10);
                  ft3.setToValue(0);
                  ft3.setAutoReverse(false);
                  ft3.setCycleCount(1);
                  ft3.setDelay(Duration.seconds(1));
                  
              FadeTransition ft4 = 
                  new FadeTransition(Duration.millis(1000), line11);
                  ft4.setToValue(0);
                  ft4.setAutoReverse(false);
                  ft4.setCycleCount(1);
                  ft4.setDelay(Duration.seconds(1));
                  
              FadeTransition ft5 = 
                  new FadeTransition(Duration.millis(1000), line12);
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
              new FadeTransition(Duration.millis(1000), line13);
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
        root.getChildren().addAll(arc1 ,arc2 ,arc3 ,arcl9,arcl16,arcl13R,arcl14 ,arcl13L,arcl17,line17 ,line16 ,line15 ,line14 ,line13 ,line12 ,line11 ,line10 ,
        		line9 ,line8 ,line7 ,line6 ,line5 ,line4 ,line3 ,line2 ,line1 ,circle1 ,circle2 ,circle3 ,circle4,b);

        
        b.setCenterX(800);
      	 
		b.setCenterY(420);
		b.setRadius(30);
		b.setStroke(Color.BLACK);
		b.setFill(Color.DARKSLATEGREY);
		b.setOnMouseClicked(e -> {

  			
  				
            	
		});
        //SET THE SCENE SIZE
        Scene scene = new Scene(root, 850, 450, Color.WHITESMOKE);

        stage.setTitle("LEVEL 2");
        //stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
//****************************************************************************************************************************************************************************     
//****************************************************************************************************************************************************************************     
//****************************************************************************************************************************************************************************

    public void DoubleSideLineYIncL8Lv2() {collusionl2();
  	   l8y1 -= 1;
  	   l8y2 += 1;
  	   
  		line8.setStartY(l8y1);
  		line8.setEndY(l8y2);
  		}
    
//////////////////////////////////////////////////////   
    
    public void OneSideLineXDecL9Lv3() {collusionl2();
	 	l9x2 -= 1;
		line9.setEndX(l9x2);
		}
    
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////
    public void DoubleSideLineXIncL4Lv2() {collusionl2();
   	   l4x1 -= 1;
   	   l4x2 += 1;
   	   
   		line4.setStartX(l4x1);
   		line4.setEndX(l4x2);
   		}
    
    public void OneSideLineYDecL15Lv2() { collusionl2();
    	l15y1 += 1;
    	line15.setStartY(l15y1);
    }
    
    public void MoveArc2Lv2() { collusionl2();

 	   
 	   if((arc2y1<300) && (arc2y1>=200)) {	  
 		   arc2y1 += 1;
 		   arc2.setCenterY(arc2y1);
 	   }
 	   
 	   if(arc2y1==m1) {
 		  
 		   m1+=1;
 		   arc2deg-=4;
 		   arc2.setLength(arc2deg);}
 		   
 	   
 	   }
 	   
 	   public void MoveArcl13LLv2() { 
 	   
 	   if((arcl13Ly1<300) && (arcl13Ly1>=200)) {collusionl2();	  
 		  arcl13Ly1 += 1;
 		 arcl13L.setCenterY(arcl13Ly1);
 	   }
 	   
 	   /*if(arcl13Ly1==m2) {
 		  
 		   m2+=1;
 		   arcl13Ldeg-=4;
 		  arcl13L.setLength(arcl13Ldeg);}*/
 		   
 	   
 	   }
 	   
 	   public void MoveArcl16Lv2() { 
 	   
 	   if((arcl16y1<300) && (arcl16y1>=174)) {	collusionl2();  
 		  arcl16y1 += 1;
 		 arcl16.setCenterY(arcl16y1);
 	   }
 	   
 	  /* if(arcl16y1==m3) {
 		  
 		   m3+=1;
 		  arcl16deg-=4;
 		  arcl16.setLength(arcl16deg);}*/
 		   
 	   
 	   }
 
 	   
 	   
   
    public void moveLineYL16Lv2() {collusionl2();
	l16y1 += 1;
   	l16y2 += 1;
   	line16.setStartY(l16y1);
	line16.setEndY(l16y2);
	
	
	
	
    }
    
    public void OneSideLineYDecL16Lv2() { collusionl2();
    	if(l16y2>=225)
    	{l16y1 += 1;
    	line16.setStartY(l16y1);
    	}
    }
    
    public void moveLineYL17Lv2() {collusionl2();
    	l17y1 += 1;
       	l17y2 += 1;
       	line17.setStartY(l17y1);
    	line17.setEndY(l17y2);
    	
    	
        }
        
        public void OneSideLineYDecL17Lv2() { collusionl2();
        	if(l17y1>=250) 
        	{l17y2 += 1;
        	line17.setEndY(l17y2);
        	
        	}
        }
        public void MoveArc3Lv2() { collusionl2();

      	   
      	   if((arc3y1<300) && (arc3y1>=95)) {collusionl2();	  
      		   arc3y1 += 1;
      		   arc3.setCenterY(arc3y1);
      	   }
      	   
      	   if(arc3y1==m4) {
      		  
      		   m4+=1;
      		   arc3deg-=4;
      		   arc3.setLength(arc3deg);}
      		   
      	   
      	   }
      	   
      	   public void MoveArcl9LLv2() { 
      	   
      	   if((arcl9y1<300) && (arcl9y1>=95)) {	 collusionl2(); 
      		 arcl9y1 += 1;
      		arcl9.setCenterY(arcl9y1);
      	   }
      	   
      	  /* if(arcl9y1==m5) {
      		  
      		   m5+=1;
      		 arcl9deg-=4;
      		arcl9.setLength(arcl9deg);}*/
      		   
      	   
      	   }
      	   
      	   public void MoveArcl17Lv2() { collusionl2();
      	   
      	   if((arcl17y1<350) && (arcl17y1>=69)) {	  
      		 arcl17y1 += 1;
      		arcl17.setCenterY(arcl17y1);
      	   }
      	   
      	  /* if(arcl17y1==m6) {
      		  
      		   m6+=1;
      		 arcl17deg-=4;
      		arcl17.setLength(arcl17deg);}*/
      		   
      	   
      	   }
      
    

//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////
        
        public void OneSideLineYDecL14Lv2() { collusionl2();
        	l14y2 += 1;
        	line14.setEndY(l14y2);
        }

//////////////////////////////////////////

        public void DoubleSideLineXIncL5Lv2() {collusionl2();
        	l5x1 -= 1;
        	l5x2 += 1;
        	line5.setStartX(l5x1);
        	line5.setEndX(l5x2); 
        }
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////
       
       
        	
        	
        public void DoubleSideLineYIncL11Lv3() {collusionl2();
        	   l11y1 -= 1;
        	   l11y2 += 1;
        	   
        		line11.setStartY(l11y1);
        		line11.setEndY(l11y2);
        		}
        
        public void OneSideLineXDecL12Lv2() { collusionl2();
        	l12x1 += 1;
        	line12.setStartX(l12x1);
        }
        
        public void moveLineXL13Lv2() {collusionl2();
        	l13x1 += 1;
           	l13x2 += 1;
           	line13.setStartX(l13x1);
        	line13.setEndX(l13x2);
        	
            }
       
       public void OneSideLineXDecL13Lv2() {collusionl2(); 
       	if(l13x1>=620) 
       	{l13x2 += 1;
       	line13.setEndX(l13x2);
       	}
       	}
           
       public void MoveArcR1() { collusionl2();
    	  	   if((arc1x1<670) && (arc1x1>=400)) {	 
    		   arc1x1 += 1;
    		   arc1.setCenterX(arc1x1);
    	   }
    	   
    	   if(arc1x1>=620) {
    		  
    		   m7-=1;
    		   arc1deg-=4;
    		   arc1.setLength(arc1deg);}
    	   
    	   }
       
       public void moveArcL14( ) {collusionl2();
 	  

	   if((arcl14x1<670) && (arcl14x1>=400)) {	   
		   arcl14x1 += 1;
		   arcl14.setCenterX(arcl14x1);}
		 //  System.out.println(arc2.getCenterY());
		   }
      
//////////////////////////////////////////
	   
	   public void moveArcL13R( ) {collusionl2();
		   
		   
		   if((arcl13Rx1<600) && (arcl13Rx1>=180)) {	   
			   arcl13Rx1 += 1;
			   arcl13R.setCenterX(arcl13Rx1);
			 //  System.out.println(arc2.getCenterY());
			   }   	
}
    public void collusionl2() {
    if(arcl13L.getCenterY()==arcl16.getCenterY()) {
    		System.exit(0);
    	}
    	if(arcl17.getCenterY()==arcl9.getCenterY()) {
    		System.exit(1);
    	}
    	if(arcl13R.getCenterX()==arcl14.getCenterX()) {
    		System.exit(2);
    	}
    }
}