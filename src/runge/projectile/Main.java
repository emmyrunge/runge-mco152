package runge.projectile;

//import runge.projectile.Projectile;

public class Main
{
    public static void main(String [] args)
    {
        Projectile projectile = new Projectile(39, 77);

        System.out.println("x is: " + projectile.getX() + ", " + "y is: " + projectile.getY());

        projectile.incTime(2);
    }
}
