package runge.projectile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectileTest
{
    @Test
    public void getX()
    {
        //given
        Projectile projectile = new Projectile(39, 77);

        //when
        projectile.incTime(6);
        double x = projectile.getX();

        //then
        assertEquals(359.0414, x, .0001);
    }

    @Test
    public void getY()
    {
        //given
        Projectile projectile = new Projectile(39, 77);

        //when
        projectile.incTime(6);
        double y = projectile.getY();

        //then
        assertEquals(114.3460, y, .0001);
    }

    //need to test to incTime
    @Test
    public void incTime()
    {
        //given
        Projectile projectile = new Projectile(39, 77);

        //when
        projectile.incTime(6);
        double newTime = projectile.getTime();

        //then
        assertEquals(6, newTime, .0001);

    }

}