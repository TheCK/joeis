package irvine.oeis.a053;
// Generated by gen_seq4.pl seqop a001 A001065 mod(Z.TWO) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a001.A001065;

/**
 * A053867 Parity of sum of divisors of n less than n.
 * @author Georg Fischer
 */
public class A053867 extends A001065 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A053867() {
    super();
    int bOffset = 0;
    while (bOffset < mN) {
      ++bOffset;
      super.next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().mod(Z.TWO);
  }
}
