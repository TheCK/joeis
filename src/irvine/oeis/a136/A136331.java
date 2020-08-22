package irvine.oeis.a136;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A136331 The discriminant of the characteristic polynomial of the O+ and O- submatrix for spin 3 of the nuclear electric quadrupole Hamiltonian is a perfect square for these values.
 * @author Georg Fischer
 */
public class A136331 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A136331() {
    super(0, new long[] {0, 3, 3, -15, -3},
      new long[] {1, -1, -10, 10, 1, -1});
  }
}
