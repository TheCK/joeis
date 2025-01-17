package irvine.oeis.a327;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
/**
 * A327493 a(n) = 2^A327492(n).
 * @author Georg Fischer
 */
public class A327493 implements Sequence {

  private final Sequence mA327492 = new A327492();
  @Override
  public Z next() {
    return Z.TWO.pow(mA327492.next());
  }

}
