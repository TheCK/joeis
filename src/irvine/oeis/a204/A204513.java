package irvine.oeis.a204;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A204513 A204517(n)^2 = floor[A055859(n)/7]: Squares which written in base 7, with some digit appended, yield another square.
 * @author Georg Fischer
 */
public class A204513 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A204513() {
    super(1, new long[] {0, 0, 0, 0, 1, 9, 36, 34, 9, 36, 1},
      new long[] {1, 0, 0, -255, 0, 0, 255, 0, 0, -1});
  }
}
