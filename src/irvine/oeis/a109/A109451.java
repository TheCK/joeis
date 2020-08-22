package irvine.oeis.a109;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A109451 a(1)=1; a(n) = smallest positive integer not already present such that a(n-1) and a(n) have a different number of 1's in their binary expansions.
 * @author Georg Fischer
 */
public class A109451 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A109451() {
    super(1, new long[] {0, 1, 2, -2, 1, 1, 1},
      new long[] {1, -1, -1, 1, 1, -1, -1, 1});
  }
}
