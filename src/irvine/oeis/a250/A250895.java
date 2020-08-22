package irvine.oeis.a250;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A250895 Number of (n+1) X (5+1) 0..2 arrays with nondecreasing x(i,j)-x(i,j-1) in the i direction and nondecreasing absolute value of x(i,j)-x(i-1,j) in the j direction.
 * @author Georg Fischer
 */
public class A250895 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A250895() {
    super(1, new long[] {0, 3673, -33047, 121853, -236349, 251138, -133698, 14708, 21650, 
      -8800},
      new long[] {1, -12, 60, -162, 255, -234, 116, -24});
  }
}
