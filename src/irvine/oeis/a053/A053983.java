package irvine.oeis.a053;
// Generated by gen_seq4.pl holos [[0],[1],[1,-2],[1]] [1,1] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A053983 a(n) = (2*n-1)*a(n-1) - a(n-2), a(0)=a(1)=1.
 * @author Georg Fischer
 */
public class A053983 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A053983() {
    super(0, "[[0],[1],[1,-2],[1]]", "[1,1]", 0);
  }
}
