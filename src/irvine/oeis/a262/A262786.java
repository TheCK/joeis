package irvine.oeis.a262;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A262786 a(n) = 37^(2*n+1).
 * @author Georg Fischer
 */
public class A262786 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A262786() {
    super(0, new long[] {37},
      new long[] {1, -1369});
  }
}
