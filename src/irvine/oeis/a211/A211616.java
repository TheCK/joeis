package irvine.oeis.a211;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A211616 Number of ordered triples (w,x,y) with all terms in {-n,...-1,1,...,n} and -2&lt;=w+x+y&lt;=2.
 * @author Georg Fischer
 */
public class A211616 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A211616() {
    super(0, new long[] {0, 6, 24, -6, 6},
      new long[] {1, -3, 3, -1});
  }
}
