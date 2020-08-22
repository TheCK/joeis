package irvine.oeis.a133;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A133217 Indices of decagonal numbers (A001107) that are also triangular (A000217).
 * @author Georg Fischer
 */
public class A133217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133217() {
    super(new long[] {1, -1, -34, 34, 1}, new long[] {1, 2, 20, 55, 667}, 0);
  }
}
