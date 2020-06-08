package irvine.oeis.a222;
// Generated by gen_seq4.pl digexch a001 A001477 10 2 4 at 2020-06-05 15:16
// DO NOT EDIT here!                 rseq   rseqno   base     dig1     dig2

import irvine.math.z.Z;
import irvine.oeis.a001.A001477;

/**
 * A222228 In the number n, replace all (decimal) digits <code>'2'</code> with <code>'4'</code> and vice versa.
 * @author Georg Fischer
 */
public class A222228 extends A001477 {

  @Override
  public Z next() {
    return new Z(super.next().toString(10)
        .replace('2', 'a')
        .replace('4', '2')
        .replace('a', '4'), 10);
  }

}
