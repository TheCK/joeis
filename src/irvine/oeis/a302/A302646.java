package irvine.oeis.a302;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A302646 Values of unimodal polynomial analogous to A302612 and A302644 arising from a partition size &lt;= 5 restriction.
 * @author Georg Fischer
 */
public class A302646 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A302646() {
    super(0, new long[] {0, 1, -13, 81, -315, 855, -1701, 2583, -2961, 2835, -1365, 2002},
      new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, 
      -1365, 455, -105, 15, -1});
  }
}
