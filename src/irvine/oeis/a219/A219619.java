package irvine.oeis.a219;
// Generated by gen_seq4.pl holos at 2021-05-08 19:57
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A219619 a(n) = n! * (n^4 + n^2 + 1).
 * @author Georg Fischer
 */
public class A219619 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A219619() {
    super(0, "[[0],[0,-1,-1,-1],[3,-3, 1]]", "[1, 3]", 0);
  }
}
