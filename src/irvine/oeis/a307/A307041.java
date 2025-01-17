package irvine.oeis.a307;
// Generated by gen_seq4.pl holos [0,7,-21,35,-35,21,-7,1] [1,1,1,1,1,1,1] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A307041 a(n) = Sum_{k=0..floor(n/7)} (-1)^k*binomial(n,7*k).
 * @author Georg Fischer
 */
public class A307041 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307041() {
    super(1, "[0,7,-21,35,-35,21,-7,1]", "[1,1,1,1,1,1,1]", 0);
  }
}
