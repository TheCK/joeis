package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000720;

/**
 * A065133 Remainder when n-th prime is divided by the number of primes not exceeding n.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A065133 extends A065091 {

  private final Sequence mPrimePi = new SkipSequence(new A000720(), 1);

  @Override
  public Z next() {
    return super.next().mod(mPrimePi.next());
  }
}
