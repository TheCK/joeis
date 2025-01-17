package irvine.oeis.a275;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A275100 Number of set partitions of [3*n] such that within each block the numbers of elements from all residue classes modulo n are equal for n&gt;0, a(0)=1.
 * @author Georg Fischer
 */
public class A275100 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A275100() {
    super(0, new long[] {-1, 5, 7, -21},
      new long[] {-1, 10, -27, 18});
  }
}
