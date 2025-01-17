package irvine.oeis.a147;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a141.A141479;

/**
 * A147719 A141479(n+1)/3.
 * @author Georg Fischer
 */
public class A147719 implements Sequence {

  final Sequence mA141479 = new A141479();
  /** Construct the sequence. */
  public A147719() {
    mA141479.next();
  }
  
  @Override
  public Z next() {
    return mA141479.next().divide(Z.THREE);
  }

}
