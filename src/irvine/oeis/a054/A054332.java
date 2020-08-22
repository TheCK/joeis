package irvine.oeis.a054;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A054332 One half of tenth unsigned column of Lanczos triangle A053125 (decreasing powers).
 * @author Georg Fischer
 */
public class A054332 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A054332() {
    super(0, new long[] {5, 240, 2016, 3840, 1280},
      new long[] {1, -40, 720, -7680, 53760, -258048, 860160, -1966080, 2949120, -2621440, 
      1048576});
  }
}
