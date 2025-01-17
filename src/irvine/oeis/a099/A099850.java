package irvine.oeis.a099;
// Generated by gen_seq4.pl partsumm/partsum at 2022-04-12 22:10

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a004.A004648;

/**
 * A099850 Sum of the first n terms of A004648 (the remainder after dividing n-th prime by n).
 * @author Georg Fischer
 */
public class A099850 extends PartialSumSequence {

  /** Construct the sequence. */
  public A099850() {
    super(new A004648());
  }
}
