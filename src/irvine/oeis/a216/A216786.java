package irvine.oeis.a216;
// Generated by gen_seq4.pl A216703/holos at 2021-11-18 23:22

import irvine.oeis.HolonomicRecurrence;

/**
 * A216786 a(n) = Product_{k=1..n} (121 - 11/k).
 * 11
 * @author Georg Fischer
 */
public class A216786 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A216786() {
    super(0, "[[0],[110, 121],[-1,-1]]", "[1, 110]", 1);
  }
}
