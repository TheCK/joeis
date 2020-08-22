package irvine.oeis.a259;
// Generated by gen_seq4.pl holos [[0],[-1,-1],[1,-2,-2],[0,1]] [1,2] 1 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A259905 n*a(n+1) = (2*n^2+2n-1)*a(n)+(n+1)*a(n-1); a(0)=1, a(1)=2.
 * @author Georg Fischer
 */
public class A259905 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A259905() {
    super(0, "[[0],[-1,-1],[1,-2,-2],[0,1]]", "[1,2]", 1);
  }
}
