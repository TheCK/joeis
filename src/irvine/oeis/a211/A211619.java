package irvine.oeis.a211;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A211619 Number of ordered triples (w,x,y) with all terms in {-n,...-1,1,...,n} and 2w+x+y&gt;2.
 * @author Georg Fischer
 */
public class A211619 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A211619() {
    super(0, new long[] {0, 1, 15, 21, 11, -2, 2},
      new long[] {1, -3, 2, 2, -3, 1});
  }
}
