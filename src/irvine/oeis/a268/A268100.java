package irvine.oeis.a268;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A268100 a(n) = 2^((n-1) mod 2)*5*10^floor((n-1)/2).
 * @author Georg Fischer
 */
public class A268100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268100() {
    super(new long[] {10, 0}, new long[] {10, 50}, 1, 5);
  }
}
