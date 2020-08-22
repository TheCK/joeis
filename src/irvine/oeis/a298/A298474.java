package irvine.oeis.a298;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A298474 a(n) is the least k such that A090701(k) = n.
 * @author Georg Fischer
 */
public class A298474 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A298474() {
    super(1, new long[] {0, 1, 1, 3, 1, -1, 1, 1, -1},
      new long[] {1, -1, -1, 1});
  }
}
