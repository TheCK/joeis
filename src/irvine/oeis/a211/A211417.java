package irvine.oeis.a211;
// Generated by gen_seq4.pl holos at 2021-05-10 22:28
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A211417 Integral factorial ratio sequence: a(n) = (30*n)!*n!/((15*n)!*(10*n)!*(6*n)!).
 * @author Georg Fischer
 */
public class A211417 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A211417() {
    super(0, "[[0],[-3726543300480, 167706236160000,-2023094050560000, 11520990028800000,-36623439014400000, 68780275200000000,-75834662400000000, 45349632000000000,-11337408000000000],[0,-48, 812,-5648, 21057,-45625, 57625,-39375, 11250]]", "[1, 77636318760]", 0);
  }
}
