package irvine.oeis.a113;
// Generated by gen_seq4.pl binom at 2021-08-15 22:50

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A113052 Binomial(5n,n)/(4n+1) mod 5.
 * @author Georg Fischer
 */
public class A113052 implements Sequence {

  protected Z mN;

  /** Construct the sequence. */
  public A113052() {
    mN = Z.valueOf(0 - 1);
  }

  @Override
  public Z next() {
    mN = mN.add(Z.ONE);
    return Binomial.binomial(mN.multiply(5), mN).divide(mN.multiply(4).add(1)).mod(Z.FIVE);
  }
}
