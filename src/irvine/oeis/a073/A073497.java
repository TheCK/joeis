package irvine.oeis.a073;
// Generated by gen_seq4.pl primen/primenp at 2022-04-02 17:52

import irvine.math.z.Z;
import irvine.oeis.a060.A060822;

/**
 * A073497 a(n) = n^2 - prime(n).
 * @author Georg Fischer
 */
public class A073497 extends A060822 {

  /** Construct the sequence. */
  public A073497() {
    super(1, (n, p) -> Z.valueOf(n).multiply(Z.valueOf(n)).subtract(Z.valueOf(p)));
  }
}
