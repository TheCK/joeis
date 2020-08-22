package irvine.oeis.a327;
// Generated by gen_seq4.pl holos [0,-1,5,-10,10,-5,1] [0,0,1,3,12] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A327319 a(n) = binomial(n, 2) + 6*binomial(n, 4).
 * @author Georg Fischer
 */
public class A327319 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A327319() {
    super(1, "[0,-1,5,-10,10,-5,1]", "[0,0,1,3,12]", 0);
  }
}
