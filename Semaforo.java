

 /** Write a description of class Semaforo here.
 * Dibujo de semaforo sencillo, ahora tambien las luces se apagan y prenden.
 * 
 * @Morales Ruiz Jose Luis
 * @version (28/08/2019)
 */
public class Semaforo
{
   
    private Square cuadrado;
    private Square cuadrado2;
    private Square cuadrado3;
    private Circle yellow;
    private Circle green;
    private Circle red;
    private boolean drawn;
    private int currentColor;
    private int rojo;
    private int amarillo;
    private int verde;
    private int encendido;
    
    

    

    /**
     * Constructor for objects of class Semaforo
     */
    public Semaforo()
    {
        // initialise instance variables
        cuadrado = new Square();
        cuadrado2 = new Square();
        cuadrado3 = new Square(); 
        red = new Circle();
        yellow = new Circle();
        green = new Circle();
        drawn = false;
    
    
    }    
    public void draw(){ 
        if(!drawn)
            rojo = currentColor;
            encendido = 1;
            cuadrado.changeColor("black");
            cuadrado.moveHorizontal(-120);
            cuadrado.moveVertical(80);
            cuadrado.changeSize(80);
            cuadrado.makeVisible();
            
            green.changeColor("green");
            green.moveHorizontal(-40);
            green.moveVertical(110);
            green.changeSize(80);
            green.makeVisible();
            drawn = true;
            
            
            cuadrado2.changeColor("black");
            cuadrado2.moveHorizontal(-120);
            cuadrado2.moveVertical(-5);
            cuadrado2.changeSize(80);
            cuadrado2.makeVisible();
            
            yellow.changeColor("yellow");
            yellow.moveHorizontal(-40);
            yellow.moveVertical(25);
            yellow.changeSize(80);
            yellow.makeVisible();
            
            
            cuadrado3.changeColor("black");
            cuadrado3.moveHorizontal(-120);
            cuadrado3.moveVertical(-90);
            cuadrado3.changeSize(80);
            cuadrado3.makeVisible();
    
          
    
            red.changeColor("red");
            red.moveHorizontal(-40);
            red.moveVertical(-60);
            red.changeSize(80);
            red.makeVisible();
    }
    public void cambiarALuzRoja(){
           if(currentColor == 1){
             red.changeColor("red");
             yellow.changeColor("black");
             green.changeColor("black");
               
            }
        
}
    
    
   public void cambiarALuzAmarilla(){
           if(currentColor == 2){
             red.changeColor("black");
             yellow.changeColor("yellow");
             green.changeColor("black");
               
            }
            }
            public void cambiarALuzVerde(){
           if(currentColor == 3){
             red.changeColor("black");
             yellow.changeColor("black");
             green.changeColor("green");
               
            }
        
}
public void setCurrentColor(int color){
    this.currentColor = color;
}
public int getCurrentColor(){
    return currentColor;
}
        
}



