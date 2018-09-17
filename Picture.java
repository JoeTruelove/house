/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square grass;
    private Circle basketball;
    private Square basketballback;
    private Square basketballpole;
    private Person man;
    private Square basketballnet;
    private Square basketballnet2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        grass = new Square();
        basketball = new Circle();
        basketballback = new Square();
        basketballpole = new Square();
        man = new Person();
        basketballnet = new Square();
        basketballnet2 = new Square();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(-30);
            wall.changeSize(120, 120);
            wall.makeVisible();
            wall.changeColor("blue");
            
            window.changeColor("black");
            window.moveHorizontal(-130);
            window.moveVertical(-10);
            window.changeSize(40, 40);
            window.makeVisible();
            
            basketballpole.changeColor("black");
            basketballpole.makeVisible();
            basketballpole.changeSize(5,  90);
            basketballpole.moveVertical(-10);
            basketballpole.moveHorizontal(150);
            
            basketballback.changeColor("black");
            basketballback.makeVisible();
            basketballback.changeSize(60, 40);
            basketballback.moveHorizontal(123);
            basketballback.moveVertical(-30);
            
            basketballnet.changeColor("white");
            basketballnet.makeVisible();
            basketballnet.changeSize(34, 24);
            basketballnet.moveHorizontal(136);
            basketballnet.moveVertical(-20);
            
            basketballnet2.changeColor("black");
            basketballnet2.makeVisible();
            basketballnet2.changeSize(30, 20);
            basketballnet2.moveHorizontal(138);
            basketballnet2.moveVertical(-18);
            
            basketball.changeColor("red");
            basketball.makeVisible();
            basketball.changeSize(15);
            basketball.moveHorizontal(150);
            
            man.makeVisible();
            man.moveHorizontal(60);
            man.moveVertical(-32);
            
            roof.changeColor("brown");
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-110);
            roof.makeVisible();
            
            grass.changeSize(5000, 5000);
            grass.moveHorizontal(-310);
            grass.moveVertical(80);
            grass.changeColor("green");
            grass.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-90);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
