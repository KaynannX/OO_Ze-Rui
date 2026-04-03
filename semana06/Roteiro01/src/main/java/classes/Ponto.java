
package classes;

public class Ponto {
    private double x;
    private double y;
    
    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
        
    }
    
    public void imprimir(){
        System.out.println("X: "+ this.x +"y: "+ this.y);
    }
    public double distancia(Ponto outro){
        
        double deltaX = outro.getX()- this.x;
        double deltaY = outro.getY()- this.y;
        deltaX = deltaX*deltaX;
        deltaY = deltaY*deltaY;
        double dist = Math.sqrt(deltaX + deltaY);
        return dist;
    }         
            
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
}
