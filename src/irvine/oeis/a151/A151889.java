package irvine.oeis.a151;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A151889 a(1)=2, a(2)=3; a(2k-1)=2a(2k-2)+a(2k-3), a(2k)=3a(2k-2)+2a(2k-3), k &gt;= 2.
 * @author Georg Fischer
 */
public class A151889 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A151889() {
    super(1, new long[] {0, -2, -3, 0, -1},
      new long[] {-1, 0, 4, 0, 1});
  }
}
