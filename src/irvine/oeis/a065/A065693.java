package irvine.oeis.a065;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A065693 Braided power sequence: A065692 is b(n+1)=3b(n)+2d(n)-c(n), this is c(n+1)=3c(n)+2b(n)-d(n) and A065694 is d(n+1)=3d(n)+2c(n)-b(n), starting with b(0)=0, c(0)=1 and d(0)=2.
 * @author Georg Fischer
 */
public class A065693 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A065693() {
    super(0, new long[] {1, -8, 25},
      new long[] {1, -9, 33, -52});
  }
}
