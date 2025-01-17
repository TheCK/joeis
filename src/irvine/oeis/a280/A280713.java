package irvine.oeis.a280;
// Generated by gen_seq4.pl partsumm/partsum at 2022-04-12 22:10

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a055.A055067;

/**
 * A280713 Partial sums of A055067 where A055067(n) is the product of non-divisors of n.
 * @author Georg Fischer
 */
public class A280713 extends PartialSumSequence {

  /** Construct the sequence. */
  public A280713() {
    super(new A055067());
  }
}
