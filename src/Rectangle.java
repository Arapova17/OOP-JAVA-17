public class Rectangle {
    private int a;
    private int b;
    private int c;
    private int d;

    public Rectangle(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        System.out.println("S; " + S());
    }

    public int getA(){
        return a;
    }

    public void setA(int a){
        this.a = a;
    }

    public int getB(){
        return b;
    }

    public void setB(int b){
        this.b = b;
    }

    public int getC(){
        return c;
    }

    public void setC(int c){
        this.c = c;
    }

    public int getD(){
        return d;
    }

    public void setD(int d){
        this.d = d;
    }

    private int S(){
        int s;
        s = a * b;
        return s;
    }


}
