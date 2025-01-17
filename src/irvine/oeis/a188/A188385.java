package irvine.oeis.a188;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a051.A051903;
/**
 * A188385 Highest exponent in the prime factorization of n^n.
 * @author Georg Fischer
 */
public class A188385 implements Sequence {

  private final Sequence mA051903 = new A051903();
  protected long mN;
  /** Construct the sequence. */
  public A188385() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA051903.next());
  }

}
