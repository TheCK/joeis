package irvine.oeis.a038;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A038577 Number of self-avoiding walks of length n from origin in strip Z X {0,1}.
 * @author Georg Fischer
 */
public class A038577 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A038577() {
    super(0, new long[] {1, 2, 0, -1, -1, 0, 0, 1},
      new long[] {1, -1, -3, 2, 3, -1, -1});
  }
}
