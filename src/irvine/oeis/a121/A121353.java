package irvine.oeis.a121;
// Generated by gen_seq4.pl holos [[0],[1],[2,-3],[1]] [0,1] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A121353 a(n) = (3*n - 2)*a(n-1) - a(n-2) starting a(0)=0, a(1)=1.
 * @author Georg Fischer
 */
public class A121353 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A121353() {
    super(0, "[[0],[1],[2,-3],[1]]", "[0,1]", 0);
  }
}
