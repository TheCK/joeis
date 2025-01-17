package irvine.oeis.a186;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A186648 Number of walks f length n on a square lattice ending with x &gt; 0 and y &gt; 0.
 * Recurrence: n^2*(n-1)*(75*n-313)*a(n)-2*(334*n^2-1857*n+2052)*(n-1)^2*a(n-1)+8*(68*n^4-1240*n^3+6749*n^2-13464*n+9090)*a(n-2)+32*(300*n^4-2626*n^3+7387*n^2-6699*n-297)*a(n-3)-128*(218*n^2-1444*n+2429)*(-3+n)^2*a(n-4)+512*(2*n-9)*(17*n-105)*(-4+n)^2*a(n-5)=0
 * @author Georg Fischer
 */
public class A186648 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A186648() {
    super(0, "[[0],[-7741440, 6844416,-2249216, 325120,-17408],[2798208,-3528960, 1671040,-352256, 27904],[9504, 214368,-236384, 84032,-9600],[-72720, 107712,-53992, 9920,-544],[4104,-11922, 12200,-5050, 668],[0, 0,-313, 388,-75]]", "0, 0, 2, 6, 38, 130, 662, 2380, 11174, 41226, 185642", 0);
  }
}
