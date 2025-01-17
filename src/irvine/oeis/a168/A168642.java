package irvine.oeis.a168;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A168642 a(n) = (8*2^n + (-1)^n)/3 for n &gt; 0; a(0) = 1.
 * @author Georg Fischer
 */
public class A168642 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A168642() {
    super(0, new long[] {1, 4, 4},
      new long[] {1, -1, -2});
  }
}
