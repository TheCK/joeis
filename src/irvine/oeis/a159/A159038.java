package irvine.oeis.a159;
// Generated by gen_seq4.pl holos at 2021-05-09 23:36
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159038 a(n) = 8 * n!.
 * @author Georg Fischer
 */
public class A159038 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159038() {
    super(1, "[[0],[0,-1],[1]]", "[8, 16]", 0);
  }
}
