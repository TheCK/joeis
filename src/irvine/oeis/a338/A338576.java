package irvine.oeis.a338;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007955;

/**
 * A338576 a(n) = n * pod(n) where pod(n) = the product of divisors of n (A007955).
 * @author Georg Fischer
 */
public class A338576 implements Sequence {

  final Sequence mA007955 = new A007955();
  protected long mN;
  /** Construct the sequence. */
  public A338576() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA007955.next());
  }

}
