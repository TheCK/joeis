package irvine.oeis.a212;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A212252 Number of (w,x,y,z) with all terms in {1,...,n} and 3w=x+y+z+n+2.
 * @author Georg Fischer
 */
public class A212252 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A212252() {
    super(0, new long[] {0, 0, 0, 3, 2},
      new long[] {1, -3, 3, -2, 3, -3, 1});
  }
}
