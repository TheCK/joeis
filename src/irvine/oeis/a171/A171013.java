package irvine.oeis.a171;
// Generated by gen_seq4.pl digexch a000 A000040 10 1 0 at 2020-06-05 15:16
// DO NOT EDIT here!                 rseq   rseqno   base     dig1     dig2

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A171013 In the sequence of prime numbers, replace all digits '1' with '0' and vice versa.
 * @author Georg Fischer
 */
public class A171013 extends A000040 {

  @Override
  public Z next() {
    return new Z(super.next().toString(10)
        .replace('1', 'a')
        .replace('0', '1')
        .replace('a', '0'), 10);
  }

}
