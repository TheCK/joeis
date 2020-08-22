package irvine.oeis.a095;
// Generated by gen_seq4.pl seqop a004 A004001 mod(Z.TWO) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a004.A004001;

/**
 * A095901 A004001 (mod 2).
 * @author Georg Fischer
 */
public class A095901 extends A004001 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A095901() {
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
