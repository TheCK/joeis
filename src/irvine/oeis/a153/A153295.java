package irvine.oeis.a153;
// Generated by gen_seq4.pl A137952/A153291 at 2022-03-24 23:20

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A153295 G.f.: A(x) = F(x*G(x)^2) where F(x) = G(x/F(x)) = 1 + x*F(x)^2 is the g.f. of A000108 (Catalan) and G(x) = F(x*G(x)) = 1 + x*G(x)^3 is the g.f. of A001764.
 * @author Georg Fischer
 */
public class A153295 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, mN, k -> Binomial.binomial(2L * k + 1, k).multiply(Binomial.binomial(3L * mN - k, mN - k)).multiply(2L * k).divide(2L * k + 1).divide(3L * mN - k));
  }
}
