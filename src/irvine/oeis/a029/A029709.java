package irvine.oeis.a029;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029709 Numbers k such that k-th and (k+1)st primes differ by 4.
 * @author Sean A. Irvine
 */
public class A029709 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP0;
  private Z mP1;
  private long mN = 0;
  private int mDist;

  /** Construct the sequence. */
  public A029709() {
    this(4);
  }

  /**
   * Generic constructor with parameters
   * @param dist
   */
  public A029709(final int dist) {
    mDist = dist;
    mP0 = mPrime.nextPrime(Z.TWO);
    mN = 2;
    mP1 = mPrime.nextPrime(mP0);
  }

  @Override
  public Z next() {
    while (!mP0.add(mDist).equals(mP1)) {
      mP0 = mP1;
      ++mN;
      mP1 = mPrime.nextPrime(mP0);
    }
    mP0 = mP1;
    ++mN;
    mP1 = mPrime.nextPrime(mP0);
    return Z.valueOf(mN - 1);
  }
} 
