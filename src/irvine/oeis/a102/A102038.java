package irvine.oeis.a102;
// Generated by gen_seq4.pl holos [[0],[-1],[0,-1],[1]] [1,2] 1 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A102038 a(n+1) = n*a(n) + a(n-1), a(1)=1, a(2)=2.
 * @author Georg Fischer
 */
public class A102038 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A102038() {
    super(1, "[[0],[-1],[0,-1],[1]]", "[1,2]", 1);
  }
}
