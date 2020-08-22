package irvine.oeis.a032;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A032194 Number of necklaces with 9 black beads and n-9 white beads.
 * @author Georg Fischer
 */
public class A032194 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A032194() {
    super(9, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 9, -72, 288, -693, 1170, -1656, 
      2205, -2718, 2988, -3042, 2988, -2718, 2205, -1656, 1170, -693, 
      288, -72, 9},
      new long[] {9, -81, 324, -783, 1377, -2106, 3051, -3969, 4455, -4563, 4536, 
      -4293, 3834, -3483, 3483, -3834, 4293, -4536, 4563, -4455, 3969, 
      -3051, 2106, -1377, 783, -324, 81, -9});
  }
}
