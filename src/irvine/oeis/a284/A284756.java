package irvine.oeis.a284;
// Generated by gen_seq4.pl holos [[0],[0,-22,66,-44],[0,8,0,56],[-4,-18,-30,-20],[1,3,3,1]] [1,4,28] 1 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A284756 (n + 1)^3*a(n + 1) = 2*(2*n + 1)*(5*n^2 + 5*n + 2)*a(n) - 8*n*(7*n^2 + 1)*a(n - 1) + 22*n*(n - 1)*(2*n - 1)*a(n - 2), with a(0) = 1, a(1) = 4 and a(2) = 28.
 * @author Georg Fischer
 */
public class A284756 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A284756() {
    super(0, "[[0],[0,-22,66,-44],[0,8,0,56],[-4,-18,-30,-20],[1,3,3,1]]", "[1,4,28]", 1);
  }
}
