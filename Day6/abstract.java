abstract class shape{
    abstract void draw();
}
class rectangle extends shape {
    void draw()
    {
        System.out.println("drawing rectagle");
    }

}
class circle extends shape {
    void draw()
    {
        System.out.println("drawing circle");
    }
}
class testabstract{
    public static void main(String[] args){
        rectangle r=new rectangle();
        r.draw();
        circle c=new circle();
        c.draw();
        shape s=new circle();
        s.draw();
        shape b=new rectangle();
        b.draw();
    }
}
