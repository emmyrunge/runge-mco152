package runge.projectile;

public class Projectile
{
    private final double angle;
    private final double velocity;

    private final double radians;
    private double time = 6;

    public Projectile(double angle, double velocity)
    {
        this.angle = angle;
        this.velocity = velocity;
        this.radians = Math.toRadians(angle);
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

    public double getX()
    {
        return Math.cos(radians) * velocity * time;
    }

    public double getY()
    {
        return Math.sin(radians) * velocity * time - .5 * 9.8 * (time*time);

    }

    public void incTime(double delta)
    {
        this.time += delta;
    }
}

