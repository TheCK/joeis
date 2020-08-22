package irvine.oeis.a060;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: -6/sqrt(1-4*x)+(12*cos(arccos(1-(27*x)/2)/6))/sqrt(4-27*x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A060774 a(n) = number of lattice paths from (0,0,0) to (n,n,n) along the cracks on the surface of a Rubik-ized n X n X n cube so that no step increases distance from goal.
 * @author Georg Fischer
 */
public class A060774 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A060774() {
    super(0, "[[0],[72,468,972,648],[-8064,-14694,-8832,-1770],[936,3760,2646,518],[1110,685,66,-13],[-168,-146,-42,-4]]", "[1,6,54,384,2550,16506]", 4);
  }
}
