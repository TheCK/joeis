package irvine.oeis.a189;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A189922 Jordan function J_{-4} multiplied by n^4.
 * @author Georg Fischer
 */
public class A189922 implements Sequence {

  protected long mN = 0;
  protected int mExp; // exponent k in "J_k"
  
  /** Construct the sequence. */
  public A189922() {
    this(4);
  }
  
  /** 
   * Constructor with parameter
   * @param exp exponent
   */
  public A189922(final int exp) {
    mExp = exp;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum = sum.add(Z.valueOf(mN).pow(mExp).divide(d.pow(mExp)).multiply(Mobius.mobius(mN / d.longValue())));
    }
    return sum;
  }
}
