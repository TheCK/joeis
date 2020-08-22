package irvine.oeis.a222;
// Generated by gen_seq4.pl digexch a001 A001477 10 2 5 at 2020-06-05 15:16
// DO NOT EDIT here!                 rseq   rseqno   base     dig1     dig2

import irvine.math.z.Z;
import irvine.oeis.a001.A001477;

/**
 * A222229 In the number n, replace all (decimal) digits '2' with '5' and vice versa.
 * @author Georg Fischer
 */
public class A222229 extends A001477 {

  @Override
  public Z next() {
    return new Z(super.next().toString(10)
        .replace('2', 'a')
        .replace('5', '2')
        .replace('a', '5'), 10);
  }

}
