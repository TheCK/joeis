package irvine.oeis.a137;
// Generated by gen_seq4.pl primen/primenp at 2022-04-02 17:52

import irvine.math.z.Z;
import irvine.oeis.a060.A060822;

/**
 * A137642 a(n) = ((p+1)^(p^2) - 1)/p^3 where p = prime(n).
 * @author Georg Fischer
 */
public class A137642 extends A060822 {

  /** Construct the sequence. */
  public A137642() {
    super(1, (n, p) -> Z.valueOf(p).add(Z.ONE).pow(Z.valueOf(p).pow(Z.TWO)).subtract(Z.ONE).divide(Z.valueOf(p).pow(Z.THREE)));
  }
}
