package irvine.oeis.a143;
// Generated by gen_seq4.pl holos [[0],[-1,4,-6,4,-1],[3,-6],[1]] [0,1] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A143000 a(0) = 0, a(1) = 1, a(n+1) = 3*(2*n+1)*a(n) + n^4*a(n-1).
 * @author Georg Fischer
 */
public class A143000 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A143000() {
    super(0, "[[0],[-1,4,-6,4,-1],[3,-6],[1]]", "[0,1]", 0);
  }
}
