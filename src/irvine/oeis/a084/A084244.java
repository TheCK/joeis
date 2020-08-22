package irvine.oeis.a084;
// Generated by gen_seq4.pl holos [0,3,1] [1,5] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A084244 a(0)=1, a(1)=5, a(n) = -3*a(n-1), n&gt;1.
 * @author Georg Fischer
 */
public class A084244 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A084244() {
    super(1, "[0,3,1]", "[1,5]", 0);
  }
}
