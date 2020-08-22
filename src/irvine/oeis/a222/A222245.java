package irvine.oeis.a222;
// Generated by gen_seq4.pl digexch a001 A001477 10 5 6 at 2020-06-05 15:16
// DO NOT EDIT here!                 rseq   rseqno   base     dig1     dig2

import irvine.math.z.Z;
import irvine.oeis.a001.A001477;

/**
 * A222245 In the number n, replace all (decimal) digits '5' with '6' and vice versa.
 * @author Georg Fischer
 */
public class A222245 extends A001477 {

  @Override
  public Z next() {
    return new Z(super.next().toString(10)
        .replace('5', 'a')
        .replace('6', '5')
        .replace('a', '6'), 10);
  }

}
