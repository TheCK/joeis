package irvine.oeis.a277;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A277236 Number of strings of length n composed of symbols from the circular list [1,2,3,4] such that adjacent symbols in the string must be adjacent in the list. No runs of length 2 or more are allowed for symbols 1 and 3.
 * @author Georg Fischer
 */
public class A277236 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A277236() {
    super(0, new long[] {1, 3, 2},
      new long[] {1, -1, -4});
  }
}
