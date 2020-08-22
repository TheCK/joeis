package irvine.oeis.a211;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A211622 Number of ordered triples (w,x,y) with all terms in {-n,...-1,1,...,n} and w+2x+3y&gt;1.
 * @author Georg Fischer
 */
public class A211622 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A211622() {
    super(0, new long[] {0, 3, 17, 22, 5, 1},
      new long[] {1, -3, 2, 2, -3, 1});
  }
}
