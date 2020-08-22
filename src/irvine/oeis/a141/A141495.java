package irvine.oeis.a141;
// Generated by gen_seq4.pl holos [[0],[-3],[1]] [1,3,7] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A141495 a(n) = 3*a(n-1) for n&gt;2; a(0)=1, a(1)=3, a(2)=7.
 * @author Georg Fischer
 */
public class A141495 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A141495() {
    super(1, "[[0],[-3],[1]]", "[1,3,7]", 0);
  }
}
