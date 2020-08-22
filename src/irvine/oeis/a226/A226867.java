package irvine.oeis.a226;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A226867 Number of n X 3 (-1,0,1) arrays of determinants of 2 X 2 subblocks of some (n+1) X 4 binary array with rows and columns of the latter in lexicographically nondecreasing order.
 * @author Georg Fischer
 */
public class A226867 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A226867() {
    super(1, new long[] {0, 7, -47, 205, -550, 1029, -1353, 1280, -857, 409, -136, 34, 
      -2, -1},
      new long[] {1, -12, 66, -220, 495, -792, 924, -792, 495, -220, 66, -12, 1});
  }
}
