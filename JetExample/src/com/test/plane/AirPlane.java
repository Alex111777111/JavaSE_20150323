package com.test.plane;

import com.test.AirEngine;

public class AirPlane
{
    long x;
    private long y;
    private long z;
    private AirEngine engine;

    public void changeX(long distance) {
        x += distance;
    }
}
