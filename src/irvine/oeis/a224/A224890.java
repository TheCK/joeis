package irvine.oeis.a224;
// Generated by gen_seq4.pl dersimple at 2021-08-25 22:45

import irvine.math.z.Z;
import irvine.oeis.a033.A033311;

/**
 * A224890 Positions of incrementally largest terms in continued fraction for Copeland-Erdos constant.
 * @author Georg Fischer
 */
public class A224890 extends A033311 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
