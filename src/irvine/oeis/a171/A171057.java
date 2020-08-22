package irvine.oeis.a171;
// Generated by gen_seq4.pl digexch a000 A000040 10 9 8 at 2020-06-05 15:16
// DO NOT EDIT here!                 rseq   rseqno   base     dig1     dig2

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A171057 In the sequence of prime numbers, replace all the '9' digits with '8' and vice versa.
 * @author Georg Fischer
 */
public class A171057 extends A000040 {

  @Override
  public Z next() {
    return new Z(super.next().toString(10)
        .replace('9', 'a')
        .replace('8', '9')
        .replace('a', '8'), 10);
  }

}
