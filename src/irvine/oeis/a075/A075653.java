package irvine.oeis.a075;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008472;

/**
 * A075653 a(n) = n + sopf(n), where sopf is the sum of the distinct prime factors of n (A008472).
 * @author Georg Fischer
 */
public class A075653 implements Sequence {

  final Sequence mA008472 = new A008472();
  protected long mN;
  /** Construct the sequence. */
  public A075653() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(mA008472.next());
  }

}
