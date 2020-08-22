package irvine.oeis.a143;
// Generated by gen_seq4.pl holos [[0],[0,0,0,0,0,0,1],[-13,-27,-3,-2],[1]] [0,1] 1 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A143004 a(0) = 0, a(1) = 1, a(n+1) = (2*n+1)*(n^2+n+13)*a(n) - n^6*a(n-1).
 * @author Georg Fischer
 */
public class A143004 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A143004() {
    super(0, "[[0],[0,0,0,0,0,0,1],[-13,-27,-3,-2],[1]]", "[0,1]", 1);
  }
}
