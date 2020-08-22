package irvine.oeis.a065;
// Generated by gen_seq4.pl seqop a002 A002808 mod(Z.valueOf(mN)) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065860 Remainder when the n-th composite number is divided by n.
 * @author Georg Fischer
 */
public class A065860 extends A002808 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A065860() {
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
    return super.next().mod(Z.valueOf(mN));
  }
}
