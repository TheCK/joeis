package irvine.oeis.a277;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A277757 a(n) = 2^(6n+1).
 * @author Georg Fischer
 */
public class A277757 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A277757() {
    super(0, new long[] {2},
      new long[] {1, -64});
  }
}
