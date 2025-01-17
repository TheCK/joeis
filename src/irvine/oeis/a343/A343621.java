package irvine.oeis.a343;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a174.A174973;
/**
 * A343621 Numbers k such that the largest Dyck path of the symmetric representation of sigma(k) does not touch the largest Dyck path of the symmetric representation of sigma(k+1).
 * @author Georg Fischer
 */
public class A343621 implements Sequence {

  private final Sequence mA174973 = new A174973();
  /** Construct the sequence. */
  public A343621() {
    mA174973.next();
  }
  
  @Override
  public Z next() {
    return mA174973.next().subtract(Z.ONE);
  }

}
