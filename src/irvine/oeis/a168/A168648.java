package irvine.oeis.a168;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A168648 a(n) = (10*2^n + 2*(-1)^n)/3 for n &gt; 0; a(0) = 1.
 * @author Georg Fischer
 */
public class A168648 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A168648() {
    super(0, new long[] {1, 5, 6},
      new long[] {1, -1, -2});
  }
}
