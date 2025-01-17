package irvine.oeis.a301;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a299.A299921;

/**
 * A301318 a(n) = sqrt(A299921(n)).
 * @author Georg Fischer
 */
public class A301318 implements Sequence {

  final Sequence mA299921 = new A299921();
  @Override
  public Z next() {
    return mA299921.next().sqrt();
  }

}
