package irvine.oeis.a201;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A201248 Number of ways to place 7 non-attacking ferses on an n X n board.
 * @author Georg Fischer
 */
public class A201248 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A201248() {
    super(1, new long[] {0, 0, 0, 0, -216, -34830, -766230, -5371278, -10968178, -3590454, 
      5462450, -2525030, 920790, -1066762, 1140350, -734970, 317210, -100242, 
      23430, -3570, 250},
      new long[] {-1, 15, -105, 455, -1365, 3003, -5005, 6435, -6435, 5005, -3003, 
      1365, -455, 105, -15, 1});
  }
}
