package irvine.oeis.a265;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (2*(x^2-x+1))/sqrt((x-1)*(2*x-1)*(2*x^2+x+1))+2*(x^3-x^2-1)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A265118 Number of 3Xn arrays containing n copies of 0..3-1 with row sums equal, column sums equal and full-length antidiagonal sums equal to the short dimension sums.
 * @author Georg Fischer
 */
public class A265118 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A265118() {
    super(1, "[[0],[0,-144,48],[400,120,-184],[-720,692,364],[-720,-1978,-478],[3098,2676,454],[-5796,-3165,-405],[7740,3245,329],[-5714,-2073,-181],[3600,1159,89],[-2700,-732,-48],[840,204,12]]", "[0,0,8,6,10,26,42,70,150,282,506,1002]", 10);
  }
}
