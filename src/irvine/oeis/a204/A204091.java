package irvine.oeis.a204;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A204091 The number of 1 X n Haunted Mirror Maze puzzles with a unique solution ending with a mirror.
 * @author Georg Fischer
 */
public class A204091 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A204091() {
    super(0, new long[] {1, -3, 2},
      new long[] {1, -5, 2});
  }
}
