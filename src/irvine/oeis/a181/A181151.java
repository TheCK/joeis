package irvine.oeis.a181;
// Generated by gen_seq4.pl primen/primenp at 2022-04-02 17:52

import irvine.math.z.Z;
import irvine.oeis.a060.A060822;

/**
 * A181151 a(n) = prime(n)^3 + prime(n)^2 + 1.
 * @author Georg Fischer
 */
public class A181151 extends A060822 {

  /** Construct the sequence. */
  public A181151() {
    super(1, (n, p) -> Z.valueOf(p).pow(Z.THREE).add(Z.valueOf(p).pow(Z.TWO)).add(Z.ONE));
  }
}
