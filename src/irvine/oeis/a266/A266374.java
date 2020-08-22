package irvine.oeis.a266;
// Generated by gen_seq4.pl holos [0,3,-2,0,0,0,-2,1] [1,4,10,22,46,96,198] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A266374 G.f. = b(2)*b(6)/(3*x^6-2*x^5-2*x+1), where b(k) = (1-x^k)/(1-x).
 * @author Georg Fischer
 */
public class A266374 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A266374() {
    super(1, "[0,3,-2,0,0,0,-2,1]", "[1,4,10,22,46,96,198]", 0);
  }
}
