package irvine.oeis.a133;
// Generated by gen_seq4.pl holos at 2021-05-09 23:36
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A133752 a(n) = 256^n.
 * @author Georg Fischer
 */
public class A133752 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A133752() {
    super(0, "[[0],[-256],[1]]", "[1, 256]", 0);
  }
}
