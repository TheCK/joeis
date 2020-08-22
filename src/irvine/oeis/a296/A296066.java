package irvine.oeis.a296;
// Generated by gen_seq4.pl seqop a296 A296065 divide(mN) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;

/**
 * A296066 a(n) = A296065(n)/n.
 * @author Georg Fischer
 */
public class A296066 extends A296065 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A296066() {
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
    return super.next().divide(mN);
  }
}
