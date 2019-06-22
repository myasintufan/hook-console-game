# hook-console-game
puzzle game created with java
In this  project, ı implement the following game by using JavaFX framework. 
In this game, there are lines connected to filled-circles. When a filled-circle is clicked on, then the shape connected to it starts to slide towards to the filled-circle. 
For example, there exists a long horizontal line and a short vertical line connected to the filled-circle. If the user clicks on the filled-circle, the connected line will start to slide towards to the filled-circle and the length of the vertical line becomes bigger while the length of horizontal line becomes shorter and shorter gradually. 
When sliding horizontal line reaches to the vertical line (i.e. connection point), the filled-circle and the part connected to it disappear completely . It should be noted that the thin line connected to the filled circle is irremovable

Semi-Circle 
Semi-circle is one of the important components of the game. When the user clicks on the filledcircle, size of a semi-circle does not change but it also slides with horizontal line towards to the connection point of the filled-circl.  
When it reaches to the connection point, all the shapes will disappear .
Collision 
Main purpose of this game is drawing complex figures and trying to remove all filled-circles without any collision. For this purpose, many filled-circles and their connected parts are drawn in a condition that there exist collisions. User should try to click on filled-circles in a proper order to avoid collision. 
You can see two collision examples in .
Disconnector 
Disconnector disconnects filled-circles from the remaining parts if the position of the purple-colored line inside the connector is on the opposite direction.  
• Dimension of this line can be changed by clicking on it. If the degree of the line is 90 degrees it becomes 180 degrees. In a similar manner, if the degree of the line is 180 degrees it becomes 90 degrees.  
• More than one filled-circle can be connected to the same connector and this connects the filled-circles to their edges having the same direction as the connector line. 
