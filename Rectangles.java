class Rectangle
{
    public void show()
    {
        float len = 7, bre = 4;
	    System.out.println("RECTANGLE: ");
	    area();
        System.out.println(len * bre);
	    peri();
	    System.out.println(2 * (len + bre));
    }

    /*public Rectangle
    {
        this.len=len;
        this.bre=bre;
    }*/
    public static void area()
    {
        System.out.print("Area= ");
	}

	public static void peri()
    {
		System.out.print("Perimeter= ");
	}
}
class Square extends Rectangle
{
    public void shows()
    {
		int sq_size = 4;
		System.out.println(" SQUARE: ");
		area();
		System.out.println(sq_size * sq_size);
		peri();
		System.out.println(sq_size * 2);
	}
}
class Rectangles
{
    public static void main(String arr[])
    {
        Rectangle r = new Rectangle();
        Square s = new Square();
        r.show();
        s.shows();
    }
}