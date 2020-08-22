package irvine.oeis.a170;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A170783 a(n) = n^9*(n + 1)/2.
 * @author Georg Fischer
 */
public class A170783 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A170783() {
    super(0, new long[] {0, 1, 757, 30973, 264409, 689155, 621199, 190783, 16867, 256},
      new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11, -1});
  }
}
