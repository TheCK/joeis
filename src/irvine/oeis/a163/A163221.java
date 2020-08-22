package irvine.oeis.a163;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A163221 Number of reduced words of length n in Coxeter group on 38 generators S_i with relations (S_i)^2 = (S_i S_j)^4 = I.
 * @author Georg Fischer
 */
public class A163221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163221() {
    super(new long[] {-666, 36, 36, 36}, new long[] {38, 1406, 52022, 1924111}, 1);
  }
}
