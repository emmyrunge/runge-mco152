package runge.projectile;

public class Projectile
{
    private final double angle;
    private final double velocity;

    private final double radians;
    private final double time;

    public Projectile(double angle, double velocity, double time)
    {
        this.angle = angle;
        this.velocity = velocity;
        this.radians = Math.toRadians(angle);
        this.time = time;
    }

    public double getAngle()
    {
        return angle;
    }

    public double getVelocity()
    {
        return velocity;
    }
    public double getTime()
    {
        return time;
    }

    public double getX(double time)
    {
        return Math.cos(radians) * velocity * time;
    }

    public double getY(double time)
    {
        return Math.sin(radians) * velocity * time - .5 * 9.8 * Math.pow(time, 2);

    }

    public double incTime(double delta)
    {

        return time*delta;
    }
}


/*
for(int time = 0; time <= 10; time++)
        {
            System.out.println("x is: " + projectile.getX(time) + ", " + "y is: " + projectile.getY(time));
        }
 */
