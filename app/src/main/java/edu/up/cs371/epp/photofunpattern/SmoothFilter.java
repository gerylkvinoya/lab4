package edu.up.cs371.epp.photofunpattern;

import android.graphics.Color;

/**
 *  class SmoothFilter changes the image manipulation behavior of its parent
 *  PhotoFilter to convert the image to gray scale.
 *
 *  @author Edward C. Epp
 *  @version November 2017
 *  https://github.com/edcepp/PhotoFunPattern
 */

public class SmoothFilter extends PhotoFilter {

    /*
    * tranformPixel This method overrides the transformPixel in the parent
    * class. It transforms a color pixel to gray by averaging its three RGB
    * components.
    *
    * @param inPixel is a 32 bit pixel that contains RGB color values
    * @return a new Pixel in which each of the RGB components is their averaged
    * value
    */
    public int transformPixel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {
        int intensity0 = (Color.red(p0) + Color.green(p0) +
                Color.blue(p0)) / 3;
        int intensity1 = (Color.red(p1) + Color.green(p1) +
                Color.blue(p1)) / 3;
        int intensity2 = (Color.red(p2) + Color.green(p2) +
                Color.blue(p2)) / 3;
        int intensity3 = (Color.red(p3) + Color.green(p3) +
                Color.blue(p3)) / 3;
        int intensity4 = (Color.red(p4) + Color.green(p4) +
                Color.blue(p4)) / 3;
        int intensity5 = (Color.red(p5) + Color.green(p5) +
                Color.blue(p5)) / 3;
        int intensity6 = (Color.red(p6) + Color.green(p6) +
                Color.blue(p6)) / 3;
        int intensity7 = (Color.red(p7) + Color.green(p7) +
                Color.blue(p7)) / 3;
        int intensity8 = (Color.red(p8) + Color.green(p8) +
                Color.blue(p8)) / 3;

        int avg = (int) ((.1* intensity0 +.1* intensity1 +.1* intensity2 +.1* intensity3 +.2* intensity4 + .1* intensity5 + .1* intensity6 + .1* intensity7 + .1* intensity8 ));

        return Color.argb(Color.alpha(p4), avg, avg, avg);
    }

}
