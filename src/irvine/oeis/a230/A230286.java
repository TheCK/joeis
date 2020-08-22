package irvine.oeis.a230;
// Generated by gen_seq4.pl seqop a016 A016052 divide(3) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a016.A016052;

/**
 * A230286 a(n) = A016052(n)/3.
 * @author Georg Fischer
 */
public class A230286 extends A016052 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A230286() {
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
    return super.next().divide(3);
  }
}
