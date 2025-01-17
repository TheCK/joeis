package irvine.oeis.a107;
// Generated by gen_seq4.pl seqop a009 A009096 divide(2) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a009.A009096;

/**
 * A107487 Ordered semiperimeters of Pythagorean triangles.
 * @author Georg Fischer
 */
public class A107487 extends A009096 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A107487() {
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
    return super.next().divide(2);
  }
}
