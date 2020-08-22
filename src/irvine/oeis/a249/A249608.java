package irvine.oeis.a249;
// Generated by gen_seq4.pl holos [[0],[42,-77,42,-7],[-176,352,-220,44],[35,-89,72,-18],[3,-10,12,-4],[0,0,-2,1]] [1,1,7,19,115] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A249608 Expansion of e.g.f.: exp(x) * BesselI(0, 2*x) * BesselI(0, 2*sqrt(2)*x).
 * @author Georg Fischer
 */
public class A249608 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A249608() {
    super(0, "[[0],[42,-77,42,-7],[-176,352,-220,44],[35,-89,72,-18],[3,-10,12,-4],[0,0,-2,1]]", "[1,1,7,19,115]", 0);
  }
}
