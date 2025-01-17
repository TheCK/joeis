package irvine.oeis.a298;
// Generated by gen_seq4.pl holos [[0],[1],[-1],[-3],[3],[3],[-3],[-1],[1]] [0,0,5,12,35,58,112,160] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A298992 a(n) = (2*n-3-(-1)^n)*(22*n^2-21*n+5*n*(-1)^n)/96.
 * @author Georg Fischer
 */
public class A298992 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A298992() {
    super(1, "[[0],[1],[-1],[-3],[3],[3],[-3],[-1],[1]]", "[0,0,5,12,35,58,112,160]", 0);
  }
}
