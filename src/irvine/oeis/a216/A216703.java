package irvine.oeis.a216;
// Generated by gen_seq4.pl A216703/holos at 2021-11-18 23:22

import irvine.oeis.HolonomicRecurrence;

/**
 * A216703 a(n) = Product_{k=1..n} (49 - 7/k).
 * 7
 * @author Georg Fischer
 */
public class A216703 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A216703() {
    super(0, "[[0],[42, 49],[-1,-1]]", "[1, 42]", 1);
  }
}
