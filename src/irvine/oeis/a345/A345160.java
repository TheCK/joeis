package irvine.oeis.a345;
// Generated by gen_seq4.pl deris at 2021-10-28 23:42
// DO NOT EDIT here!

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a001.A001158;

/**
 * A345160 a(n) = Product_{k=1..n} sigma_3(k).
 *
 * @author Georg Fischer
 */
public class A345160 extends PartialProductSequence {

  /** Construct the sequence. */
  public A345160() {
    super(new A001158());
  }
}
