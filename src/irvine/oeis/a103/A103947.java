package irvine.oeis.a103;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A103947 a(n) is the number of distinct n-th powers of functions {1, 2} -&gt; {1, 2}.
 * @author Georg Fischer
 */
public class A103947 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A103947() {
    super(0, new long[] {1, 4, 2},
      new long[] {1, 0, -1});
  }
}
