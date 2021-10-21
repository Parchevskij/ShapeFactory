package ShapeFactory;

public class BlackTriangle extends Triangle{
    public BlackTriangle (double s1, double s2, double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        colour = "BLACK";
    }
    public void getArea(){
        /*Use Gorner's formula*/
        double p = (s1+s2+s3) / 2;
        double area = Math.sqrt(p * (p-s1) * (p-s2) * (p-s3));
        System.out.println("Black triangle area is " + area);
    }
    public void getPerimeter(){
        double perimeter = s1 + s2 + s3;
        System.out.println("Black triangle perimeter is " + perimeter);
    }
    public void getSides(){

        System.out.println(String.format("Black triangle sides are %f, %f, %f", s1, s2, s3));
    }
    public void getColour(){

        System.out.println("Black triangle colour is black");
    }
}