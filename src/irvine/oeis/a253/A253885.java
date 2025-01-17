package irvine.oeis.a253;
// Generated by gen_seq4.pl dersimple at 2021-08-21 22:23

import irvine.math.z.Z;
import irvine.oeis.a003.A003961;

/**
 * A253885 Permutation of even numbers: a(n) = A003961(n+1) - 1.
 * @author Georg Fischer
 */
public class A253885 extends A003961 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
