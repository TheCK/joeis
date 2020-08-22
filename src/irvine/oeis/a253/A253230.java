package irvine.oeis.a253;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A253230 Number of (n+1) X (7+1) 0..1 arrays with every 2 X 2 subblock diagonal minimum minus antidiagonal minimum nondecreasing horizontally and diagonal maximum minus antidiagonal maximum nondecreasing vertically.
 * @author Georg Fischer
 */
public class A253230 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A253230() {
    super(1, new long[] {0, 6740, -24149, 19136, 15840, -27356, 9682, -11, 1},
      new long[] {1, -5, 9, -7, 2});
  }
}
