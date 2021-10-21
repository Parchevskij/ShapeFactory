package ShapeFactory;

public class WhiteTriangle extends Triangle{
    public WhiteTriangle (double s1, double s2, double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        colour = "WHITE";
    }
    public void getArea(){
        /*Use Gorner's formula*/
        double p = (s1+s2+s3) / 2;
        double area = Math.sqrt(p * (p-s1) * (p-s2) * (p-s3));
        System.out.println("White triangle area is " + area);
    }
    public void getPerimeter(){
        double perimeter = s1 + s2 + s3;
        System.out.println("White triangle perimeter is " + perimeter);
    }
    public void getSides(){

        System.out.println(String.format("White triangle sides are %f, %f, %f", s1, s2, s3));
    }
    public void getColour(){

        System.out.println("White triangle colour is white");
    }
}