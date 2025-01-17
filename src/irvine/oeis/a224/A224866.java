package irvine.oeis.a224;
// Generated by gen_seq4.pl dersimple at 2021-08-25 22:45

import irvine.math.z.Z;
import irvine.oeis.a001.A001694;

/**
 * A224866 Numbers of the form m*rad(m)+1, where rad=A007947 (squarefree kernel).
 * @author Georg Fischer
 */
public class A224866 extends A001694 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
