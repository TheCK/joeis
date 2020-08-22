package irvine.oeis.a142;
// Generated by gen_seq4.pl holos [[0],[-1,-2,-1],[-9],[1]] [1,9,85] 2 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A142982 a(1) = 1, a(2) = 9, a(n+2) = 9*a(n+1)+(n+1)^2*a(n).
 * @author Georg Fischer
 */
public class A142982 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A142982() {
    super(1, "[[0],[-1,-2,-1],[-9],[1]]", "[1,9,85]", 2);
  }
}
