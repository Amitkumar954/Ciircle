interface i1{
    void make();
}
class Rectangle implements i1{
    public void make(){
        System.out.println("Rectangle");}
}
class Circle implements i1{
    public void make(){
        System.out.println("Circle");}
}
class TestInterface1{
    public static void main(String args[]){
        i1 d=new Circle();
        d.make();
    }
}