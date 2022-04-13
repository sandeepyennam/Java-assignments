public class Circle {

    public double radius;
    public Circle()
    {
        radius=1.0;
    }
    public Circle(double radius)
         {
             this.radius=radius;
         }

        public double getRadius()
        {
            return radius;
        }

        public double getCircumpherence()
        {
            return 2 * 3.14 *radius;
        }
        public double getarea()
        {
            return 3.14*radius*radius;
        }


}
