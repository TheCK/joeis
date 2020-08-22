package irvine.oeis.a235;
// Generated by gen_seq4.pl seqop a027 A027709 add(4) 0 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a027.A027709;

/**
 * A235382 a(n) = smallest number of unit squares required to enclose n units of area.
 * @author Georg Fischer
 */
public class A235382 extends A027709 {
  private int mN = -1;
  
  /** Construct the sequence. */
  public A235382() {
    super();
    int bOffset = -1;
    while (bOffset < mN) {
      ++bOffset;
      super.next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().add(4);
  }
}
