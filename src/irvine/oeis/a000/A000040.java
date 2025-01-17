package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000040 The prime numbers.
 * @author Sean A. Irvine
 */
public class A000040 implements Sequence {

  private Z mP = Z.ONE;
  protected final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return mP;
  }
}

