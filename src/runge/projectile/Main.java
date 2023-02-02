package runge.projectile;

//import runge.projectile.Projectile;

public class Main
{
    public static void main(String [] args)
    {
        Projectile projectile = new Projectile(39, 77, 6);

        System.out.println("x is: " + projectile.getX(projectile.incTime(1)) + ", " + "y is: " + projectile.getY(projectile.incTime(1)));
    }
}
