package irvine.oeis.a157;
// Generated by gen_seq4.pl holos [[0],[-8],[0],[0],[0],[0],[0],[1]] [1,2,2,3,5,8,8] 6 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A157176 a(n+1) = a(n - n mod 2) + a(n - n mod 3), a(0) = 1.
 * @author Georg Fischer
 */
public class A157176 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A157176() {
    super(1, "[[0],[-8],[0],[0],[0],[0],[0],[1]]", "[1,2,2,3,5,8,8]", 6);
  }
}
